package eu.ehealth.db.db;
// Generated Oct 1, 2013 11:39:06 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Questionnaire generated by hbm2java
 */
public class Questionnaire  implements java.io.Serializable {


     private Integer id;
     private BigDecimal version;
     private String title;
     private Set QuestionnaireQuestions = new HashSet(0);
     private Set Tasks = new HashSet(0);

    public Questionnaire() {
    }

    public Questionnaire(BigDecimal version, String title, Set QuestionnaireQuestions, Set Tasks) {
       this.version = version;
       this.title = title;
       this.QuestionnaireQuestions = QuestionnaireQuestions;
       this.Tasks = Tasks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public BigDecimal getVersion() {
        return this.version;
    }
    
    public void setVersion(BigDecimal version) {
        this.version = version;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Set getQuestionnaireQuestions() {
        return this.QuestionnaireQuestions;
    }
    
    public void setQuestionnaireQuestions(Set QuestionnaireQuestions) {
        this.QuestionnaireQuestions = QuestionnaireQuestions;
    }
    public Set getTasks() {
        return this.Tasks;
    }
    
    public void setTasks(Set Tasks) {
        this.Tasks = Tasks;
    }




}


