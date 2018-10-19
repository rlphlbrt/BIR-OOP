package frms;

import javax.swing.*;

public class Modules extends javax.swing.JFrame {

    /**
     * Creates new form Modules
     */
    public Modules() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFRMS = new javax.swing.JLabel();
        lblPMIS = new javax.swing.JLabel();
        lblBIR = new javax.swing.JLabel();
        lblGreeting = new javax.swing.JLabel();
        btnBRE = new javax.swing.JButton();
        btnConferenceRoom = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        lblGreeting.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGreeting.setText("Hello, " + mysql.Database.getFirstName + "!");

        btnBRE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBRE.setText("<html>\n<center>\nBooks, <br>\nReports and<br>\nEquipment\n</center>\n</html>"); // NOI18N
        btnBRE.setActionCommand("BRE");
        btnBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBREActionPerformed(evt);
            }
        });

        btnConferenceRoom.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnConferenceRoom.setText("<html>\n<center>\nConference<br>Room\n</center>\n</html>");
        btnConferenceRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConferenceRoomActionPerformed(evt);
            }
        });

        btnEmployee.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblBIR)
                            .addComponent(lblPMIS)
                            .addComponent(lblFRMS)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConferenceRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEmployee))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblGreeting)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBRE, btnConferenceRoom, btnEmployee});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblFRMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPMIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBIR)
                .addGap(18, 18, 18)
                .addComponent(lblGreeting)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBRE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConferenceRoom))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBRE, btnConferenceRoom, btnEmployee});

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Log out?", null,
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new Home().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBREActionPerformed
        new frms.bre.BRE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBREActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
        new frms.employee.panels.Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnConferenceRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConferenceRoomActionPerformed
        // TODO add your handling code here:
        new frms.conrm.ConRoomSchedule().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConferenceRoomActionPerformed

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
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modules().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBRE;
    private javax.swing.JButton btnConferenceRoom;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JLabel lblBIR;
    private javax.swing.JLabel lblFRMS;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblPMIS;
    // End of variables declaration//GEN-END:variables
}
