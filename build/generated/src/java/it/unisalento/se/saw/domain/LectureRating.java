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
 * LectureRating generated by hbm2java
 */
@Entity
@Table(name="lecture_rating"
    ,catalog="mydb"
)
public class LectureRating  implements java.io.Serializable {


     private Integer lectureRatingId;
     private Date date;
     private String note;
     private String rate;
     private int classDayOfWeekClassDayId;

    public LectureRating() {
    }

    public LectureRating(Date date, String note, String rate, int classDayOfWeekClassDayId) {
       this.date = date;
       this.note = note;
       this.rate = rate;
       this.classDayOfWeekClassDayId = classDayOfWeekClassDayId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="lecture_rating_id", unique=true, nullable=false)
    public Integer getLectureRatingId() {
        return this.lectureRatingId;
    }
    
    public void setLectureRatingId(Integer lectureRatingId) {
        this.lectureRatingId = lectureRatingId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", nullable=false, length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="note", nullable=false, length=200)
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    
    @Column(name="rate", nullable=false, length=2)
    public String getRate() {
        return this.rate;
    }
    
    public void setRate(String rate) {
        this.rate = rate;
    }

    
    @Column(name="class_day_of_week_class_day_id", nullable=false)
    public int getClassDayOfWeekClassDayId() {
        return this.classDayOfWeekClassDayId;
    }
    
    public void setClassDayOfWeekClassDayId(int classDayOfWeekClassDayId) {
        this.classDayOfWeekClassDayId = classDayOfWeekClassDayId;
    }




}


