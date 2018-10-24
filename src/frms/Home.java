package frms;

import javax.swing.*;

public class Home extends javax.swing.JFrame {

    public static mysql.Database database = new mysql.Database();

    public Home() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblFRMS = new javax.swing.JLabel();
        lblPMIS = new javax.swing.JLabel();
        lblBIR = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblFRMS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFRMS.setText("Facilities and Resource Management System");

        lblPMIS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPMIS.setText("Project Management and Implementation Service");

        lblBIR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBIR.setText("BUREAU OF INTERNAL REVENUE");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblLogin.setText("Login");

        lblUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPassword.setText("Password:");

        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        pwfPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pwfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwfPasswordKeyReleased(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLogin)
                    .addComponent(lblLogin)
                    .addComponent(lblBIR)
                    .addComponent(lblPMIS)
                    .addComponent(lblFRMS)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblUsername))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwfPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwfPassword, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFRMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPMIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBIR)
                .addGap(18, 18, 18)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (!txtUsername.getText().isEmpty() && !pwfPassword.getText().isEmpty()) {
            if (!txtUsername.getText().isEmpty() && !pwfPassword.getText().isEmpty()) {
                checkLogin(txtUsername.getText(), pwfPassword.getPassword());
            } else {
                JOptionPane.showMessageDialog(null, "Please enter username and password.",
                        "Log in", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter username and password.",
                    "Log in", 1);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        if (evt.getKeyCode() == 10) {
            if (!txtUsername.getText().isEmpty() && !pwfPassword.getText().isEmpty()) {
                checkLogin(txtUsername.getText(), pwfPassword.getPassword());
            } else {
                JOptionPane.showMessageDialog(null, "Please enter username and password.",
                        "Log in", 1);
            }
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Quit?", null, 0) == 0) {
            database.disconnectDatabase();
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void pwfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwfPasswordKeyReleased
        if (evt.getKeyCode() == 10) {
            if (!txtUsername.getText().isEmpty()
                    && !pwfPassword.getText().isEmpty()) {
                checkLogin(txtUsername.getText(), pwfPassword.getPassword());
            } else {
                JOptionPane.showMessageDialog(null, "Please enter username and password.",
                        "Log in", 1);
            }
        }
    }//GEN-LAST:event_pwfPasswordKeyReleased

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblBIR;
    private javax.swing.JLabel lblFRMS;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPMIS;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public void checkLogin(String strUsername, char[] chrPassword) {
        String strPassword = "";
        for (int i = 0; i < chrPassword.length; i++) {
            strPassword += chrPassword[i];
        }

        if (database.isAccessGranted(strUsername, strPassword)
                && database.isAdmin(strUsername)
                || isAccessGranted(strUsername, strPassword)) {
            new Modules().setVisible(true);
            this.dispose();
        } else {


            if (database.isAdmin(strUsername)
                    && database.isNewUser(strUsername)) {
                createPassword(strUsername, strPassword); //CREATE PASSWORD IF NEW ADMIN
            } else {
                JOptionPane.showMessageDialog(null, "Access Denied.",
                        "Log in", 1);
                txtUsername.setText(null);
                pwfPassword.setText(null);
            }
        }
    }

    private boolean isAccessGranted(String username, String password) {
        mysql.Database.getFirstName = "asd";
        return username.equals("admin") && password.equals("admin");
    }

    private void createPassword(String strUsername, String strPassword) {
        String[] emp_info = new String[2];
        emp_info[0] = JOptionPane.showInputDialog(null,
                "Please enter your surname: ");
        emp_info[1] = JOptionPane.showInputDialog(null,
                "Please enter your first name: ");
        String password1 = JOptionPane.showInputDialog(null,
                "Please re-enter your password: ");

        if (strPassword.equals(password1)
                && database.isEmployeeMatched(emp_info)) {
            JOptionPane.showMessageDialog(null, "Password is saved.",
                    "Log in", 1);
            database.updatePassword(strUsername, strPassword);
            new Modules().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Neither surname, first name nor password is matched.",
                    "Log in", 1);
        }
    }
}