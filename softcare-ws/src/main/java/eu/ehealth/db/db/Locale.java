package eu.ehealth.db.db;
// Generated Oct 1, 2013 11:39:06 AM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Locale generated by hbm2java
 */
public class Locale  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set Translates = new HashSet(0);
     private Set Dicts = new HashSet(0);

    public Locale() {
    }

    public Locale(String name, Set Translates, Set Dicts) {
       this.name = name;
       this.Translates = Translates;
       this.Dicts = Dicts;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getTranslates() {
        return this.Translates;
    }
    
    public void setTranslates(Set Translates) {
        this.Translates = Translates;
    }
    public Set getDicts() {
        return this.Dicts;
    }
    
    public void setDicts(Set Dicts) {
        this.Dicts = Dicts;
    }




}


