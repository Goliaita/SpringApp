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
 * DayOfWeek generated by hbm2java
 */
@Entity
@Table(name="day_of_week"
    ,catalog="uni"
)
public class DayOfWeek  implements java.io.Serializable {


     private Integer dayId;
     private String day;
     private Set<ClassDayOfWeek> classDayOfWeeks = new HashSet<ClassDayOfWeek>(0);

    public DayOfWeek() {
    }

	
    public DayOfWeek(String day) {
        this.day = day;
    }
    public DayOfWeek(String day, Set<ClassDayOfWeek> classDayOfWeeks) {
       this.day = day;
       this.classDayOfWeeks = classDayOfWeeks;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="day_id", unique=true, nullable=false)
    public Integer getDayId() {
        return this.dayId;
    }
    
    public void setDayId(Integer dayId) {
        this.dayId = dayId;
    }

    
    @Column(name="day", nullable=false, length=45)
    public String getDay() {
        return this.day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="dayOfWeek")
    public Set<ClassDayOfWeek> getClassDayOfWeeks() {
        return this.classDayOfWeeks;
    }
    
    public void setClassDayOfWeeks(Set<ClassDayOfWeek> classDayOfWeeks) {
        this.classDayOfWeeks = classDayOfWeeks;
    }




}


