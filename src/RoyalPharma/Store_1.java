/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Thisarani
 */
@Entity
@Table(name = "store", catalog = "royalkmpharmacy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Store_1.findAll", query = "SELECT s FROM Store_1 s")
    , @NamedQuery(name = "Store_1.findById", query = "SELECT s FROM Store_1 s WHERE s.id = :id")
    , @NamedQuery(name = "Store_1.findByBatchNo", query = "SELECT s FROM Store_1 s WHERE s.batchNo = :batchNo")
    , @NamedQuery(name = "Store_1.findByGName", query = "SELECT s FROM Store_1 s WHERE s.gName = :gName")
    , @NamedQuery(name = "Store_1.findByBName", query = "SELECT s FROM Store_1 s WHERE s.bName = :bName")
    , @NamedQuery(name = "Store_1.findByQty", query = "SELECT s FROM Store_1 s WHERE s.qty = :qty")
    , @NamedQuery(name = "Store_1.findByMrp", query = "SELECT s FROM Store_1 s WHERE s.mrp = :mrp")
    , @NamedQuery(name = "Store_1.findByExp", query = "SELECT s FROM Store_1 s WHERE s.exp = :exp")})
public class Store_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "BatchNo")
    private String batchNo;
    @Column(name = "GName")
    private String gName;
    @Column(name = "BName")
    private String bName;
    @Column(name = "Qty")
    private Integer qty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MRP")
    private Double mrp;
    @Column(name = "Exp")
    @Temporal(TemporalType.DATE)
    private Date exp;

    public Store_1() {
    }

    public Store_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        String oldBatchNo = this.batchNo;
        this.batchNo = batchNo;
        changeSupport.firePropertyChange("batchNo", oldBatchNo, batchNo);
    }

    public String getGName() {
        return gName;
    }

    public void setGName(String gName) {
        String oldGName = this.gName;
        this.gName = gName;
        changeSupport.firePropertyChange("GName", oldGName, gName);
    }

    public String getBName() {
        return bName;
    }

    public void setBName(String bName) {
        String oldBName = this.bName;
        this.bName = bName;
        changeSupport.firePropertyChange("BName", oldBName, bName);
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        Integer oldQty = this.qty;
        this.qty = qty;
        changeSupport.firePropertyChange("qty", oldQty, qty);
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        Double oldMrp = this.mrp;
        this.mrp = mrp;
        changeSupport.firePropertyChange("mrp", oldMrp, mrp);
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        Date oldExp = this.exp;
        this.exp = exp;
        changeSupport.firePropertyChange("exp", oldExp, exp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store_1)) {
            return false;
        }
        Store_1 other = (Store_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RoyalPharma.Store_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
