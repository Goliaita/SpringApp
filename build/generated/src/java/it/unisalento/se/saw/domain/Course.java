package it.unisalento.se.saw.domain;
// Generated Aug 2, 2018, 5:57:08 PM by Hibernate Tools 5.2.0.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name="course"
    ,catalog="uni"
)
public class Course  implements java.io.Serializable {


     private Integer courseId;
     private String name;
     private String description;
     private Set<Module> modules = new HashSet<Module>(0);
     private Set<Student> students = new HashSet<Student>(0);

    public Course() {
    }

	
    public Course(String name) {
        this.name = name;
    }
    public Course(String name, String description, Set<Module> modules, Set<Student> students) {
       this.name = name;
       this.description = description;
       this.modules = modules;
       this.students = students;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="course_id", unique=true, nullable=false)
    public Integer getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", length=200)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Module> getModules() {
        return this.modules;
    }
    
    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }




}


