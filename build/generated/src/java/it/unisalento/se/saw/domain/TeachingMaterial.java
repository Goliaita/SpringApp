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
 * TeachingMaterial generated by hbm2java
 */
@Entity
@Table(name="teaching_material"
    ,catalog="mydb"
)
public class TeachingMaterial  implements java.io.Serializable {


     private Integer techingMaterialId;
     private Date date;
     private byte[] doc;
     private int moduleModuleId;

    public TeachingMaterial() {
    }

    public TeachingMaterial(Date date, byte[] doc, int moduleModuleId) {
       this.date = date;
       this.doc = doc;
       this.moduleModuleId = moduleModuleId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="teching_material_id", unique=true, nullable=false)
    public Integer getTechingMaterialId() {
        return this.techingMaterialId;
    }
    
    public void setTechingMaterialId(Integer techingMaterialId) {
        this.techingMaterialId = techingMaterialId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", nullable=false, length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="doc", nullable=false)
    public byte[] getDoc() {
        return this.doc;
    }
    
    public void setDoc(byte[] doc) {
        this.doc = doc;
    }

    
    @Column(name="module_module_id", nullable=false)
    public int getModuleModuleId() {
        return this.moduleModuleId;
    }
    
    public void setModuleModuleId(int moduleModuleId) {
        this.moduleModuleId = moduleModuleId;
    }




}


