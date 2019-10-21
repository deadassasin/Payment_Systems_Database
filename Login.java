package paymentsys;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.sql.*;

/**
 *
 * @author Wiktor
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLoginBtn = new javax.swing.JButton();
        jResetBtn = new javax.swing.JButton();
        jExitBtn = new javax.swing.JButton();
        jUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jRegionCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginPanel");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Login panel");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 307));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLoginBtn.setText("Login");
        jLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginBtnActionPerformed(evt);
            }
        });

        jResetBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jResetBtn.setText("Reset");
        jResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetBtnActionPerformed(evt);
            }
        });

        jExitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jExitBtn.setText("Exit");
        jExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitBtnActionPerformed(evt);
            }
        });

        jUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jUsernameKeyReleased(evt);
            }
        });

        jPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordKeyReleased(evt);
            }
        });

        jRegionCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRegionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "United Kingdom", "Polska" }));
        jRegionCB.setBorder(null);
        jRegionCB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRegionCBKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Region:");

        lbl_password.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N

        lbl_username.setFont(new java.awt.Font("Sitka Small", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jRegionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jUsername)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRegionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginBtn)
                    .addComponent(jResetBtn)
                    .addComponent(jExitBtn))
                .addGap(37, 37, 37))
        );

        jLabel2.getAccessibleContext().setAccessibleName("NameLabel");
        jLabel3.getAccessibleContext().setAccessibleName("Password Label");
        jLoginBtn.getAccessibleContext().setAccessibleName("jLoginBtn");
        jResetBtn.getAccessibleContext().setAccessibleName("jResetBtn");
        jExitBtn.getAccessibleContext().setAccessibleName("jExitBtn");
        jUsername.getAccessibleContext().setAccessibleName("jName");
        jPassword.getAccessibleContext().setAccessibleName("jPassword");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(201, 201, 201))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("LoginLabel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    public void userLogin() {
      
        if(jUsername.getText().trim().isEmpty() && jPassword.getText().trim().isEmpty()){
            lbl_username.setText("Username is Empty");
            lbl_password.setText("Password is Empty");
        }
        
        else if(jUsername.getText().trim().isEmpty()){
            lbl_username.setText("Username is Empty");
            
        }
        else if(jPassword.getText().trim().isEmpty()){
            lbl_password.setText("Password is Empty");
            
        }
        else{
        
    try{
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsys", "root", "");
        
        String sql = "Select * from logindatabase where username=? and password =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, jUsername.getText());
        pst.setString(2, jPassword.getText());
        ResultSet rs = pst.executeQuery();
       
        if(rs.next()){
            
            Paymentsystem PaySysUK = new Paymentsystem();
            PaymentsystemPoland PaySysPol = new PaymentsystemPoland(); 
            
            
            if(jRegionCB.getSelectedItem().equals("United Kingdom")){
                
                PaySysUK.setVisible(true);
            }
            
            else if(jRegionCB.getSelectedItem().equals("Polska")){
                
                PaySysPol.setVisible(true);
            }
            
            this.hide();
        }
        else{
            JOptionPane.showMessageDialog(null, "Username and Password doesn't match");
            jUsername.setText(null);
            jPassword.setText(null);
            lbl_password.setText(null);
            lbl_username.setText(null);
        }
    }
    catch (HeadlessException | ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
      }    
    }
    
    
    private void jLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginBtnActionPerformed

        this.userLogin();
    
    }//GEN-LAST:event_jLoginBtnActionPerformed

   
    
    private void jResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetBtnActionPerformed
        jPassword.setText(null);
        jUsername.setText(null);
        lbl_password.setText(null);
        lbl_username.setText(null);
    }//GEN-LAST:event_jResetBtnActionPerformed

    private void jExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitBtnActionPerformed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
          this.userLogin();
       
    }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jRegionCBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRegionCBKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
       
            this.userLogin();
      
    }
    }//GEN-LAST:event_jRegionCBKeyPressed

    private void jUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsernameKeyReleased
        lbl_username.setText(null);
    }//GEN-LAST:event_jUsernameKeyReleased

    private void jPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyReleased
        lbl_password.setText(null);
    }//GEN-LAST:event_jPasswordKeyReleased

    private void jUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsernameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
          this.userLogin();
       
    }
    }//GEN-LAST:event_jUsernameKeyPressed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLoginBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JComboBox<String> jRegionCB;
    private javax.swing.JButton jResetBtn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jUsername;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    // End of variables declaration//GEN-END:variables

}
