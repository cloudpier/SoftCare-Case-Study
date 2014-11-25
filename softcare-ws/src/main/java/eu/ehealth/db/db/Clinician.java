package eu.ehealth.db.db;

// Generated Oct 1, 2013 11:39:06 AM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;


/**
 * Clinician generated by hbm2java
 */
public class Clinician implements java.io.Serializable
{


	private Integer id;
	private Integer persondata;
	private PersonData m_PersonData;
	private Set CarerAssessments = new HashSet(0);
	private Set Patients = new HashSet(0);


	public Clinician()
	{
	}


	public Clinician(Integer persondata, PersonData m_PersonData, Set CarerAssessments, Set Patients)
	{
		this.persondata = persondata;
		this.m_PersonData = m_PersonData;
		this.CarerAssessments = CarerAssessments;
		this.Patients = Patients;
	}


	public Integer getId()
	{
		return this.id;
	}


	public void setId(Integer id)
	{
		this.id = id;
	}


	public Integer getPersondata()
	{
		return this.persondata;
	}


	public void setPersondata(Integer persondata)
	{
		this.persondata = persondata;
	}


	public PersonData getM_PersonData()
	{
		return this.m_PersonData;
	}


	public void setM_PersonData(PersonData m_PersonData)
	{
		this.m_PersonData = m_PersonData;
	}


	public Set getCarerAssessments()
	{
		return this.CarerAssessments;
	}


	public void setCarerAssessments(Set CarerAssessments)
	{
		this.CarerAssessments = CarerAssessments;
	}


	public Set getPatients()
	{
		return this.Patients;
	}


	public void setPatients(Set Patients)
	{
		this.Patients = Patients;
	}

}
