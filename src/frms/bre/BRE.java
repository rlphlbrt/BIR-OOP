package frms.bre;

import java.awt.*;
import javax.swing.table.*;
import java.sql.*;

public class BRE extends javax.swing.JFrame {

    public static int button;

    /**
     * Creates new form BRE
     */
    public BRE() {
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
        pnlBRE_buttons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        btnSummary = new javax.swing.JButton();
        btReturn = new javax.swing.JButton();
        pnlBRE_list = new javax.swing.JPanel();
        btnBooks = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnEquipment = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        pnlBREBlank = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlLeft.setPreferredSize(new java.awt.Dimension(225, 479));

        pnlBRE_buttons.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Books, Reports and Equipment", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

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

        btnBorrow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBorrow.setText("Borrow");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        btnReserve.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReserve.setText("Reserve");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        btnSummary.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSummary.setText("Summary");
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });

        btReturn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btReturn.setText("Return");
        btReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBRE_buttonsLayout = new javax.swing.GroupLayout(pnlBRE_buttons);
        pnlBRE_buttons.setLayout(pnlBRE_buttonsLayout);
        pnlBRE_buttonsLayout.setHorizontalGroup(
            pnlBRE_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBRE_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBRE_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSummary, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBRE_buttonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnBorrow, btnReserve, btnSummary, btnUpdate});

        pnlBRE_buttonsLayout.setVerticalGroup(
            pnlBRE_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBRE_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReserve)
                .addGap(8, 8, 8)
                .addComponent(btReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSummary)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBRE_list.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        btnBooks.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBooks.setText("Books");
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });

        btnReports.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReports.setText("Reports");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnEquipment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEquipment.setText("Equipment");
        btnEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBRE_listLayout = new javax.swing.GroupLayout(pnlBRE_list);
        pnlBRE_list.setLayout(pnlBRE_listLayout);
        pnlBRE_listLayout.setHorizontalGroup(
            pnlBRE_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBRE_listLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBRE_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBooks)
                    .addComponent(btnReports))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlBRE_listLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBooks, btnEquipment, btnReports});

        pnlBRE_listLayout.setVerticalGroup(
            pnlBRE_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBRE_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEquipment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBRE_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBRE_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBRE_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlBRE_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlLeft);

        pnlRight.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlRight.setLayout(new java.awt.CardLayout(10, 10));

        javax.swing.GroupLayout pnlBREBlankLayout = new javax.swing.GroupLayout(pnlBREBlank);
        pnlBREBlank.setLayout(pnlBREBlankLayout);
        pnlBREBlankLayout.setHorizontalGroup(
            pnlBREBlankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        pnlBREBlankLayout.setVerticalGroup(
            pnlBREBlankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        pnlRight.add(pnlBREBlank, "cardBlank");

        getContentPane().add(pnlRight);

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        button = 0;
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardInfo");
        setBREInfoComponents(true);
        setTextFields();
        frms.bre.panels.BREInfo.txtBPN_bk.requestFocusInWindow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        button = 1;
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardBorrow");
        frms.bre.panels.BREBorrow.setDefault();

    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardReserve");
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardSummary");
        frms.bre.panels.BRESummary.tblSummary.setModel(
                new DefaultTableModel(frms.Home.database.getSummary(frms.bre.panels.BRESummary.columns_transaction),
                frms.bre.panels.BRESummary.colh_transaction));
    }//GEN-LAST:event_btnSummaryActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        setBREInfoComponents(false);
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardInfo");
        frms.bre.panels.BREInfo.txtItemNumber_bk.requestFocusInWindow();
        setTextFields();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new frms.Modules().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardSearch");
        button = 0;
        frms.bre.panels.BRESearch.tblBRE.setModel(new DefaultTableModel(
                getTable(), getColumnHeader()));
        setSearchComponents();
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardSearch");
        button = 1;
        frms.bre.panels.BRESearch.tblBRE.setModel(new DefaultTableModel(
                getTable(), getColumnHeader()));
        setSearchComponents();

    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipmentActionPerformed
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardSearch");
        button = 2;
        frms.bre.panels.BRESearch.tblBRE.setModel(new DefaultTableModel(
                getTable(), getColumnHeader()));
        setSearchComponents();

    }//GEN-LAST:event_btnEquipmentActionPerformed

    private void btReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReturnActionPerformed
        CardLayout card = (CardLayout) pnlRight.getLayout();
        card.show(pnlRight, "cardReturn");
        setBREReturnVisible(false);
    }//GEN-LAST:event_btReturnActionPerformed

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
            java.util.logging.Logger.getLogger(BRE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRE().setVisible(true);
            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReturn;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnEquipment;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnSummary;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel pnlBREBlank;
    private javax.swing.JPanel pnlBRE_buttons;
    private javax.swing.JPanel pnlBRE_list;
    private javax.swing.JPanel pnlLeft;
    public static javax.swing.JPanel pnlRight;
    // End of variables declaration//GEN-END:variables

    /*
     * THE METHOD setBREInfoComponents
     * 
     * The boolean b is true if the button btnAdd is clicked.
     * Otherwise, the button btnUpdate is clicked.
     * 
     */
    public int tab() {
        return frms.bre.panels.BREInfo.tbpBRE.getSelectedIndex();
    }

    private void setBREInfoComponents(boolean b) {
        frms.bre.panels.BREInfo BREInfo = new frms.bre.panels.BREInfo();
        BREInfo.lblItemTitle.setText((b ? "Add " : "Update ") + "Item");
        BREInfo.chkConfirm.setText((b ? "Add " : "Update ")
                + "without confirm");

        /* Set the textfields */
        BREInfo.txtAuthor_bk.setEnabled(b);
        BREInfo.txtAuthor_rp.setEnabled(b);
        BREInfo.txtBPN_bk.setEnabled(b);
        BREInfo.txtBPN_eq.setEnabled(b);
        BREInfo.txtDescription_eq.setEnabled(b);
        BREInfo.txtItemNumber_bk.setEnabled(!b);
        BREInfo.txtItemNumber_eq.setEnabled(!b);
        BREInfo.txtItemNumber_rp.setEnabled(!b);
        BREInfo.txtQuantity_bk.setEnabled(b);
        BREInfo.txtSerialNumber_eq.setEnabled(b);
        BREInfo.txtTitle_bk.setEnabled(b);
        BREInfo.txtTitle_rp.setEnabled(b);

        /* Set the buttons */
        BREInfo.btnUpdate.setVisible(false); //Always
        BREInfo.btnDelete.setVisible(false); //Always
        BREInfo.btnAdd.setVisible(b);
        BREInfo.chkConfirm.setVisible(b);

        /* Set 1st tab */
        BREInfo.tbpBRE.setSelectedIndex(0);//Always
        BREInfo.tbpBRE.requestFocusInWindow();

        button = b ? 0 : 1;

    }

    private void setSearchComponents() {
        if (button == 2) {

            //Equipment
            frms.bre.panels.BRESearch.chkColumn1.setText("BIR Property Number");
            frms.bre.panels.BRESearch.chkColumn2.setText(("Description"));
            frms.bre.panels.BRESearch.chkColumn3.setText(("Serial Number"));
            frms.bre.panels.BRESearch.chkColumn3.setVisible(true);

        } else {

            //Books and Reports
            frms.bre.panels.BRESearch.lblTitle.setText(
                    button == 0 ? "Book Search" : "Reports Search");
            frms.bre.panels.BRESearch.chkColumn1.setText("Title");
            frms.bre.panels.BRESearch.chkColumn2.setText(("Author"));
            frms.bre.panels.BRESearch.chkColumn3.setVisible(false);
        }
        frms.bre.panels.BRESearch.chkColumn1.setSelected(false);
        frms.bre.panels.BRESearch.chkColumn2.setSelected(false);
        frms.bre.panels.BRESearch.chkColumn3.setSelected(false);
        frms.bre.panels.BRESearch.txtSearch.setText(null);


        frms.bre.panels.BRESearch.radAll.setSelected(true);
        frms.bre.panels.BRESearch.chkColumn3.setEnabled(false);
        frms.bre.panels.BRESearch.chkColumn2.setEnabled(false);
        frms.bre.panels.BRESearch.chkColumn1.setEnabled(false);
        frms.bre.panels.BRESearch.txtSearch.setEnabled(false);
        frms.bre.panels.BRESearch.btnSearch.setEnabled(false);
    }

    private void setTextFields() {
        frms.bre.panels.BREInfo.setTextFields();
    }

    private String[][] getTable() {
        return frms.Home.database.getTable(getColumn(button),
                button);
    }

    private String[] getColumn(int button) {
        return button == 0
                ? frms.bre.panels.BRESearch.book_column
                : button == 1
                ? frms.bre.panels.BRESearch.reports_column
                : frms.bre.panels.BRESearch.equip_column;
    }

    private String[] getColumnHeader() {
        return button == 0
                ? frms.bre.panels.BRESearch.book_column_header
                : button == 1
                ? frms.bre.panels.BRESearch.reports_column_header
                : frms.bre.panels.BRESearch.equip_column_header;

    }

    private void setBREReturnVisible(boolean b) {
        frms.bre.panels.BREReturn.txtEmployeeName.setText(null);
        frms.bre.panels.BREReturn.txtEmployeeNumber.setText(null);
        frms.bre.panels.BREReturn.lblToBeReturned.setVisible(b);
        frms.bre.panels.BREReturn.btnReturn.setVisible(b);
    }
}