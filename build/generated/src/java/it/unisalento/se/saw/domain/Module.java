package it.unisalento.se.saw.domain;
// Generated Aug 1, 2018, 10:00:00 AM by Hibernate Tools 5.2.0.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Module generated by hbm2java
 */
@Entity
@Table(name="module"
    ,catalog="mydb"
)
public class Module  implements java.io.Serializable {


     private Integer moduleId;
     private int credits;
     private String semester;
     private String title;
     private int courseCourseId;
     private int professorProfessorId;

    public Module() {
    }

    public Module(int credits, String semester, String title, int courseCourseId, int professorProfessorId) {
       this.credits = credits;
       this.semester = semester;
       this.title = title;
       this.courseCourseId = courseCourseId;
       this.professorProfessorId = professorProfessorId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="module_id", unique=true, nullable=false)
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    
    @Column(name="credits", nullable=false)
    public int getCredits() {
        return this.credits;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }

    
    @Column(name="semester", nullable=false, length=45)
    public String getSemester() {
        return this.semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }

    
    @Column(name="title", nullable=false, length=45)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="course_course_id", nullable=false)
    public int getCourseCourseId() {
        return this.courseCourseId;
    }
    
    public void setCourseCourseId(int courseCourseId) {
        this.courseCourseId = courseCourseId;
    }

    
    @Column(name="professor_professor_id", nullable=false)
    public int getProfessorProfessorId() {
        return this.professorProfessorId;
    }
    
    public void setProfessorProfessorId(int professorProfessorId) {
        this.professorProfessorId = professorProfessorId;
    }




}


