package eu.ehealth.db.wservices.users;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import eu.ehealth.Globals;
import eu.ehealth.SystemDictionary;
import eu.ehealth.db.DbStorageComponent;
import eu.ehealth.db.xsd.OperationResult;
import eu.ehealth.util.NullChecker;
import eu.ehealth.util.StorageComponentUtilities;


/**
 * 
 * @author a572832
 *
 */
public class GetUserIdByPatientId extends DbStorageComponent<OperationResult, Object>
{

	
	/**
	 * 
	 * @param session
	 */
	public GetUserIdByPatientId(Session session)
	{
		super(session);
	}

	
	@Override
	protected OperationResult dbStorageFunction(ArrayList<Object> lo)
	{
		try
		{
			String idv = (String) lo.get(0); 
			String userId = (String) lo.get(1);
			
			SystemDictionary.webguiLog("DEBUG", "GetUserIdByPatientId idv   : " + idv);
			SystemDictionary.webguiLog("DEBUG", "GetUserIdByPatientId userId: " + userId);
			
			// DEBUG - TRACE
			if (SystemDictionary.APPLICATION_DEBUG_LEVEL == Level.DEBUG)
				StorageComponentUtilities.trace(Thread.currentThread().getStackTrace());

			OperationResult res = new OperationResult();

			NullChecker nc = new NullChecker();

			idv = nc.check(idv, String.class);
			userId = nc.check(userId, String.class);

			if (!checkUserPermissions(userId, U_SERVICE, U_CARER, U_CLINICIAN, U_ADMIN))
			{
				// set OperationResult values
				return Globals.getOpResult(Globals.ResponseCode.PERMISSION_ERROR.getCode(), "");
			}

			try
			{
				Integer uid = new Integer(idv);

				String sql = "SELECT a.id FROM aladdinuser a LEFT JOIN patient p ON p.persondata = a.personId WHERE p.id = " + uid.toString();
				SQLQuery q = _session.createSQLQuery(sql);
				Object[] obj = q.list().toArray();
				if (obj.length == 1)
				{
					res.setCode(obj[0].toString());
					res.setStatus((short) 1);
					res.setDescription("ok");
				}
				else
				{
					res.setCode("0");
					res.setDescription("none");
					res.setStatus((short) 0);
				}
			}
			catch (HibernateException e)
			{
				SystemDictionary.logException(e);

				// set OperationResult values
				res = Globals.getOpResult(Globals.ResponseCode.DATABASE_ERROR_1.getCode(), " : " + e.toString());
			}

			return res;
		}
		catch (Exception ex)
		{
			SystemDictionary.logException(ex);
			// set OperationResult values
			return Globals.getOpResult(Globals.ResponseCode.UNKNOWN_ERROR.getCode(), " : " + ex.getMessage());
		}
	}
	
	
}
