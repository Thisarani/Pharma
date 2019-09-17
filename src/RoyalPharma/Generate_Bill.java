/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Generate_Bill extends Bills {
    private String user;
Bills newbill =new Bills();
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public double amount(int qty,double rs, double discount){
        double amount = (rs - discount)*qty;
    return amount;
    }
    public double tot(double a,double b,double c,double d,double e){
        double total=a+b+c+d+e;
    return total;
    }
    
    public int totalQty(int a,int b,int c,int d,int e){
        int total = a+b+c+d+e;
        return total;
    }
    
    public double totDiscount(double a,double b,double c,double d,double e,int q1,int q2,int q3,int q4,int q5){
        double total=(a*q1)+(b*q2)+(c*q3)+(d*q4)+(e*q5);
    return total;
    }
    
    public int billNo(){

       return 0;
        }
    public String date(){
    return newbill.getDate();
    }
}
