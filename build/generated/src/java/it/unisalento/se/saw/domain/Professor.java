package it.unisalento.se.saw.domain;
// Generated Aug 2, 2018, 5:57:08 PM by Hibernate Tools 5.2.0.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Professor generated by hbm2java
 */
@Entity
@Table(name="professor"
    ,catalog="uni"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Professor  implements java.io.Serializable {


     private Integer professorId;
     private Person person;
     private String level;
     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Europe/Rome")
     private Date hireDate;
     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Europe/Rome")
     private Date endEngagement;
     private Set<Ticket> tickets = new HashSet<Ticket>(0);
     private Set<Module> modules = new HashSet<Module>(0);

    public Professor() {
    }

	
    public Professor(Person person, String level, Date hireDate) {
        this.person = person;
        this.level = level;
        this.hireDate = hireDate;
    }
    public Professor(Person person, String level, Date hireDate, Date endEngagement, Set<Ticket> tickets, Set<Module> modules) {
       this.person = person;
       this.level = level;
       this.hireDate = hireDate;
       this.endEngagement = endEngagement;
       this.tickets = tickets;
       this.modules = modules;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="professor_id", unique=true, nullable=false)
    public Integer getProfessorId() {
        return this.professorId;
    }
    
    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="person_person_id", nullable=false)
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    
    @Column(name="level", nullable=false, length=45)
    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", nullable=false, length=10)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="end_engagement", length=10)
    public Date getEndEngagement() {
        return this.endEngagement;
    }
    
    public void setEndEngagement(Date endEngagement) {
        this.endEngagement = endEngagement;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="professor")
    public Set<Ticket> getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="professor")
    public Set<Module> getModules() {
        return this.modules;
    }
    
    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }




}


