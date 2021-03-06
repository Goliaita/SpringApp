package it.unisalento.se.saw.domain;
// Generated Aug 2, 2018, 5:57:08 PM by Hibernate Tools 5.2.0.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * StudentExam generated by hbm2java
 */
@Entity
@Table(name="student_exam"
    ,catalog="uni"
)
public class StudentExam  implements java.io.Serializable {


     private Integer studentExamId;
     private Exam exam;
     private Student student;
     private Date date;

    public StudentExam() {
    }

    public StudentExam(Exam exam, Student student, Date date) {
       this.exam = exam;
       this.student = student;
       this.date = date;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="student_exam_id", unique=true, nullable=false)
    public Integer getStudentExamId() {
        return this.studentExamId;
    }
    
    public void setStudentExamId(Integer studentExamId) {
        this.studentExamId = studentExamId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="exam_exam_id", nullable=false)
    public Exam getExam() {
        return this.exam;
    }
    
    public void setExam(Exam exam) {
        this.exam = exam;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="student_student_id", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", nullable=false, length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


