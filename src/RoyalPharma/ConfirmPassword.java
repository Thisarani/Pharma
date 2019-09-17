/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import javax.swing.JPasswordField;

/**
 *
 * @author user
 */
public class ConfirmPassword extends LoginClass {

    private String confirmpass;

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public boolean confirmpass(String pass) {
        return confirmpass.equals(pass);
    }

    boolean confirmpass(JPasswordField newpass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
