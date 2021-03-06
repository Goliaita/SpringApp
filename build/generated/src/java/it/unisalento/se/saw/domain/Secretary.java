package it.unisalento.se.saw.domain;
// Generated Aug 2, 2018, 5:57:08 PM by Hibernate Tools 5.2.0.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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

/**
 * Secretary generated by hbm2java
 */
@Entity
@Table(name="secretary"
    ,catalog="uni"
)
public class Secretary  implements java.io.Serializable {


     private Integer secretaryId;
     private Person person;
     private Date hireDate;
     private Date endEngagement;
     private String task;
     private Set<Ticket> tickets = new HashSet<Ticket>(0);

    public Secretary() {
    }

	
    public Secretary(Person person, Date hireDate) {
        this.person = person;
        this.hireDate = hireDate;
    }
    public Secretary(Person person, Date hireDate, Date endEngagement, String task, Set<Ticket> tickets) {
       this.person = person;
       this.hireDate = hireDate;
       this.endEngagement = endEngagement;
       this.task = task;
       this.tickets = tickets;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="secretary_id", unique=true, nullable=false)
    public Integer getSecretaryId() {
        return this.secretaryId;
    }
    
    public void setSecretaryId(Integer secretaryId) {
        this.secretaryId = secretaryId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_person_id", nullable=false)
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
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

    
    @Column(name="task", length=45)
    public String getTask() {
        return this.task;
    }
    
    public void setTask(String task) {
        this.task = task;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="secretary")
    public Set<Ticket> getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }




}


