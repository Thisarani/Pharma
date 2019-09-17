/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

/**
 *
 * @author user
 */
public class Add_Drug_Item implements Add_Drug_ItemInterface {
    private String bno;
    private String gname;
    private String bname;
    private String exp;
    private int qty;
    private double mrp;

    @Override
    public String getBNo() {
        return bno;
    }

    @Override
    public void setBNo(String bno) {
        this.bno = bno;
    }

    @Override
    public String getGName() {
        return gname;
    }

    @Override
    public void setGName(String gname) {
        this.gname = gname;
    }

    @Override
    public String getBName() {
        return bname;
    }

    @Override
    public void setBName(String bname) {
        this.bname = bname;
    }

    @Override
    public String getExp() {
        return exp;
    }

    @Override
    public void setExp(String exp) {
        this.exp = exp;
    }

    @Override
    public int getQty() {
        return qty;
    }

    @Override
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public double getMrp() {
        return mrp;
    }

    @Override
    public void setMrp(double mrp) {
        this.mrp = mrp;
    }
    
    
}
