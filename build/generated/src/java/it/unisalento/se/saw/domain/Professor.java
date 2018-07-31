package it.unisalento.se.saw.domain;
// Generated Jul 31, 2018, 3:49:22 PM by Hibernate Tools 5.2.0.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Professor generated by hbm2java
 */
@Entity
@Table(name="professor"
    ,catalog="mydb"
)
public class Professor  implements java.io.Serializable {


     private Integer professorId;
     private Date endEngagement;
     private Date hireDate;
     private String level;
     private int personPersonId;

    public Professor() {
    }

	
    public Professor(Date hireDate, String level, int personPersonId) {
        this.hireDate = hireDate;
        this.level = level;
        this.personPersonId = personPersonId;
    }
    public Professor(Date endEngagement, Date hireDate, String level, int personPersonId) {
       this.endEngagement = endEngagement;
       this.hireDate = hireDate;
       this.level = level;
       this.personPersonId = personPersonId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="professor_id", unique=true, nullable=false)
    public Integer getProfessorId() {
        return this.professorId;
    }
    
    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="end_engagement", length=10)
    public Date getEndEngagement() {
        return this.endEngagement;
    }
    
    public void setEndEngagement(Date endEngagement) {
        this.endEngagement = endEngagement;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", nullable=false, length=10)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    
    @Column(name="level", nullable=false, length=45)
    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    
    @Column(name="person_person_id", nullable=false)
    public int getPersonPersonId() {
        return this.personPersonId;
    }
    
    public void setPersonPersonId(int personPersonId) {
        this.personPersonId = personPersonId;
    }




}

