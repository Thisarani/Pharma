/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Createnewuser extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Createnewuser() {
        initComponents();
        uID.setText(String.valueOf(LoginClass.uId).toString());
userIDlabel.setText(String.valueOf(NewUser.userID).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lnamelabel = new javax.swing.JTextField();
        niclabel = new javax.swing.JTextField();
        fnamelabel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addresslabel = new javax.swing.JTextField();
        userIDlabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        accesslevelcombo = new javax.swing.JComboBox<String>();
        password = new javax.swing.JPasswordField();
        create = new javax.swing.JButton();
        confirmpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        uID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        changepassbtn = new javax.swing.JButton();
        newaccountbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/Medical-Shop-Software (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create New User");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User ID                            :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 200, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password                        :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, -1));

        lnamelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 260, 30));

        niclabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        niclabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niclabelActionPerformed(evt);
            }
        });
        jPanel1.add(niclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 200, 30));

        fnamelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(fnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Access Level                    :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 50));

        addresslabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(addresslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 610, 30));

        userIDlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userIDlabel.setText("jLabel6");
        jPanel1.add(userIDlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 200, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 110, 50));

        accesslevelcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal User", "Admin" }));
        jPanel1.add(accesslevelcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 200, 30));

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 200, 30));

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        create.setForeground(new java.awt.Color(0, 204, 153));
        create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/create.png"))); // NOI18N
        create.setText("Create");
        create.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, 50));

        confirmpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(confirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Confirm the password  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 153));
        jLabel5.setText("Create New User");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 230, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText(" First Name                        :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("User ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NIC                                  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Address                           :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Last Name          :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 230, 40));

        uID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uID.setText("jLabel6");
        jPanel1.add(uID, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 110, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/3.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 840, 445));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/24px-new.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 70, 70));

        changepassbtn.setBackground(new java.awt.Color(255, 255, 255));
        changepassbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changepassbtn.setForeground(new java.awt.Color(0, 204, 153));
        changepassbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/changepassword.png"))); // NOI18N
        changepassbtn.setText("  CHANGE PASSWORD");
        changepassbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        changepassbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changepassbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassbtnActionPerformed(evt);
            }
        });
        getContentPane().add(changepassbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 40));

        newaccountbtn.setBackground(new java.awt.Color(255, 255, 255));
        newaccountbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newaccountbtn.setForeground(new java.awt.Color(0, 204, 153));
        newaccountbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/newuser.png"))); // NOI18N
        newaccountbtn.setText("  CREATE NEW ACCOUNT");
        newaccountbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newaccountbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newaccountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newaccountbtnActionPerformed(evt);
            }
        });
        getContentPane().add(newaccountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, 40));

        logoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(0, 204, 153));
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/logout.png"))); // NOI18N
        logoutbtn.setText("                    LOGOUT");
        logoutbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

        NewUser newuser = new NewUser();

        ConfirmPassword confirm = new ConfirmPassword();

        newuser.setUserLevel(accesslevelcombo.getSelectedItem().toString());
        String user_Level = newuser.getUserLevel();

        newuser.setNic(niclabel.getText());
        String nic = newuser.getNic();

        newuser.setUserFName(fnamelabel.getText());
        String user_FName = newuser.getUserFName();

        newuser.setUserLName(lnamelabel.getText());
        String user_Lname = newuser.getUserLName();

        newuser.setUserAddress(addresslabel.getText());
        String address = newuser.getUserAddress();

        newuser.setUserID(Integer.parseInt(userIDlabel.getText()));
        Integer user_ID = newuser.getUserID();

        newuser.setPass(String.valueOf(password.getPassword()));
        String password = newuser.getPass();

        String confirm_password = String.valueOf(confirmpassword.getPassword());
        
        confirm.setConfirmpass(confirmpassword.getText());

        if (password == "" || confirm_password == "") {
            JOptionPane.showMessageDialog(null, "Please input your username and password");

        } else if (!confirm.confirmpass(password)) {
            JOptionPane.showMessageDialog(null, "Please type the password again.");

        } else {
            String sql1 = "INSERT INTO user_primary_details VALUES (?,?,?,?)";
            String sql2 = "INSERT INTO user_details VALUES (?,?,?,?)";

            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql1);
                stmt.setString(1, nic);
                stmt.setString(2, user_FName);
                stmt.setString(3, user_Lname);
                stmt.setString(4, address);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
                System.out.println("sql2-----------------");
                stmt2.setInt(1, user_ID);
                stmt2.setString(2, password);
                stmt2.setString(3, user_Level);
                stmt2.setString(4, nic);
//            stmt.setString(3, pass);
                stmt2.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Your account created successfully.");
            Login newloginuser = new Login();
            newloginuser.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_createActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Createnewuser loginuser = new Createnewuser();
        MainWindow mw = new MainWindow(loginuser);
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void niclabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niclabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niclabelActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void changepassbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassbtnActionPerformed
        Changepassword CP = new Changepassword();
        CP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassbtnActionPerformed

    private void newaccountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newaccountbtnActionPerformed
        Createnewuser CNU = new Createnewuser();
        CNU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newaccountbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       ViewPreviousBills loginuser = new ViewPreviousBills();
        MainWindow mw = new MainWindow(loginuser);
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Createnewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Createnewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Createnewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Createnewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Createnewuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accesslevelcombo;
    private javax.swing.JTextField addresslabel;
    private javax.swing.JButton changepassbtn;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JButton create;
    private javax.swing.JTextField fnamelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnamelabel;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton newaccountbtn;
    private javax.swing.JTextField niclabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel uID;
    private javax.swing.JLabel userIDlabel;
    // End of variables declaration//GEN-END:variables
}
