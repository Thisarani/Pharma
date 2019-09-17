/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import java.awt.event.KeyEvent;;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Thisarani
 */
public class MainWindow extends javax.swing.JFrame {

    static Integer userId;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    public MainWindow(LoginClass user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(user.getUId().toString());
        userId = user.getUId();
        boolean isUser = true;

        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";

        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }

                datelbl.setText((java.time.LocalDate.now()).toString());

            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public MainWindow(Additems user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(userId.toString());

        boolean isUser = true;
        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";

        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }
                datelbl.setText((java.time.LocalDate.now()).toString());
            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public MainWindow(Changepassword user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(userId.toString());

        boolean isUser = true;
        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";
        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }
                datelbl.setText((java.time.LocalDate.now()).toString());
            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public MainWindow(Createnewuser user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(userId.toString());

        boolean isUser = true;
        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";
        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }
                datelbl.setText((java.time.LocalDate.now()).toString());
            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public MainWindow(Deleteitem user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(userId.toString());

        boolean isUser = true;
        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";
        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }
                datelbl.setText((java.time.LocalDate.now()).toString());
            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public MainWindow(ViewPreviousBills user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(userId.toString());

        boolean isUser = true;
        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";
        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }
                datelbl.setText((java.time.LocalDate.now()).toString());
            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    public MainWindow(ViewStock user) {
        Generate_Bill newbill = new Generate_Bill();

        initComponents();
        cnamelab.setText(userId.toString());

        boolean isUser = true;
        String sql1 = "SELECT item_name FROM medicine_name WHERE item_id_fk=?";
        for (int id = 1; isUser; id++) {
            isUser = false;
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, id);
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String iname = rs1.getString("item_name");
                    icb1.addItem(iname);
                    icb2.addItem(iname);
                    icb3.addItem(iname);
                    icb4.addItem(iname);
                    icb5.addItem(iname);
                    isUser = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";

            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));

                }
                datelbl.setText((java.time.LocalDate.now()).toString());

            } catch (SQLException ex) {
                ex.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton15 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cnamelab = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        itxt1 = new javax.swing.JTextField();
        itxt2 = new javax.swing.JTextField();
        itxt3 = new javax.swing.JTextField();
        itxt4 = new javax.swing.JTextField();
        itxt5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        icb1 = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        icb2 = new javax.swing.JComboBox<String>();
        icb3 = new javax.swing.JComboBox<String>();
        icb4 = new javax.swing.JComboBox<String>();
        icb5 = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        blbl1 = new javax.swing.JLabel();
        blbl2 = new javax.swing.JLabel();
        blbl3 = new javax.swing.JLabel();
        blbl4 = new javax.swing.JLabel();
        blbl5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        glbl1 = new javax.swing.JLabel();
        glbl2 = new javax.swing.JLabel();
        glbl3 = new javax.swing.JLabel();
        glbl4 = new javax.swing.JLabel();
        glbl5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qty1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        qty4 = new javax.swing.JTextField();
        qty2 = new javax.swing.JTextField();
        qty3 = new javax.swing.JTextField();
        qty5 = new javax.swing.JTextField();
        additembutn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dlbl1 = new javax.swing.JLabel();
        dlbl2 = new javax.swing.JLabel();
        dlbl3 = new javax.swing.JLabel();
        dlbl4 = new javax.swing.JLabel();
        dlbl5 = new javax.swing.JLabel();
        rslab5 = new javax.swing.JLabel();
        blab3 = new javax.swing.JLabel();
        blab4 = new javax.swing.JLabel();
        amountlab5 = new javax.swing.JLabel();
        blab5 = new javax.swing.JLabel();
        blab1 = new javax.swing.JLabel();
        blab2 = new javax.swing.JLabel();
        rslab2 = new javax.swing.JLabel();
        rslab3 = new javax.swing.JLabel();
        rslab4 = new javax.swing.JLabel();
        rslab1 = new javax.swing.JLabel();
        amountlab1 = new javax.swing.JLabel();
        amountlab2 = new javax.swing.JLabel();
        amountlab3 = new javax.swing.JLabel();
        amountlab4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        viewbills = new javax.swing.JButton();
        viewstock = new javax.swing.JButton();
        deleteitembutn = new javax.swing.JButton();
        newaccountbtn = new javax.swing.JButton();
        changepassbtn = new javax.swing.JButton();
        remove2 = new javax.swing.JButton();
        remove3 = new javax.swing.JButton();
        remove5 = new javax.swing.JButton();
        remove4 = new javax.swing.JButton();
        remove1 = new javax.swing.JButton();
        billingbtn = new javax.swing.JButton();
        totbtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        totallab = new javax.swing.JLabel();
        disclab = new javax.swing.JLabel();
        qtylab = new javax.swing.JLabel();
        billnumlab = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("CHANGE PASSWORD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Royal KM Pharmacy ");
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cashier's  ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 37, -1, 30));

        cnamelab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(cnamelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 34, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Item ID:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        itxt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itxt1KeyTyped(evt);
            }
        });
        getContentPane().add(itxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        itxt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itxt2KeyTyped(evt);
            }
        });
        getContentPane().add(itxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));

        itxt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itxt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itxt3KeyTyped(evt);
            }
        });
        getContentPane().add(itxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 207, 70, -1));

        itxt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itxt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itxt4KeyTyped(evt);
            }
        });
        getContentPane().add(itxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 247, 70, -1));

        itxt5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itxt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itxt5KeyTyped(evt);
            }
        });
        getContentPane().add(itxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 287, 70, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Item Name:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        icb1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        icb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Name" }));
        icb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                icb1ItemStateChanged(evt);
            }
        });
        getContentPane().add(icb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 130, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Discount:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 88, 70, -1));

        icb2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        icb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Name" }));
        icb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                icb2ItemStateChanged(evt);
            }
        });
        getContentPane().add(icb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 169, 100, 20));

        icb3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        icb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Name" }));
        icb3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                icb3ItemStateChanged(evt);
            }
        });
        getContentPane().add(icb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 209, 100, -1));

        icb4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        icb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Name" }));
        icb4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                icb4ItemStateChanged(evt);
            }
        });
        getContentPane().add(icb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 248, 100, -1));

        icb5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        icb5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Name" }));
        icb5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                icb5ItemStateChanged(evt);
            }
        });
        getContentPane().add(icb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 288, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Brand Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 84, 100, 25));

        blbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blbl1.setText("Brand Name");
        getContentPane().add(blbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 130, 110, 20));

        blbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blbl2.setText("Brand Name");
        getContentPane().add(blbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 170, 110, 20));

        blbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blbl3.setText("Brand Name");
        getContentPane().add(blbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 210, 110, 20));

        blbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blbl4.setText("Brand Name");
        getContentPane().add(blbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 250, 110, 20));

        blbl5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        blbl5.setText("Brand Name");
        getContentPane().add(blbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 290, 110, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Generic Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 84, 110, 25));

        glbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        glbl1.setText("Generic Name");
        getContentPane().add(glbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, 20));

        glbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        glbl2.setText("Generic Name");
        getContentPane().add(glbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 110, 20));

        glbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        glbl3.setText("Generic Name");
        getContentPane().add(glbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 110, 20));

        glbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        glbl4.setText("Generic Name");
        getContentPane().add(glbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, 20));

        glbl5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        glbl5.setText("Generic Name");
        getContentPane().add(glbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Qty:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 50, -1));

        qty1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty1ActionPerformed(evt);
            }
        });
        qty1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty1KeyTyped(evt);
            }
        });
        getContentPane().add(qty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Expiry Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 88, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Price:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(931, 90, 80, -1));

        qty4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty4ActionPerformed(evt);
            }
        });
        qty4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty4KeyTyped(evt);
            }
        });
        getContentPane().add(qty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 70, -1));

        qty2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty2ActionPerformed(evt);
            }
        });
        qty2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty2KeyTyped(evt);
            }
        });
        getContentPane().add(qty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 70, -1));

        qty3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty3ActionPerformed(evt);
            }
        });
        qty3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty3KeyTyped(evt);
            }
        });
        getContentPane().add(qty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 70, -1));

        qty5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty5ActionPerformed(evt);
            }
        });
        qty5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty5KeyTyped(evt);
            }
        });
        getContentPane().add(qty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 70, -1));

        additembutn.setBackground(new java.awt.Color(255, 255, 255));
        additembutn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        additembutn.setForeground(new java.awt.Color(102, 102, 255));
        additembutn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/additems.png"))); // NOI18N
        additembutn.setText("    ADD ITEMS ");
        additembutn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        additembutn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        additembutn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additembutnActionPerformed(evt);
            }
        });
        getContentPane().add(additembutn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, 160, 58));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Bill Date:");
        jLabel2.setName(""); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 37, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Bill Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 30));

        dlbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlbl1.setText("000/00/00");
        getContentPane().add(dlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 130, 100, 20));

        dlbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlbl2.setText("000/00/00");
        getContentPane().add(dlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 100, -1));

        dlbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlbl3.setText("000/00/00");
        getContentPane().add(dlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 100, -1));

        dlbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlbl4.setText("000/00/00");
        getContentPane().add(dlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 100, -1));

        dlbl5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dlbl5.setText("000/00/00");
        getContentPane().add(dlbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 287, 100, 20));

        rslab5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rslab5.setText("0");
        getContentPane().add(rslab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 290, 80, 23));

        blab3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blab3.setText("0");
        getContentPane().add(blab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 70, 20));

        blab4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blab4.setText("0");
        getContentPane().add(blab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 70, 23));

        amountlab5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountlab5.setText("0");
        amountlab5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountlab5KeyTyped(evt);
            }
        });
        getContentPane().add(amountlab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 290, 90, 23));

        blab5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blab5.setText("0");
        getContentPane().add(blab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 70, 23));

        blab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blab1.setText("0");
        getContentPane().add(blab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 70, 23));

        blab2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        blab2.setText("0");
        getContentPane().add(blab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 70, 23));

        rslab2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rslab2.setText("0");
        getContentPane().add(rslab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 170, 80, 23));

        rslab3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rslab3.setText("0");
        getContentPane().add(rslab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 210, 80, 23));

        rslab4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rslab4.setText("0");
        getContentPane().add(rslab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 250, 80, 23));

        rslab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rslab1.setText("0");
        getContentPane().add(rslab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 90, 23));

        amountlab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountlab1.setText("0");
        getContentPane().add(amountlab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 130, 90, 23));

        amountlab2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountlab2.setText("0");
        amountlab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountlab2KeyTyped(evt);
            }
        });
        getContentPane().add(amountlab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 170, 90, 23));

        amountlab3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountlab3.setText("0");
        amountlab3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountlab3KeyTyped(evt);
            }
        });
        getContentPane().add(amountlab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 210, 90, 23));

        amountlab4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountlab4.setText("0");
        amountlab4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountlab4KeyTyped(evt);
            }
        });
        getContentPane().add(amountlab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 250, 90, 23));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewbills.setBackground(new java.awt.Color(255, 255, 255));
        viewbills.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewbills.setForeground(new java.awt.Color(102, 102, 255));
        viewbills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/viewbills.png"))); // NOI18N
        viewbills.setText("DAILY REPORT");
        viewbills.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewbills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewbills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbillsActionPerformed(evt);
            }
        });
        jPanel1.add(viewbills, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 270, 160, 58));

        viewstock.setBackground(new java.awt.Color(255, 255, 255));
        viewstock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewstock.setForeground(new java.awt.Color(102, 102, 255));
        viewstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/viewimage.png"))); // NOI18N
        viewstock.setText("  VIEW STOCK");
        viewstock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewstock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstockActionPerformed(evt);
            }
        });
        jPanel1.add(viewstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 200, 160, 58));

        deleteitembutn.setBackground(new java.awt.Color(255, 255, 255));
        deleteitembutn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteitembutn.setForeground(new java.awt.Color(102, 102, 255));
        deleteitembutn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/remove.png"))); // NOI18N
        deleteitembutn.setText("DELETE ITEMS");
        deleteitembutn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteitembutn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteitembutn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitembutnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteitembutn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, 160, 58));

        newaccountbtn.setBackground(new java.awt.Color(255, 255, 255));
        newaccountbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newaccountbtn.setForeground(new java.awt.Color(102, 102, 255));
        newaccountbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/newuser.png"))); // NOI18N
        newaccountbtn.setText("CREATE NEW ACCOUNT");
        newaccountbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newaccountbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newaccountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newaccountbtnActionPerformed(evt);
            }
        });
        jPanel1.add(newaccountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 390, 180, 40));

        changepassbtn.setBackground(new java.awt.Color(255, 255, 255));
        changepassbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changepassbtn.setForeground(new java.awt.Color(102, 102, 255));
        changepassbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/changepassword.png"))); // NOI18N
        changepassbtn.setText("CHANGE PASSWORD");
        changepassbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        changepassbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changepassbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassbtnActionPerformed(evt);
            }
        });
        jPanel1.add(changepassbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 340, 180, 40));

        remove2.setBackground(new java.awt.Color(255, 255, 255));
        remove2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove2.setForeground(new java.awt.Color(102, 102, 255));
        remove2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/deleteitems.png"))); // NOI18N
        remove2.setText("REMOVE");
        remove2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove2ActionPerformed(evt);
            }
        });
        jPanel1.add(remove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 100, 30));

        remove3.setBackground(new java.awt.Color(255, 255, 255));
        remove3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove3.setForeground(new java.awt.Color(102, 102, 255));
        remove3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/deleteitems.png"))); // NOI18N
        remove3.setText("REMOVE ");
        remove3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove3ActionPerformed(evt);
            }
        });
        jPanel1.add(remove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 100, 30));

        remove5.setBackground(new java.awt.Color(255, 255, 255));
        remove5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove5.setForeground(new java.awt.Color(102, 102, 255));
        remove5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/deleteitems.png"))); // NOI18N
        remove5.setText("REMOVE ");
        remove5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove5ActionPerformed(evt);
            }
        });
        jPanel1.add(remove5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 100, 30));

        remove4.setBackground(new java.awt.Color(255, 255, 255));
        remove4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove4.setForeground(new java.awt.Color(102, 102, 255));
        remove4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/deleteitems.png"))); // NOI18N
        remove4.setText("REMOVE");
        remove4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove4ActionPerformed(evt);
            }
        });
        jPanel1.add(remove4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 100, 30));

        remove1.setBackground(new java.awt.Color(255, 255, 255));
        remove1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove1.setForeground(new java.awt.Color(102, 102, 255));
        remove1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/deleteitems.png"))); // NOI18N
        remove1.setText("REMOVE");
        remove1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove1ActionPerformed(evt);
            }
        });
        jPanel1.add(remove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 100, 30));

        billingbtn.setBackground(new java.awt.Color(255, 255, 255));
        billingbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        billingbtn.setForeground(new java.awt.Color(102, 102, 255));
        billingbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/billing.png"))); // NOI18N
        billingbtn.setText("BILLING");
        billingbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        billingbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingbtnActionPerformed(evt);
            }
        });
        jPanel1.add(billingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, 40));

        totbtn.setBackground(new java.awt.Color(255, 255, 255));
        totbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totbtn.setForeground(new java.awt.Color(102, 102, 255));
        totbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/total.png"))); // NOI18N
        totbtn.setText("TOTAL");
        totbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        totbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totbtnActionPerformed(evt);
            }
        });
        jPanel1.add(totbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 110, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Total Amount  :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Total Qty  :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Total Discount :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 120, -1));

        totallab.setBackground(new java.awt.Color(255, 255, 255));
        totallab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totallab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totallab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(totallab, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 100, 30));

        disclab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disclab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(disclab, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 100, 20));

        qtylab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qtylab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(qtylab, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 100, 20));

        billnumlab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(billnumlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 70, 30));

        datelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 140, 30));
        datelbl.getAccessibleContext().setAccessibleName("billdate");

        logoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(102, 102, 255));
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/logout.png"))); // NOI18N
        logoutbtn.setText("       LOGOUT");
        logoutbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 440, 180, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoyalPharma/Medical-Shop-Software (1)_1.jpg"))); // NOI18N
        jLabel11.setText("00");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1440, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void qty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty1ActionPerformed

    private void remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove1ActionPerformed

        icb1.setSelectedIndex(0);
        glbl1.setText("Generic Name");
        blbl1.setText("Brand Name");
        itxt1.setText("");
        dlbl1.setText("000/00/00");
        blab1.setText("0");
        qty1.setText("");
        rslab1.setText("0");
        amountlab1.setText("0");
    }//GEN-LAST:event_remove1ActionPerformed

    private void qty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty4ActionPerformed

    private void remove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove3ActionPerformed

        icb3.setSelectedIndex(0);
        glbl3.setText("Generic Name");
        blbl3.setText("Brand Name");
        itxt3.setText("");
        dlbl3.setText("000/00/00");
        blab3.setText("0");
        qty3.setText("");
        rslab3.setText("0");
        amountlab3.setText("0");

    }//GEN-LAST:event_remove3ActionPerformed

    private void qty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty2ActionPerformed

    private void qty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty3ActionPerformed

    private void qty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty5ActionPerformed

    private void remove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove2ActionPerformed

        icb2.setSelectedIndex(0);
        glbl2.setText("Generic Name");
        blbl2.setText("Brand Name");
        itxt2.setText("");
        dlbl2.setText("000/00/00");
        blab2.setText("0");
        qty2.setText("");
        rslab2.setText("0");
        amountlab2.setText("0");
    }//GEN-LAST:event_remove2ActionPerformed

    private void remove4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove4ActionPerformed
        icb4.setSelectedIndex(0);
        glbl4.setText("Generic Name");
        blbl4.setText("Brand Name");
        itxt4.setText("");
        dlbl4.setText("000/00/00");
        blab4.setText("0");
        qty4.setText("");
        rslab4.setText("0");
        amountlab4.setText("0");

    }//GEN-LAST:event_remove4ActionPerformed

    private void remove5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove5ActionPerformed

        icb5.setSelectedIndex(0);
        glbl5.setText("Generic Name");
        blbl5.setText("Brand Name");
        itxt5.setText("");
        dlbl5.setText("000/00/00");
        blab5.setText("0");
        qty5.setText("");
        rslab5.setText("0");
        amountlab5.setText("0");

    }//GEN-LAST:event_remove5ActionPerformed

    private void viewbillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbillsActionPerformed
        ViewPreviousBills vb = new ViewPreviousBills();
        vb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewbillsActionPerformed

    private void additembutnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additembutnActionPerformed
        Additems AI = new Additems();
        AI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_additembutnActionPerformed

    private void deleteitembutnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitembutnActionPerformed
        Deleteitem DI = new Deleteitem();
        DI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteitembutnActionPerformed

    private void viewstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstockActionPerformed
        ViewStock VS = new ViewStock();
        VS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewstockActionPerformed

    private void billingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingbtnActionPerformed

        
        String sql = "INSERT INTO `bill_details` VALUES (?,?,?,?,?)";
        
          try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                stmt.setInt(1, Integer.parseInt(billnumlab.getText()));
                stmt.setDouble(2, Double.parseDouble(totallab.getText()));
                stmt.setInt(3, Integer.parseInt(qtylab.getText()));
                stmt.setDouble(4, Double.parseDouble(disclab.getText()));
                stmt.setDate(5, java.sql.Date.valueOf(java.time.LocalDate.now()));
                
                stmt.executeUpdate();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        
        qtylab.setText("");
        disclab.setText("");
        totallab.setText("");

        JOptionPane.showMessageDialog(null, "Bill has been generated!");

        icb1.setSelectedIndex(0);
        glbl1.setText("Generic Name");
        blbl1.setText("Brand Name");
        itxt1.setText("");
        dlbl1.setText("000/00/00");
        blab1.setText("0");
        qty1.setText("");
        rslab1.setText("0");
        amountlab1.setText("0");

        icb2.setSelectedIndex(0);
        glbl2.setText("Generic Name");
        blbl2.setText("Brand Name");
        itxt2.setText("");
        dlbl2.setText("000/00/00");
        blab2.setText("0");
        qty2.setText("");
        rslab2.setText("0");
        amountlab2.setText("0");

        icb3.setSelectedIndex(0);
        glbl3.setText("Generic Name");
        blbl3.setText("Brand Name");
        itxt3.setText("");
        dlbl3.setText("000/00/00");
        blab3.setText("0");
        qty3.setText("");
        rslab3.setText("0");
        amountlab3.setText("0");

        icb4.setSelectedIndex(0);
        glbl4.setText("Generic Name");
        blbl4.setText("Brand Name");
        itxt4.setText("");
        dlbl4.setText("000/00/00");
        blab4.setText("0");
        qty4.setText("");
        rslab4.setText("0");
        amountlab4.setText("0");

        icb5.setSelectedIndex(0);
        glbl5.setText("Generic Name");
        blbl5.setText("Brand Name");
        itxt5.setText("");
        dlbl5.setText("000/00/00");
        blab5.setText("0");
        qty5.setText("");
        rslab5.setText("0");
        amountlab5.setText("0");
        
        

        /*    boolean isUser = true;
         String sql1 = "INSERT INTO previousbills(BatchNo,GName,BName,Qty,Exp,MRP,Amount,TotalAmount,Date,InvoiceNo) VAlUES (?,?,?,?,?,?,?,?,'2017-08-16',?)";
         String Gcb1=gcb1.getSelectedItem().toString();
         String Bcb1=bcb1.getSelectedItem().toString();
         String Dcb1=dcb1.getSelectedItem().toString();
         String Blab1 =blab1.getText();
         int Qty1 =Integer.parseInt(qty1.getText());
         double Rslab1 = Double.parseDouble(rslab1.getText());
         double Amountlab1 =Double.parseDouble(amountlab1.getText()); 
         double Totallab =Double.parseDouble(totallab.getText()); 
         int Billnumlab = Integer.parseInt(billnumlab.getText());
         boolean isUser2 = true;
         String sql2 = "INSERT INTO previousbills(BatchNo,GName,BName,Qty,Exp,MRP,Amount,TotalAmount,Date,InvoiceNo) VAlUES (?,?,?,?,?,?,?,?,'2017-08-16',?)";
         String Gcb2=gcb2.getSelectedItem().toString();
         String Bcb2=bcb2.getSelectedItem().toString();
         String Dcb2=dcb2.getSelectedItem().toString();
         String Blab2 =blab2.getText();
         int Qty2 =Integer.parseInt(qty2.getText());
         double Rslab2 = Double.parseDouble(rslab2.getText());
         double Amountlab2 =Double.parseDouble(amountlab2.getText()); 
         boolean isUser3 = true;
         String sql3 = "INSERT INTO previousbills(BatchNo,GName,BName,Qty,Exp,MRP,Amount,TotalAmount,Date,InvoiceNo) VAlUES (?,?,?,?,?,?,?,?,'2017-08-16',?)";
         String Gcb3=gcb3.getSelectedItem().toString();
         String Bcb3=bcb3.getSelectedItem().toString();
         String Dcb3=dcb3.getSelectedItem().toString();
         String Blab3 =blab3.getText();
         int Qty3 =Integer.parseInt(qty3.getText());
         double Rslab3 = Double.parseDouble(rslab3.getText());
         double Amountlab3 =Double.parseDouble(amountlab3.getText());
         boolean isUser4 = true;
         String sql4 = "INSERT INTO previousbills(BatchNo,GName,BName,Qty,Exp,MRP,Amount,TotalAmount,Date,InvoiceNo) VAlUES (?,?,?,?,?,?,?,?,'2017-08-16',?)";
         String Gcb4=gcb4.getSelectedItem().toString();
         String Bcb4=bcb4.getSelectedItem().toString();
         String Dcb4=dcb4.getSelectedItem().toString();
         String Blab4 =blab4.getText();
         int Qty4 =Integer.parseInt(qty4.getText());
         double Rslab4 = Double.parseDouble(rslab4.getText());
         double Amountlab4 =Double.parseDouble(amountlab4.getText()); 
         boolean isUser5 = true;
         String sql5 = "INSERT INTO previousbills(BatchNo,GName,BName,Qty,Exp,MRP,Amount,TotalAmount,Date,InvoiceNo) VAlUES (?,?,?,?,?,?,?,?,'2017-08-16',?)";
         String Gcb5=gcb5.getSelectedItem().toString();
         String Bcb5=bcb5.getSelectedItem().toString();
         String Dcb5=dcb5.getSelectedItem().toString();
         String Blab5 =blab5.getText();
         int Qty5 =Integer.parseInt(qty5.getText());
         double Rslab5 = Double.parseDouble(rslab5.getText());
         double Amountlab5 =Double.parseDouble(amountlab5.getText()); 
         String sqlqty1 = "SELECT Qty FROM store WHERE GName=? AND BName=? AND Exp=?";
         int maxqty1 = 0;
         try {
         //sql1
         PreparedStatement stmt11 = DbConnect.getConnection().prepareStatement(sqlqty1);
         stmt11.setString(1, Gcb1);
         stmt11.setString(2, Bcb1);
         stmt11.setString(3, Dcb1);
         ResultSet rs1 = stmt11.executeQuery();
         if (rs1.next()) {
         maxqty1 = rs1.getInt("Qty");
         System.out.println(rs1.getInt("Qty"));
         if(maxqty1<Qty1){
         JOptionPane.showMessageDialog(null, "Your stock haven't enough "+Bcb1+" content.");
         }else{

             
         for (int id = 1; isUser; id++) {
         isUser = false;
         try {
         //sql1
         PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
         stmt1.setString(1, Blab1);
         stmt1.setString(2, Gcb1);
         stmt1.setString(3, Bcb1);
         stmt1.setInt(4, Qty1);
         stmt1.setString(5, Dcb1);
         stmt1.setDouble(6, Rslab1);
         stmt1.setDouble(7, Amountlab1);
         stmt1.setDouble(8, Totallab);
         stmt1.setInt(9, Billnumlab);
         stmt1.executeUpdate();

         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         }
         }  
         }
         }catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }


         String sqlqty2 = "SELECT Qty FROM store WHERE GName=? AND BName=? AND Exp=?";
         int maxqty2 = 0;
         try {
         //sql1
         PreparedStatement stmt22 = DbConnect.getConnection().prepareStatement(sqlqty2);
         stmt22.setString(1, Gcb2);
         stmt22.setString(2, Bcb2);
         stmt22.setString(3, Dcb2);
         ResultSet rs2 = stmt22.executeQuery();
         if (rs2.next()) {
         maxqty2 = rs2.getInt("Qty");
         System.out.println(rs2.getInt("Qty"));
         if(maxqty2<Qty2){
         JOptionPane.showMessageDialog(null, "Your stock haven't enough "+Bcb2+" content.");
         }else{

             
         for (int id = 1; isUser2; id++) {
         isUser2 = false;
         try {
         //sql1
         PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
         stmt2.setString(1, Blab2);
         stmt2.setString(2, Gcb2);
         stmt2.setString(3, Bcb2);
         stmt2.setInt(4, Qty2);
         stmt2.setString(5, Dcb2);
         stmt2.setDouble(6, Rslab2);
         stmt2.setDouble(7, Amountlab2);
         stmt2.setDouble(8, Totallab);
         stmt2.setInt(9, Billnumlab);
         stmt2.executeUpdate();

         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         }
         }  
         }
         }catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
 
         String sqlqty3 = "SELECT Qty FROM store WHERE GName=? AND BName=? AND Exp=?";
         int maxqty3 = 0;
         try {
         //sql1
         PreparedStatement stmt33 = DbConnect.getConnection().prepareStatement(sqlqty3);
         stmt33.setString(1, Gcb3);
         stmt33.setString(2, Bcb3);
         stmt33.setString(3, Dcb3);
         ResultSet rs3 = stmt33.executeQuery();
         if (rs3.next()) {
         maxqty3 = rs3.getInt("Qty");
         System.out.println(rs3.getInt("Qty"));
         if(maxqty3<Qty3){
         JOptionPane.showMessageDialog(null, "Your stock haven't enough "+Bcb3+" content.");
         }else{
         for (int id = 1; isUser3; id++) {
         isUser3 = false;
         try {
         //sql3
         PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql3);
         stmt2.setString(1, Blab3);
         stmt2.setString(2, Gcb3);
         stmt2.setString(3, Bcb3);
         stmt2.setInt(4, Qty3);
         stmt2.setString(5, Dcb3);
         stmt2.setDouble(6, Rslab3);
         stmt2.setDouble(7, Amountlab3);
         stmt2.setDouble(8, Totallab);
         stmt2.setInt(9, Billnumlab);
         stmt2.executeUpdate();

         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         }
         }  
         }
         }catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         String sqlqty4 = "SELECT Qty FROM store WHERE GName=? AND BName=? AND Exp=?";
         int maxqty4 = 0;
         try {
         //sql1
         PreparedStatement stmt44 = DbConnect.getConnection().prepareStatement(sqlqty3);
         stmt44.setString(1, Gcb4);
         stmt44.setString(2, Bcb4);
         stmt44.setString(3, Dcb4);
         ResultSet rs4 = stmt44.executeQuery();
         if (rs4.next()) {
         maxqty3 = rs4.getInt("Qty");
         System.out.println(rs4.getInt("Qty"));
         if(maxqty4<Qty4){
         JOptionPane.showMessageDialog(null, "Your stock haven't enough "+Bcb4+" content.");
         }else{
   
         for (int id = 1; isUser4; id++) {
         isUser4 = false;
         try {
         //sql4
         PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql4);
         stmt2.setString(1, Blab4);
         stmt2.setString(2, Gcb4);
         stmt2.setString(3, Bcb4);
         stmt2.setInt(4, Qty4);
         stmt2.setString(5, Dcb4);
         stmt2.setDouble(6, Rslab4);
         stmt2.setDouble(7, Amountlab4);
         stmt2.setDouble(8, Totallab);
         stmt2.setInt(9, Billnumlab);
         stmt2.executeUpdate();

         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         }
         }  
         }
         }catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         String sqlqty5 = "SELECT Qty FROM store WHERE GName=? AND BName=? AND Exp=?";
         int maxqty5 = 0;
         try {
         //sql1
         PreparedStatement stmt55 = DbConnect.getConnection().prepareStatement(sqlqty5);
         stmt55.setString(1, Gcb5);
         stmt55.setString(2, Bcb5);
         stmt55.setString(3, Dcb5);
         ResultSet rs5 = stmt55.executeQuery();
         if (rs5.next()) {
         maxqty5 = rs5.getInt("Qty");
         System.out.println(rs5.getInt("Qty"));
         if(maxqty5<Qty5){
         JOptionPane.showMessageDialog(null, "Your stock haven't enough "+Bcb5+" content.");
         }else{
                
         for (int id = 1; isUser5; id++) {
         isUser5 = false;
         try {
         //sql5
         PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql5);
         stmt2.setString(1, Blab5);
         stmt2.setString(2, Gcb5);
         stmt2.setString(3, Bcb5);
         stmt2.setInt(4, Qty5);
         stmt2.setString(5, Dcb5);
         stmt2.setDouble(6, Rslab5);
         stmt2.setDouble(7, Amountlab5);
         stmt2.setDouble(8, Totallab);
         stmt2.setInt(9, Billnumlab);
         stmt2.executeUpdate();

         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         }
         }  
         }
         }catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         if(maxqty2>Qty2 || maxqty1>Qty1 || maxqty3>Qty3 || maxqty4>Qty4 || maxqty5>Qty5 ){
         int newqty1 = maxqty1 - Qty1;
         int newqty2 = maxqty2 - Qty2;
         int newqty3 = maxqty3 - Qty3;
         int newqty4 = maxqty4 - Qty4;
         int newqty5 = maxqty5 - Qty5;
               
         String sql = "UPDATE store SET Qty =? WHERE GName=? and Bname=? and Exp=?";
         try {
         PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
         stmt.setInt(1, newqty1);
         stmt.setString(2, Gcb1);
         stmt.setString(3, Bcb1);
         stmt.setString(4, Dcb1);
         stmt.executeUpdate();


         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         String sq2 = "UPDATE store SET Qty =? WHERE GName=? and Bname=? and Exp=?";
         try {
         PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sq2);
         stmt.setInt(1, newqty2);
         stmt.setString(2, Gcb2);
         stmt.setString(3, Bcb2);
         stmt.setString(4, Dcb2);
         stmt.executeUpdate();


         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         String sq3 = "UPDATE store SET Qty =? WHERE GName=? and Bname=? and Exp=?";
         try {
         PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sq3);
         stmt.setInt(1, newqty3);
         stmt.setString(2, Gcb3);
         stmt.setString(3, Bcb3);
         stmt.setString(4, Dcb3);
         stmt.executeUpdate();


         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         String sq4 = "UPDATE store SET Qty =? WHERE GName=? and Bname=? and Exp=?";
         try {
         PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sq4);
         stmt.setInt(1, newqty4);
         stmt.setString(2, Gcb4);
         stmt.setString(3, Bcb4);
         stmt.setString(4, Dcb4);
         stmt.executeUpdate();


         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         String sq5 = "UPDATE store SET Qty =? WHERE GName=? and Bname=? and Exp=?";
         try {
         PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sq5);
         stmt.setInt(1, newqty5);
         stmt.setString(2, Gcb5);
         stmt.setString(3, Bcb5);
         stmt.setString(4, Dcb5);
         stmt.executeUpdate();


         } catch (SQLException ex) {
         ex.printStackTrace();
         } catch (Exception e) {
         e.printStackTrace();
         }
         int newbill = Integer.parseInt(billnumlab.getText())+1;
         billnumlab.setText(String.valueOf(newbill));
         gcb1.setSelectedIndex(0);
         bcb1.setSelectedIndex(0);
         dcb1.setSelectedIndex(0);
         blab1.setText("0");
         qty1.setText("0");
         rslab1.setText("0");
         amountlab1.setText("0");
         gcb3.setSelectedIndex(0);
         bcb3.setSelectedIndex(0);
         dcb3.setSelectedIndex(0);
         blab3.setText("0");
         qty3.setText("0");
         rslab3.setText("0");
         amountlab3.setText("0");
         gcb2.setSelectedIndex(0);
         bcb2.setSelectedIndex(0);
         dcb2.setSelectedIndex(0);
         blab2.setText("0");
         qty2.setText("0");
         rslab2.setText("0");
         amountlab2.setText("0");
         gcb4.setSelectedIndex(0);
         bcb4.setSelectedIndex(0);
         dcb4.setSelectedIndex(0);
         blab4.setText("0");
         qty4.setText("0");
         rslab4.setText("0");
         amountlab4.setText("0");
         gcb5.setSelectedIndex(0);
         bcb5.setSelectedIndex(0);
         dcb5.setSelectedIndex(0);
         blab5.setText("0");
         qty5.setText("0");
         rslab5.setText("0");
         amountlab5.setText("0");
         totallab.setText("0");
         }*/
        /*Login mw55=new   Login();
         mw55.setVisible(true);
         this.dispose();*/
    }//GEN-LAST:event_billingbtnActionPerformed

    private void totbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totbtnActionPerformed

        Generate_Bill total1 = new Generate_Bill();
        double a = amountlab1.getText().isEmpty() ? 0.0 : Double.parseDouble(amountlab1.getText());
        double b = amountlab2.getText().isEmpty() ? 0.0 : Double.parseDouble(amountlab2.getText());
        double c = amountlab3.getText().isEmpty() ? 0.0 : Double.parseDouble(amountlab3.getText());
        double d = amountlab4.getText().isEmpty() ? 0.0 : Double.parseDouble(amountlab4.getText());
        double e = amountlab5.getText().isEmpty() ? 0.0 : Double.parseDouble(amountlab5.getText());
        double total = total1.tot(a, b, c, d, e);
        totallab.setText(String.valueOf(total));

        int q1 = qty1.getText().isEmpty() ? 0 : Integer.parseInt(qty1.getText());
        int q2 = qty2.getText().isEmpty() ? 0 : Integer.parseInt(qty2.getText());
        int q3 = qty3.getText().isEmpty() ? 0 : Integer.parseInt(qty3.getText());
        int q4 = qty4.getText().isEmpty() ? 0 : Integer.parseInt(qty4.getText());
        int q5 = qty5.getText().isEmpty() ? 0 : Integer.parseInt(qty5.getText());
        int totalQty = total1.totalQty(q1, q2, q3, q4, q5);
        qtylab.setText(String.valueOf(totalQty));

        double d1 = blab1.getText().isEmpty() ? 0.0 : Double.parseDouble(blab1.getText());
        double d2 = blab2.getText().isEmpty() ? 0.0 : Double.parseDouble(blab2.getText());
        double d3 = blab3.getText().isEmpty() ? 0.0 : Double.parseDouble(blab3.getText());
        double d4 = blab4.getText().isEmpty() ? 0.0 : Double.parseDouble(blab4.getText());
        double d5 = blab5.getText().isEmpty() ? 0.0 : Double.parseDouble(blab5.getText());
        double totalDiscount = total1.totDiscount(d1, d2, d3, d4, d5, q1, q2, q3, q4, q5);
        disclab.setText(String.valueOf(totalDiscount));

    }//GEN-LAST:event_totbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

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

    private void qty1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty1KeyTyped
        // int maxqty=0;
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        if (!qty1.getText().isEmpty() && !rslab1.getText().isEmpty() && !blab1.getText().isEmpty()) {

            try {
                Generate_Bill amt1 = new Generate_Bill();
                double amount = amt1.amount(Integer.parseInt(qty1.getText()), Double.parseDouble(rslab1.getText()), Double.parseDouble(blab1.getText()));
                amountlab1.setText(String.valueOf(amount));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_qty1KeyTyped

    private void amountlab2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountlab2KeyTyped

    }//GEN-LAST:event_amountlab2KeyTyped

    private void amountlab3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountlab3KeyTyped

    }//GEN-LAST:event_amountlab3KeyTyped

    private void amountlab4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountlab4KeyTyped

    }//GEN-LAST:event_amountlab4KeyTyped

    private void amountlab5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountlab5KeyTyped

    }//GEN-LAST:event_amountlab5KeyTyped

    private void qty2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty2KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (!qty2.getText().isEmpty() && !rslab2.getText().isEmpty() && !blab2.getText().isEmpty()) {

            try {
                Generate_Bill amt1 = new Generate_Bill();
                double amount = amt1.amount(Integer.parseInt(qty2.getText()), Double.parseDouble(rslab2.getText()), Double.parseDouble(blab2.getText()));
                amountlab2.setText(String.valueOf(amount));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_qty2KeyTyped

    private void qty3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty3KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (!qty3.getText().isEmpty() && !rslab3.getText().isEmpty() && !blab3.getText().isEmpty()) {

            try {
                Generate_Bill amt1 = new Generate_Bill();
                double amount = amt1.amount(Integer.parseInt(qty3.getText()), Double.parseDouble(rslab3.getText()), Double.parseDouble(blab3.getText()));
                amountlab3.setText(String.valueOf(amount));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_qty3KeyTyped

    private void qty4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty4KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (!qty4.getText().isEmpty() && !rslab4.getText().isEmpty() && !blab4.getText().isEmpty()) {

            try {
                Generate_Bill amt1 = new Generate_Bill();
                double amount = amt1.amount(Integer.parseInt(qty4.getText()), Double.parseDouble(rslab4.getText()), Double.parseDouble(blab4.getText()));
                amountlab4.setText(String.valueOf(amount));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_qty4KeyTyped

    private void qty5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty5KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (!qty5.getText().isEmpty() && !rslab5.getText().isEmpty() && !blab5.getText().isEmpty()) {

            try {
                Generate_Bill amt1 = new Generate_Bill();
                double amount = amt1.amount(Integer.parseInt(qty5.getText()), Double.parseDouble(rslab5.getText()), Double.parseDouble(blab5.getText()));
                amountlab5.setText(String.valueOf(amount));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_qty5KeyTyped

    private void itxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itxt1KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (itxt1.getText() != null && !itxt1.getText().isEmpty()) {

            String sql1 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
            String sql2 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
            String sql3 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, Integer.parseInt(itxt1.getText()));
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String exdate = rs1.getDate("exp_date").toString();
                    String price = Float.toString(rs1.getFloat("price"));
                    String discount = Float.toString(rs1.getFloat("discount"));

                    dlbl1.setText(exdate);
                    rslab1.setText(price);
                    blab1.setText(discount);

                }

                //sql2
                PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
                stmt2.setInt(1, Integer.parseInt(itxt1.getText()));
                ResultSet rs2 = stmt2.executeQuery();

                while (rs2.next()) {
                    String iname = rs2.getString("item_name");
                    String gname = rs2.getString("generic_name");

                    icb1.addItem(iname);
                    icb1.setSelectedItem(iname);

                    glbl1.setText(gname);
                }

                //sql3
                PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
                stmt3.setInt(1, Integer.parseInt(itxt1.getText()));
                ResultSet rs3 = stmt3.executeQuery();

                while (rs3.next()) {
                    String bname = rs3.getString("brand_name");
                    blbl1.setText(bname);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "SELECT MAX(bill_id)FROM bill_details";
            try {
                PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    billnumlab.setText(String.valueOf(rs.getInt(1) + 1));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itxt1KeyTyped


    private void icb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_icb1ItemStateChanged

        Integer itemId = -1;
        String sql1 = "SELECT `item_id`FROM `item_details` WHERE `item_name`=?";
        String sql2 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
        String sql3 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
        String sql4 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
        try {
            //sql1
            PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
            stmt1.setString(1, icb1.getSelectedItem().toString());

            ResultSet rs1 = stmt1.executeQuery();

            while (rs1.next()) {
                itemId = rs1.getInt("item_id");
                String itemID = Integer.toString(rs1.getInt("item_id"));
                itxt1.setText(itemID);
            }
            //sql2
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.setInt(1, itemId);

            ResultSet rs2 = stmt2.executeQuery();

            while (rs2.next()) {

                String exdate = rs2.getDate("exp_date").toString();
                String price = Float.toString(rs2.getFloat("price"));
                String discount = Float.toString(rs2.getFloat("discount"));

                dlbl1.setText(exdate);
                rslab1.setText(price);
                blab1.setText(discount);

            }

            //sql3
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.setInt(1, itemId);
            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {
                String gname = rs3.getString("generic_name");
                glbl1.setText(gname);
            }

            //sql4
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.setInt(1, itemId);
            ResultSet rs4 = stmt4.executeQuery();

            while (rs4.next()) {
                String bname = rs4.getString("brand_name");
                blbl1.setText(bname);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql = "SELECT MAX(bill_id)FROM bill_details";

        try {
            PreparedStatement stmt = DbConnect.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                billnumlab.setText(String.valueOf(rs.getInt(1) + 1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_icb1ItemStateChanged

    private void itxt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itxt2KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        if (itxt2.getText() != null && !itxt2.getText().isEmpty()) {

            String sql1 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
            String sql2 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
            String sql3 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, Integer.parseInt(itxt2.getText()));
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String exdate = rs1.getDate("exp_date").toString();
                    String price = Float.toString(rs1.getFloat("price"));
                    String discount = Float.toString(rs1.getFloat("discount"));

                    dlbl2.setText(exdate);
                    rslab2.setText(price);
                    blab2.setText(discount);

                }

                //sql2
                PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
                stmt2.setInt(1, Integer.parseInt(itxt2.getText()));
                ResultSet rs2 = stmt2.executeQuery();

                while (rs2.next()) {
                    String iname = rs2.getString("item_name");
                    String gname = rs2.getString("generic_name");

                    icb2.addItem(iname);
                    icb2.setSelectedItem(iname);

                    glbl2.setText(gname);
                }

                //sql3
                PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
                stmt3.setInt(1, Integer.parseInt(itxt2.getText()));
                ResultSet rs3 = stmt3.executeQuery();

                while (rs3.next()) {
                    String bname = rs3.getString("brand_name");
                    blbl2.setText(bname);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_itxt2KeyTyped

    private void itxt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itxt3KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (itxt3.getText() != null && !itxt3.getText().isEmpty()) {

            String sql1 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
            String sql2 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
            String sql3 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, Integer.parseInt(itxt3.getText()));
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String exdate = rs1.getDate("exp_date").toString();
                    String price = Float.toString(rs1.getFloat("price"));
                    String discount = Float.toString(rs1.getFloat("discount"));

                    dlbl3.setText(exdate);
                    rslab3.setText(price);
                    blab3.setText(discount);

                }

                //sql2
                PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
                stmt2.setInt(1, Integer.parseInt(itxt3.getText()));
                ResultSet rs2 = stmt2.executeQuery();

                while (rs2.next()) {
                    String iname = rs2.getString("item_name");
                    String gname = rs2.getString("generic_name");

                    icb3.addItem(iname);
                    icb3.setSelectedItem(iname);

                    glbl3.setText(gname);
                }

                //sql3
                PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
                stmt3.setInt(1, Integer.parseInt(itxt3.getText()));
                ResultSet rs3 = stmt3.executeQuery();

                while (rs3.next()) {
                    String bname = rs3.getString("brand_name");
                    blbl3.setText(bname);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_itxt3KeyTyped

    private void itxt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itxt4KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        if (itxt4.getText() != null && !itxt4.getText().isEmpty()) {

            String sql1 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
            String sql2 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
            String sql3 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, Integer.parseInt(itxt4.getText()));
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String exdate = rs1.getDate("exp_date").toString();
                    String price = Float.toString(rs1.getFloat("price"));
                    String discount = Float.toString(rs1.getFloat("discount"));

                    dlbl4.setText(exdate);
                    rslab4.setText(price);
                    blab4.setText(discount);

                }

                //sql2
                PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
                stmt2.setInt(1, Integer.parseInt(itxt4.getText()));
                ResultSet rs2 = stmt2.executeQuery();

                while (rs2.next()) {
                    String iname = rs2.getString("item_name");
                    String gname = rs2.getString("generic_name");

                    icb4.addItem(iname);
                    icb4.setSelectedItem(iname);

                    glbl4.setText(gname);
                }

                //sql3
                PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
                stmt3.setInt(1, Integer.parseInt(itxt4.getText()));
                ResultSet rs3 = stmt3.executeQuery();

                while (rs3.next()) {
                    String bname = rs3.getString("brand_name");
                    blbl4.setText(bname);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_itxt4KeyTyped

    private void itxt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itxt5KeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key) || (key == KeyEvent.VK_BACK_SPACE) || (key == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        if (itxt5.getText() != null && !itxt5.getText().isEmpty()) {

            String sql1 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
            String sql2 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
            String sql3 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
            try {
                //sql1
                PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
                stmt1.setInt(1, Integer.parseInt(itxt5.getText()));
                ResultSet rs1 = stmt1.executeQuery();

                while (rs1.next()) {
                    String exdate = rs1.getDate("exp_date").toString();
                    String price = Float.toString(rs1.getFloat("price"));
                    String discount = Float.toString(rs1.getFloat("discount"));

                    dlbl5.setText(exdate);
                    rslab5.setText(price);
                    blab5.setText(discount);

                }

                //sql2
                PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
                stmt2.setInt(1, Integer.parseInt(itxt5.getText()));
                ResultSet rs2 = stmt2.executeQuery();

                while (rs2.next()) {
                    String iname = rs2.getString("item_name");
                    String gname = rs2.getString("generic_name");

                    icb5.addItem(iname);
                    icb5.setSelectedItem(iname);

                    glbl5.setText(gname);
                }

                //sql3
                PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
                stmt3.setInt(1, Integer.parseInt(itxt5.getText()));
                ResultSet rs3 = stmt3.executeQuery();

                while (rs3.next()) {
                    String bname = rs3.getString("brand_name");
                    blbl5.setText(bname);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_itxt5KeyTyped

    private void icb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_icb2ItemStateChanged
        Integer itemId = -1;
        String sql1 = "SELECT `item_id`FROM `item_details` WHERE `item_name`=?";
        String sql2 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
        String sql3 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
        String sql4 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
        try {
            //sql1
            PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
            stmt1.setString(1, icb2.getSelectedItem().toString());

            ResultSet rs1 = stmt1.executeQuery();

            while (rs1.next()) {
                itemId = rs1.getInt("item_id");
                String itemID = Integer.toString(rs1.getInt("item_id"));
                itxt2.setText(itemID);
            }
            //sql2
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.setInt(1, itemId);

            ResultSet rs2 = stmt2.executeQuery();

            while (rs2.next()) {

                String exdate = rs2.getDate("exp_date").toString();
                String price = Float.toString(rs2.getFloat("price"));
                String discount = Float.toString(rs2.getFloat("discount"));

                dlbl2.setText(exdate);
                rslab2.setText(price);
                blab2.setText(discount);

            }

            //sql3
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.setInt(1, itemId);
            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {
                String gname = rs3.getString("generic_name");
                glbl2.setText(gname);
            }

            //sql4
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.setInt(1, itemId);
            ResultSet rs4 = stmt4.executeQuery();

            while (rs4.next()) {
                String bname = rs4.getString("brand_name");
                blbl2.setText(bname);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_icb2ItemStateChanged

    private void icb3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_icb3ItemStateChanged
        Integer itemId = -1;
        String sql1 = "SELECT `item_id`FROM `item_details` WHERE `item_name`=?";
        String sql2 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
        String sql3 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
        String sql4 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
        try {
            //sql1
            PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
            stmt1.setString(1, icb3.getSelectedItem().toString());

            ResultSet rs1 = stmt1.executeQuery();

            while (rs1.next()) {
                itemId = rs1.getInt("item_id");
                String itemID = Integer.toString(rs1.getInt("item_id"));
                itxt3.setText(itemID);
            }
            //sql2
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.setInt(1, itemId);

            ResultSet rs2 = stmt2.executeQuery();

            while (rs2.next()) {

                String exdate = rs2.getDate("exp_date").toString();
                String price = Float.toString(rs2.getFloat("price"));
                String discount = Float.toString(rs2.getFloat("discount"));

                dlbl3.setText(exdate);
                rslab3.setText(price);
                blab3.setText(discount);

            }

            //sql3
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.setInt(1, itemId);
            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {
                String gname = rs3.getString("generic_name");
                glbl3.setText(gname);
            }

            //sql4
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.setInt(1, itemId);
            ResultSet rs4 = stmt4.executeQuery();

            while (rs4.next()) {
                String bname = rs4.getString("brand_name");
                blbl3.setText(bname);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_icb3ItemStateChanged

    private void icb4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_icb4ItemStateChanged
        Integer itemId = -1;
        String sql1 = "SELECT `item_id`FROM `item_details` WHERE `item_name`=?";
        String sql2 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
        String sql3 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
        String sql4 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
        try {
            //sql1
            PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
            stmt1.setString(1, icb4.getSelectedItem().toString());

            ResultSet rs1 = stmt1.executeQuery();

            while (rs1.next()) {
                itemId = rs1.getInt("item_id");
                String itemID = Integer.toString(rs1.getInt("item_id"));
                itxt4.setText(itemID);
            }
            //sql2
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.setInt(1, itemId);

            ResultSet rs2 = stmt2.executeQuery();

            while (rs2.next()) {

                String exdate = rs2.getDate("exp_date").toString();
                String price = Float.toString(rs2.getFloat("price"));
                String discount = Float.toString(rs2.getFloat("discount"));

                dlbl4.setText(exdate);
                rslab4.setText(price);
                blab4.setText(discount);

            }

            //sql3
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.setInt(1, itemId);
            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {
                String gname = rs3.getString("generic_name");
                glbl4.setText(gname);
            }

            //sql4
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.setInt(1, itemId);
            ResultSet rs4 = stmt4.executeQuery();

            while (rs4.next()) {
                String bname = rs4.getString("brand_name");
                blbl4.setText(bname);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_icb4ItemStateChanged

    private void icb5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_icb5ItemStateChanged
        Integer itemId = -1;
        String sql1 = "SELECT `item_id`FROM `item_details` WHERE `item_name`=?";
        String sql2 = "select  exp_date, price, discount from item_primary_details i left join item_details o on i.item_name = o.item_name where item_id =?";
        String sql3 = "SELECT  `item_name`,`generic_name` FROM `medicine_y` WHERE `item_id_fk`=?";
        String sql4 = "SELECT `brand_name` FROM `medicine_x` WHERE `item_id_fk`=?";
        try {
            //sql1
            PreparedStatement stmt1 = DbConnect.getConnection().prepareStatement(sql1);
            stmt1.setString(1, icb5.getSelectedItem().toString());

            ResultSet rs1 = stmt1.executeQuery();

            while (rs1.next()) {
                itemId = rs1.getInt("item_id");
                String itemID = Integer.toString(rs1.getInt("item_id"));
                itxt5.setText(itemID);
            }
            //sql2
            PreparedStatement stmt2 = DbConnect.getConnection().prepareStatement(sql2);
            stmt2.setInt(1, itemId);

            ResultSet rs2 = stmt2.executeQuery();

            while (rs2.next()) {

                String exdate = rs2.getDate("exp_date").toString();
                String price = Float.toString(rs2.getFloat("price"));
                String discount = Float.toString(rs2.getFloat("discount"));

                dlbl5.setText(exdate);
                rslab5.setText(price);
                blab5.setText(discount);

            }

            //sql3
            PreparedStatement stmt3 = DbConnect.getConnection().prepareStatement(sql3);
            stmt3.setInt(1, itemId);
            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {
                String gname = rs3.getString("generic_name");
                glbl5.setText(gname);
            }

            //sql4
            PreparedStatement stmt4 = DbConnect.getConnection().prepareStatement(sql4);
            stmt4.setInt(1, itemId);
            ResultSet rs4 = stmt4.executeQuery();

            while (rs4.next()) {
                String bname = rs4.getString("brand_name");
                blbl5.setText(bname);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_icb5ItemStateChanged

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additembutn;
    private javax.swing.JLabel amountlab1;
    private javax.swing.JLabel amountlab2;
    private javax.swing.JLabel amountlab3;
    private javax.swing.JLabel amountlab4;
    private javax.swing.JLabel amountlab5;
    private javax.swing.JButton billingbtn;
    private javax.swing.JLabel billnumlab;
    private javax.swing.JLabel blab1;
    private javax.swing.JLabel blab2;
    private javax.swing.JLabel blab3;
    private javax.swing.JLabel blab4;
    private javax.swing.JLabel blab5;
    private javax.swing.JLabel blbl1;
    private javax.swing.JLabel blbl2;
    private javax.swing.JLabel blbl3;
    private javax.swing.JLabel blbl4;
    private javax.swing.JLabel blbl5;
    private javax.swing.JButton changepassbtn;
    private javax.swing.JLabel cnamelab;
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton deleteitembutn;
    private javax.swing.JLabel disclab;
    private javax.swing.JLabel dlbl1;
    private javax.swing.JLabel dlbl2;
    private javax.swing.JLabel dlbl3;
    private javax.swing.JLabel dlbl4;
    private javax.swing.JLabel dlbl5;
    private javax.swing.JLabel glbl1;
    private javax.swing.JLabel glbl2;
    private javax.swing.JLabel glbl3;
    private javax.swing.JLabel glbl4;
    private javax.swing.JLabel glbl5;
    private javax.swing.JComboBox<String> icb1;
    private javax.swing.JComboBox<String> icb2;
    private javax.swing.JComboBox<String> icb3;
    private javax.swing.JComboBox<String> icb4;
    private javax.swing.JComboBox<String> icb5;
    private javax.swing.JTextField itxt1;
    private javax.swing.JTextField itxt2;
    private javax.swing.JTextField itxt3;
    private javax.swing.JTextField itxt4;
    private javax.swing.JTextField itxt5;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton newaccountbtn;
    private javax.swing.JTextField qty1;
    private javax.swing.JTextField qty2;
    private javax.swing.JTextField qty3;
    private javax.swing.JTextField qty4;
    private javax.swing.JTextField qty5;
    private javax.swing.JLabel qtylab;
    private javax.swing.JButton remove1;
    private javax.swing.JButton remove2;
    private javax.swing.JButton remove3;
    private javax.swing.JButton remove4;
    private javax.swing.JButton remove5;
    private javax.swing.JLabel rslab1;
    private javax.swing.JLabel rslab2;
    private javax.swing.JLabel rslab3;
    private javax.swing.JLabel rslab4;
    private javax.swing.JLabel rslab5;
    private javax.swing.JLabel totallab;
    private javax.swing.JButton totbtn;
    private javax.swing.JButton viewbills;
    private javax.swing.JButton viewstock;
    // End of variables declaration//GEN-END:variables
}
