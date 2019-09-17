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
public class LoginClass implements LoginInterface{
public static Integer uId;
private String pass;
private String userLevel;


    @Override
    public void setUId(Integer uId) {
       this.uId=uId;
    }

    @Override
    public Integer getUId() {
        return uId;
    }

    @Override
    public void setPass(String pass) {
      this.pass=pass;
    }

    @Override
    public String getPass() {
      return pass;
    }

    @Override
    public String getULevel() {
        return userLevel;
    }

    @Override
    public void setULevel(String userLevel) {
     this.userLevel=userLevel;
    }
    
}
