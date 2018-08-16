package it.unisalento.se.saw.domain;
// Generated Aug 2, 2018, 5:57:08 PM by Hibernate Tools 5.2.0.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TmRating generated by hbm2java
 */
@Entity
@Table(name="tm_rating"
    ,catalog="uni"
)
public class TmRating  implements java.io.Serializable {


     private Integer tmRatingId;
     private TeachingMaterial teachingMaterial;
     private String rate;

    public TmRating() {
    }

    public TmRating(TeachingMaterial teachingMaterial, String rate) {
       this.teachingMaterial = teachingMaterial;
       this.rate = rate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="tm_rating_id", unique=true, nullable=false)
    public Integer getTmRatingId() {
        return this.tmRatingId;
    }
    
    public void setTmRatingId(Integer tmRatingId) {
        this.tmRatingId = tmRatingId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="teaching_material_teching_material_id", nullable=false)
    public TeachingMaterial getTeachingMaterial() {
        return this.teachingMaterial;
    }
    
    public void setTeachingMaterial(TeachingMaterial teachingMaterial) {
        this.teachingMaterial = teachingMaterial;
    }

    
    @Column(name="rate", nullable=false, length=2)
    public String getRate() {
        return this.rate;
    }
    
    public void setRate(String rate) {
        this.rate = rate;
    }




}


