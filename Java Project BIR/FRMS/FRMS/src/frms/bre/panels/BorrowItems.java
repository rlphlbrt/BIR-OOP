package frms.bre.panels;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class BorrowItems extends javax.swing.JFrame {

    static String employeenumber;
    static ArrayList<String> item;
    static ArrayList<String> qty;

    /**
     * Creates new form BorrowItems
     */
    public BorrowItems() {
        initComponents();
        System.out.println(dateborrowed());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblItemRelease = new javax.swing.JLabel();
        lblEmployeeNumber = new javax.swing.JLabel();
        txtEmployeeNumber = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        lblItemToBeBorrowed = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblDepartment = new javax.swing.JLabel();
        scrSummary = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        lblDueDate = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Item Release");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        lblItemRelease.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblItemRelease.setText("Item Release");

        lblEmployeeNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmployeeNumber.setText("Employee Number:");

        txtEmployeeNumber.setEditable(false);
        txtEmployeeNumber.setColumns(10);
        txtEmployeeNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtSurname.setEditable(false);
        txtSurname.setColumns(20);
        txtSurname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtFirstname.setEditable(false);
        txtFirstname.setColumns(20);
        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDepartment.setEditable(false);
        txtDepartment.setColumns(20);
        txtDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblItemToBeBorrowed.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblItemToBeBorrowed.setText("Item(s) to be borrowed:");

        btnConfirm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnConfirm.setText("Confirm and Release");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDepartment.setText("Department:");

        tblSummary.setModel(new DefaultTableModel());
        scrSummary.setViewportView(tblSummary);

        lblDueDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDueDate.setText("Due Date:");

        txtDueDate.setEditable(false);
        txtDueDate.setColumns(15);
        txtDueDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrSummary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblDueDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblItemRelease)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmployeeNumber)
                                        .addComponent(lblDepartment))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblItemToBeBorrowed)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemRelease)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeNumber)
                    .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartment))
                .addGap(18, 18, 18)
                .addComponent(lblItemToBeBorrowed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDueDate)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        frms.Home.database.setTransaction(employeenumber, item, qty, dateborrowed(), duedate());
        JOptionPane.showMessageDialog(null, "Released.",
                null, 1);
        frms.bre.panels.BREBorrow.setDefault();
        this.dispose();
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowItems().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblEmployeeNumber;
    private javax.swing.JLabel lblItemRelease;
    private javax.swing.JLabel lblItemToBeBorrowed;
    private javax.swing.JScrollPane scrSummary;
    public static javax.swing.JTable tblSummary;
    public static javax.swing.JTextField txtDepartment;
    public static javax.swing.JTextField txtDueDate;
    public static javax.swing.JTextField txtEmployeeNumber;
    public static javax.swing.JTextField txtFirstname;
    public static javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    public static void setInfo() {
        txtEmployeeNumber.setText(BREBorrow.txtEmployeeNumber.getText());
        txtSurname.setText(frms.Home.database.getEmployee(txtEmployeeNumber.getText()).get(0));
        txtFirstname.setText(frms.Home.database.getEmployee(txtEmployeeNumber.getText()).get(1));
        txtDepartment.setText(frms.Home.database.getEmployee(txtEmployeeNumber.getText()).get(2));
        setTable();
        txtDueDate.setText(setDueDate());
        employeenumber = BREBorrow.txtEmployeeNumber.getText();
        item = BREBorrow.item;
        qty = BREBorrow.quantity;
    }

    public static void setTable() {
        DefaultTableModel dtmSummary = (DefaultTableModel) tblSummary.getModel();
        dtmSummary.addColumn("Item Number");
        dtmSummary.addColumn("Quantity");
        dtmSummary.setRowCount(BREBorrow.item.size());
        for (int i = 0; i < BREBorrow.item.size(); i++) {
            dtmSummary.setValueAt(BREBorrow.item.get(i), i, 0);
            dtmSummary.setValueAt(BREBorrow.quantity.get(i), i, 1);
        }
    }

    public static String duedate() {
        Calendar calendar = new GregorianCalendar();
        //Today
        int year0 = calendar.get(Calendar.YEAR);
        int month0 = calendar.get(Calendar.MONTH);
        int date0 = calendar.get(Calendar.DATE);
        //Set
        calendar.set(year0, month0, date0);
        //After 7 days
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get((Calendar.MONTH)) + 1;
        int date1 = calendar.get(Calendar.DATE);
        return year1 + "-" + String.format("%02d", month1)
                + "-" + String.format("%02d", date1);
    }

    public String dateborrowed() {
        Calendar calendar = new GregorianCalendar();
        //Today
        int year0 = calendar.get(Calendar.YEAR);
        int month0 = calendar.get(Calendar.MONTH) + 1;
        int date0 = calendar.get(Calendar.DATE);
        return year0 + "-" + String.format("%02d", month0) + "-"
                + String.format("%02d", date0);
    }

    public static String setDueDate() {
        Calendar calendar = new GregorianCalendar();
        //Today
        int year0 = calendar.get(Calendar.YEAR);
        int month0 = calendar.get(Calendar.MONTH);
        int date0 = calendar.get(Calendar.DATE);
        //Set
        calendar.set(year0, month0, date0);
        //After 7 days
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get((Calendar.MONTH)) + 1;
        int date1 = calendar.get(Calendar.DATE);
        return year1 + "-" + String.format("%02d", month1)
                + "-" + String.format("%02d", date1);

    }
}
