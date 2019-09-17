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
@Table(name = "previousbills", catalog = "royalkmpharmacy", schema = "")
@NamedQueries({
    @NamedQuery(name = "Previousbills.findAll", query = "SELECT p FROM Previousbills p")
    , @NamedQuery(name = "Previousbills.findById", query = "SELECT p FROM Previousbills p WHERE p.id = :id")
    , @NamedQuery(name = "Previousbills.findByBatchNo", query = "SELECT p FROM Previousbills p WHERE p.batchNo = :batchNo")
    , @NamedQuery(name = "Previousbills.findByGName", query = "SELECT p FROM Previousbills p WHERE p.gName = :gName")
    , @NamedQuery(name = "Previousbills.findByBName", query = "SELECT p FROM Previousbills p WHERE p.bName = :bName")
    , @NamedQuery(name = "Previousbills.findByQty", query = "SELECT p FROM Previousbills p WHERE p.qty = :qty")
    , @NamedQuery(name = "Previousbills.findByExp", query = "SELECT p FROM Previousbills p WHERE p.exp = :exp")
    , @NamedQuery(name = "Previousbills.findByMrp", query = "SELECT p FROM Previousbills p WHERE p.mrp = :mrp")
    , @NamedQuery(name = "Previousbills.findByAmount", query = "SELECT p FROM Previousbills p WHERE p.amount = :amount")
    , @NamedQuery(name = "Previousbills.findByTotalAmount", query = "SELECT p FROM Previousbills p WHERE p.totalAmount = :totalAmount")
    , @NamedQuery(name = "Previousbills.findByDate", query = "SELECT p FROM Previousbills p WHERE p.date = :date")
    , @NamedQuery(name = "Previousbills.findByInvoiceNo", query = "SELECT p FROM Previousbills p WHERE p.invoiceNo = :invoiceNo")})
public class Previousbills implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "BatchNo")
    private String batchNo;
    @Column(name = "GName")
    private String gName;
    @Column(name = "BName")
    private String bName;
    @Column(name = "Qty")
    private Integer qty;
    @Column(name = "Exp")
    @Temporal(TemporalType.DATE)
    private Date exp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MRP")
    private Double mrp;
    @Column(name = "Amount")
    private Double amount;
    @Column(name = "TotalAmount")
    private Double totalAmount;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "InvoiceNo")
    private int invoiceNo;

    public Previousbills() {
    }

    public Previousbills(Integer id) {
        this.id = id;
    }

    public Previousbills(Integer id, String batchNo, int invoiceNo) {
        this.id = id;
        this.batchNo = batchNo;
        this.invoiceNo = invoiceNo;
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

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        Date oldExp = this.exp;
        this.exp = exp;
        changeSupport.firePropertyChange("exp", oldExp, exp);
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        Double oldMrp = this.mrp;
        this.mrp = mrp;
        changeSupport.firePropertyChange("mrp", oldMrp, mrp);
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        Double oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        Double oldTotalAmount = this.totalAmount;
        this.totalAmount = totalAmount;
        changeSupport.firePropertyChange("totalAmount", oldTotalAmount, totalAmount);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        int oldInvoiceNo = this.invoiceNo;
        this.invoiceNo = invoiceNo;
        changeSupport.firePropertyChange("invoiceNo", oldInvoiceNo, invoiceNo);
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
        if (!(object instanceof Previousbills)) {
            return false;
        }
        Previousbills other = (Previousbills) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RoyalPharma.Previousbills[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
