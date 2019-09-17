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
public class Store extends Add_Drug_Item{
    Add_Drug_Item newdrug=new Add_Drug_Item();
    public String SearchName(){
    return newdrug.getBName();
    }
    public String Searchexpired(){
    return newdrug.getExp();
    }
}
