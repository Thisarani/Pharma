/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Deleteitem extends javax.swing.JFrame {

    /**
     * Creates new form Deleteitem
     */
    public Deleteitem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dltall = new javax.swing.JButton();
        dltbil = new javax.swing.JButton();
        back = new javax.swing.JButton();
        dlt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Drug Item");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Delete Drug Item");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 230, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Batch No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, 23));

        bno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(bno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 77, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Delete everything");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 123, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Delete bils");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 84, -1));

        dltall.setBackground(new java.awt.Color(255, 255, 255));
        dltall.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dltall.setForeground(new java.awt.Color(255, 0, 0));
        dltall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/remove.png"))); // NOI18N
        dltall.setText("Delete");
        dltall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dltall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dltall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltallActionPerformed(evt);
            }
        });
        jPanel1.add(dltall, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, 40));

        dltbil.setBackground(new java.awt.Color(255, 255, 255));
        dltbil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dltbil.setForeground(new java.awt.Color(255, 0, 0));
        dltbil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/remove.png"))); // NOI18N
        dltbil.setText("Delete");
        dltbil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dltbil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dltbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbilActionPerformed(evt);
            }
        });
        jPanel1.add(dltbil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 120, 40));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/back.png"))); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, 50));

        dlt.setBackground(new java.awt.Color(255, 255, 255));
        dlt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dlt.setForeground(new java.awt.Color(255, 0, 0));
        dlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/remove.png"))); // NOI18N
        dlt.setText("Delete Drug Item");
        dlt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltActionPerformed(evt);
            }
        });
        jPanel1.add(dlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 210, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/Medical-Shop-Software (1).jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, -90, 960, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltActionPerformed
        Add_Drug_Item addnew = new Add_Drug_Item();
        addnew.setBNo(bno.getText());
        String batch = addnew.getBNo();

        if ("".equals(batch)) {
            JOptionPane.showMessageDialog(null, "Please compleat all fields of the form.");
        } else {
            String sql = "DELETE FROM store WHERE BatchNo=?";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                stmt.setString(1, batch);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "You were deleted a drug item successfully.");
            /* Login drugdeleted = new Login();
            drugdeleted.setVisible(true);
            this.dispose();*/
            bno.setText("");
        }
    }//GEN-LAST:event_dltActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Deleteitem loginuser = new Deleteitem();
        MainWindow mw= new   MainWindow(loginuser);
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void dltbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbilActionPerformed

        String sql = "DROP TABLE previousbills";
        String sql2 = "CREATE TABLE `previousbills` (\n" +
        "  `id` int(11) NOT NULL,\n" +
        "  `BatchNo` varchar(6) NOT NULL,\n" +
        "  `GName` varchar(50) DEFAULT NULL,\n" +
        "  `BName` varchar(50) DEFAULT NULL,\n" +
        "  `Qty` int(4) DEFAULT NULL,\n" +
        "  `Exp` date DEFAULT NULL,\n" +
        "  `MRP` double DEFAULT NULL,\n" +
        "  `Amount` double DEFAULT NULL,\n" +
        "  `TotalAmount` double DEFAULT NULL,\n" +
        "  `Date` date DEFAULT NULL,\n" +
        "  `InvoiceNo` int(5) NOT NULL\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
        String sql3 = "ALTER TABLE `previousbills`\n" +
        "  ADD PRIMARY KEY (`id`);";
        String sql4 = "ALTER TABLE `previousbills`\n" +
        "  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;";
        try {
            PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "You were deleted all bills successfully.");
        /* Login drugdeleted = new Login();
        drugdeleted.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_dltbilActionPerformed

    private void dltallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltallActionPerformed
        String sql = "DROP TABLE store";
        String sql2 = "CREATE TABLE `store` (\n" +
        "  `id` int(11) NOT NULL,\n" +
        "  `BatchNo` varchar(6) DEFAULT NULL,\n" +
        "  `GName` varchar(50) DEFAULT NULL,\n" +
        "  `BName` varchar(50) DEFAULT NULL,\n" +
        "  `Qty` int(4) DEFAULT NULL,\n" +
        "  `MRP` double DEFAULT NULL,\n" +
        "  `Exp` date DEFAULT NULL\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
        String sql3 = "ALTER TABLE `store`\n" +
        "  ADD PRIMARY KEY (`id`);";
        String sql4 = "ALTER TABLE `store`\n" +
        "  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;";
        try {
            PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "You were deleted all drug items successfully.");
        /*  Login drugdeleted = new Login();
        drugdeleted.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_dltallActionPerformed

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
            java.util.logging.Logger.getLogger(Deleteitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deleteitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deleteitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deleteitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Deleteitem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField bno;
    private javax.swing.JButton dlt;
    private javax.swing.JButton dltall;
    private javax.swing.JButton dltbil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}