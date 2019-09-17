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
public interface Add_Drug_ItemInterface {
    public void setBNo(String bno);
    public void setGName(String gname);
    public void setBName(String bname);
    public void setExp(String exp);
    public void setQty(int qty);
    public void setMrp(double mrp);
    public String getBNo();
    public String getGName();
    public String getBName();
    public String getExp();
    public int getQty();
    public double getMrp();
}
