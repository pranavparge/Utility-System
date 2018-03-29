/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DaoConnection;
import db.GenerateOtp;
import db.SmsZone;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tulajaram
 */
public class Login_pnl extends javax.swing.JPanel {

    /**
     * Creates new form Login_pnl
     */
//    GUI_MAIN gui = new GUI_MAIN();
    DaoConnection dc = new DaoConnection();
    static String otp = "";
    Connection conn;
    Frame frm;
    public Login_pnl(Frame frm) {
        this.frm=frm;
        initComponents();
        conn = dc.getConnection();
      
        student.setVisible(false);
        teacher.setVisible(false);
        txtOtp.setEnabled(false);
        lbLogin.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        lbLogin = new javax.swing.JLabel();
        jc_choice = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        student = new javax.swing.JRadioButton();
        teacher = new javax.swing.JRadioButton();
        txtOtp = new javax.swing.JTextField();
        btnOtp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(399, 395));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 395));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(62, 38, 0, 0);
        jPanel4.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Password ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 38, 0, 0);
        jPanel4.add(jLabel2, gridBagConstraints);

        tfUsername.setPreferredSize(new java.awt.Dimension(6, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(62, 12, 0, 74);
        jPanel4.add(tfUsername, gridBagConstraints);

        tfPassword.setPreferredSize(new java.awt.Dimension(6, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 74);
        jPanel4.add(tfPassword, gridBagConstraints);

        lbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lg.png"))); // NOI18N
        lbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 38, 31, 0);
        jPanel4.add(lbLogin, gridBagConstraints);

        jc_choice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----- Select -----", "Registration", "Print ID Card", "Attendance" }));
        jc_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_choiceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 14, 0, 74);
        jPanel4.add(jc_choice, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        student.setBackground(new java.awt.Color(255, 255, 255));
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel5.add(student);

        teacher.setBackground(new java.awt.Color(255, 255, 255));
        teacher.setText("Teacher");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel5.add(teacher);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 109, 0, 74);
        jPanel4.add(jPanel5, gridBagConstraints);

        txtOtp.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 164;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 74);
        jPanel4.add(txtOtp, gridBagConstraints);

        btnOtp.setText("Generate OTP");
        btnOtp.setMaximumSize(new java.awt.Dimension(120, 30));
        btnOtp.setPreferredSize(new java.awt.Dimension(120, 30));
        btnOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 0);
        jPanel4.add(btnOtp, gridBagConstraints);

        jLabel3.setText("Enter OTP :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 38, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(java.awt.Color.white);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin1.png"))); // NOI18N
        jPanel6.add(jLabel4, new java.awt.GridBagConstraints());

        jPanel3.add(jPanel6);

        add(jPanel3, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void lbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseClicked
        if (("".equals(tfUsername.getText())) || ("".equals(tfPassword.getText()))) {
            JOptionPane.showMessageDialog(null, "Please Enter all the Fields !!!");
        } else {
            jc_choice.getSelectedItem();
            if (otp.equals(txtOtp.getText().trim())) {
                if (jc_choice.getSelectedItem().equals("Registration")) {

                    String stuts = "";
                    if (student.isSelected()) {
                        stuts = "student";

                    } else if (teacher.isSelected()) {
                        stuts = "teacher";
                    }
                    if (stuts.equalsIgnoreCase("student")) {
                        try {
                            String username = tfUsername.getText();
                            String password = tfPassword.getText();
                            Connection conn = null;
                            DaoConnection dao = new DaoConnection();
                            conn = dao.getConnection();
                            PreparedStatement ps;
                            ps = conn.prepareStatement("select * from logintbl where username=? and password=? ");
                            ps.setString(1, username);
                            ps.setString(2, password);
                            ResultSet rs = ps.executeQuery();
                            if (rs.next()) {
                                JOptionPane.showMessageDialog(null, "Login Successful !!!");
                                MainPln.PnelMn.setSize(850, 730);
                                //                                gui.setSize(screenSize);
                                MainPln.PnelMn.removeAll();
                                MainPln.PnelMn.add(new Student_Registration(frm));
                                //                        gui.MainPanel.add(new Teacher_Registration(gui));
                                MainPln.PnelMn.updateUI();
//                                GUI_MAIN.setVisible(true);
//                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Incorrect Username or Password... Try Again !!!");
                            }
                        } catch (SQLException ex) {
                            System.out.println("Exceptionm : " + ex);
                        }
                    } else if (stuts.equalsIgnoreCase("teacher")) {
                        try {
                            String username = tfUsername.getText();
                            String password = tfPassword.getText();
                            Connection conn = null;
                            DaoConnection dao = new DaoConnection();
                            conn = dao.getConnection();
                            PreparedStatement ps;
                            ps = conn.prepareStatement("select * from logintbl where username=? and password=? ");
                            ps.setString(1, username);
                            ps.setString(2, password);
                            ResultSet rs = ps.executeQuery();
                            if (rs.next()) {
                                JOptionPane.showMessageDialog(null, "Login Successful !!!");
                                MainPln.PnelMn.setSize(850, 730);
                                MainPln.PnelMn.removeAll();
                                //                            gui.MainPanel.add(new Student_Registration(gui));
                                MainPln.PnelMn.add(new TeacherReg1(frm));
                                MainPln.PnelMn.updateUI();
//                                GUI_MAIN.setVisible(true);
//                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Incorrect Username or Password... Try Again !!!");
                            }
                        } catch (SQLException ex) {
                            System.out.println("Exceptionm : " + ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Something Is Missing... ");
                    }
                } else if (jc_choice.getSelectedItem().equals("Print ID Card")) {
                    try {
                        String username = tfUsername.getText();
                        String password = tfPassword.getText();
                        Connection conn = null;
                        DaoConnection dao = new DaoConnection();

                        conn = dao.getConnection();
                        PreparedStatement ps;

                        ps = conn.prepareStatement("select * from logintbl where username=? and password=? ");
                        ps.setString(1, username);
                        ps.setString(2, password);
                        ResultSet rs = ps.executeQuery();
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "Login Successful !!!");

                            //                        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                            //                                gui.setExtendedState(MAXIMIZED_BOTH);
                            //                        gui.setLocation(screenSize.width / 2 - gui.getSize().width / 2, screenSize.height / 2 - gui.getSize().height / 2);
                            MainPln.PnelMn.setSize(850, 730);
                            //                                gui.setSize(screenSize);
                            MainPln.PnelMn.removeAll();
                            MainPln.PnelMn.add(new GenerateID(frm));
                            MainPln.PnelMn.updateUI();
//                            GUI_MAIN.MainPanel.setVisible(true);
//                            this.dispose();

                            //                    GenerateID gui = new GenerateID();
                            //                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                            //                    gui.setLocation(dim.width / 2 - gui.getSize().width / 2, dim.height / 2 - gui.getSize().height / 2);
                            //                    gui.setSize(850, 725);
                            //                    gui.setVisible(true);
                            //                    this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect Username or Password... Try Again !!!");
                        }
                    } catch (SQLException ex) {
                        System.out.println("Exceptionm : " + ex);
                    }
                } else {
                    try {
                        String user = tfUsername.getText();
                        String pass = new String(tfPassword.getPassword());
                        PreparedStatement ps = conn.prepareStatement("select * from tbtecher where first='" + user + "'&&pass='" + pass + "'");
                        ResultSet executeQuery = ps.executeQuery();
                        while (executeQuery.next()) {
                            MainPln.PnelMn.removeAll();
                            MainPln.PnelMn.add(new pnlAttendance1(frm));
                            MainPln.PnelMn.updateUI();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect OTP...");
            }
        }
    }//GEN-LAST:event_lbLoginMouseClicked

    private void jc_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_choiceActionPerformed
        String stutus = (String) jc_choice.getSelectedItem();
        if (stutus.equalsIgnoreCase("Registration")) {
            student.setVisible(true);
            teacher.setVisible(true);

        } else {
            student.setVisible(false);
            teacher.setVisible(false);
        }
    }//GEN-LAST:event_jc_choiceActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed

        if (student.isSelected()) {
            teacher.setSelected(false);
        }
    }//GEN-LAST:event_studentActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        if (teacher.isSelected()) {
            student.setSelected(false);
        }
    }//GEN-LAST:event_teacherActionPerformed

    private void btnOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtpActionPerformed
        // TODO add your handling code here:
//        GUI_MAIN.MainPanel.setSize(850, 730);
        //                                gui.setSize(screenSize);

//        gui.setVisible(true);
//        this.dispose();
        try {
            String contact = "";
            String user = tfUsername.getText();
            String pass = new String(tfPassword.getPassword());
            PreparedStatement ps = conn.prepareStatement("select * from logintbl where username='" + user + "'&&password='" + pass + "'");
            ResultSet set = ps.executeQuery();
            while (set.next()) {
                contact = set.getString("phone");
                txtOtp.setEnabled(true);
                lbLogin.setEnabled(true);
                otp = new GenerateOtp().generateKey();
                //            PreparedStatement ps1 = conn.prepareStatement("insert into otpstore values (?)");
                //            ps1.setString(1, otp);
                //            ps.execute();
                new SmsZone().SendToSms(otp, contact);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOtpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox jc_choice;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JRadioButton student;
    private javax.swing.JRadioButton teacher;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField txtOtp;
    // End of variables declaration//GEN-END:variables
}