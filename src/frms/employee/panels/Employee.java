package frms.employee.panels;

import java.awt.*;

public class Employee extends javax.swing.JFrame {

    public static int button = -1;

    public Employee() {
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

        pnlLeft = new javax.swing.JPanel();
        pnlEmployee_buttons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        pnlBlank = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlEmployee_buttons.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Employee", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEmployee_buttonsLayout = new javax.swing.GroupLayout(pnlEmployee_buttons);
        pnlEmployee_buttons.setLayout(pnlEmployee_buttonsLayout);
        pnlEmployee_buttonsLayout.setHorizontalGroup(
            pnlEmployee_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployee_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployee_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pnlEmployee_buttonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnUpdate});

        pnlEmployee_buttonsLayout.setVerticalGroup(
            pnlEmployee_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployee_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEmployee_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEmployee_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLeft);

        pnlRight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlRight.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnlBlankLayout = new javax.swing.GroupLayout(pnlBlank);
        pnlBlank.setLayout(pnlBlankLayout);
        pnlBlankLayout.setHorizontalGroup(
            pnlBlankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        pnlBlankLayout.setVerticalGroup(
            pnlBlankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        pnlRight.add(pnlBlank, "cardBlank");

        getContentPane().add(pnlRight);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(850, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        button = 0;
//        CardLayout card = (CardLayout) pnlRight.getLayout();
//        card.show(pnlRight, "cardEmployee");
        setEmployeeInfoComponents(true);
        setBlankComponents();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        button = 1;
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardEmployee");
        setEmployeeInfoComponents(false);
        setBlankComponents();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new frms.Modules().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAdd;
    public static javax.swing.JButton btnUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlBlank;
    private javax.swing.JPanel pnlEmployee_buttons;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    // End of variables declaration//GEN-END:variables

    /*
     * THE METHOD setEmployeeInfoComponents
     * The boolean b is true if the button btnAdd is clicked.
     * Otherwise, the button btnUpdate is clicked.
     */
    private void setEmployeeInfoComponents(boolean b) {
        EmployeeInfo1.txtEmployeeNumber.setEnabled(true); //Always enabled
        EmployeeInfo1.txtEmployeeNumber.requestFocusInWindow(); //Always focus
        if (b) {

            /* btnAdd */
            EmployeeInfo1.lblEmployeeTitle.setText("Add Employee");
            EmployeeInfo1.pnlReset.setVisible(!b);
            EmployeeInfo1.chkConfirm.setText("Save without confirm");
            EmployeeInfo1.btnSave.setText("Save");
        } else {

            /* btnUpdate */
            EmployeeInfo1.lblEmployeeTitle.setText("Update Employee");
            EmployeeInfo1.pnlReset.setVisible(!b);
            EmployeeInfo1.chkConfirm.setText("Update without confirm");
            EmployeeInfo1.btnSave.setText("Update");
        }

        /* Set the components/fields under EmployeeInfo1 */
        EmployeeInfo1.txtSurname.setEnabled(b);
        EmployeeInfo1.txtFirstname.setEnabled(b);
        EmployeeInfo1.txtMiddleInitial.setEnabled(b);
        EmployeeInfo1.txtDepartment.setEnabled(b);
        EmployeeInfo1.cmbUserType.setEnabled(b);
        EmployeeInfo1.radResetYes.setEnabled(b);
        EmployeeInfo1.radResetNo.setEnabled(b);
        EmployeeInfo1.btnSave.setVisible(b);
        EmployeeInfo1.chkConfirm.setVisible(b);
    }

    private void setBlankComponents() {
        EmployeeInfo1.txtEmployeeNumber.setText(null);
        EmployeeInfo1.txtSurname.setText(null);
        EmployeeInfo1.txtFirstname.setText(null);
        EmployeeInfo1.txtMiddleInitial.setText(null);
        EmployeeInfo1.txtDepartment.setText(null);
        EmployeeInfo1.cmbUserType.setSelectedIndex(-1);
    }
}
