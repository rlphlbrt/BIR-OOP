package frms.bre.panels;

import javax.swing.table.*;

public class BRESearch extends javax.swing.JPanel {

    public static String[] book_column;
    public static String[] book_column_header;
    public static String[] reports_column;
    public static String[] reports_column_header;
    public static String[] equip_column;
    public static String[] equip_column_header;
    private boolean[] check = new boolean[3];

    /**
     * Creates new form BRESearch
     */
    public BRESearch() {
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

        btngrpSelect = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        scrBooks = new javax.swing.JScrollPane();
        book_column = new String[]{"bk_num", "bk_title", "bk_author",
            "bk_itemnumber", "bk_qty", "bk_avail", "bk_borrowed",
            "bk_reserved"};
        book_column_header = new String[]{"Number", "Title", "Author",
            "Item Number", "Quantity", "Available", "Borrowed", "Reserved"};
        reports_column = new String[]{"rp_num", "rp_itemnumber", "rp_title",
            "rp_author", "rp_qty", "rp_avail", "rp_borrowed", "rp_reserved"};
        reports_column_header = new String[]{"Number", "Item Number", "Title",
            "Author", "Quantity", "Available", "Borrowed", "Reserved"};
        equip_column = new String[]{"eq_num", "eq_itemnumber", "bir_prop_num",
            "eq_desc", "eq_serial_num", "eq_qty", "eq_avail", "eq_borrowed",
            "eq_reserved"};
        equip_column_header = new String[]{"Number", "Item Number",
            "BIR Property Number", "Item Description", "Serial Number",
            "Quantity", "Available", "Borrowed", "Reserved"};
        tblBRE = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblKeyword = new javax.swing.JLabel();
        chkColumn1 = new javax.swing.JCheckBox();
        chkColumn2 = new javax.swing.JCheckBox();
        chkColumn3 = new javax.swing.JCheckBox();
        radAll = new javax.swing.JRadioButton();
        radSelect = new javax.swing.JRadioButton();

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitle.setText("");

        tblBRE.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblBRE.setModel(new javax.swing.table.DefaultTableModel(
            frms.Home.database.getTable((getColumn(getButtonValue())),
                getButtonValue()), getColumnHeader(getButtonValue())));
    tblBRE.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    scrBooks.setViewportView(tblBRE);

    txtSearch.setColumns(16);
    txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    txtSearch.setEnabled(false);

    btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    btnSearch.setText("Search");
    btnSearch.setEnabled(false);
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSearchActionPerformed(evt);
        }
    });

    lblKeyword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    lblKeyword.setText("Keyword:");

    chkColumn1.setText("");

    chkColumn2.setText("");

    chkColumn3.setText("");

    btngrpSelect.add(radAll);
    radAll.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    radAll.setSelected(true);
    radAll.setText("All");
    radAll.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            radAllActionPerformed(evt);
        }
    });

    btngrpSelect.add(radSelect);
    radSelect.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    radSelect.setText("Select");
    radSelect.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            radSelectActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblTitle)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(scrBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)
                        .addComponent(lblKeyword)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(radAll)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkColumn1)
                                .addComponent(chkColumn2)
                                .addComponent(chkColumn3)
                                .addComponent(radSelect))))))
            .addContainerGap(37, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radAll)
                        .addComponent(radSelect))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(chkColumn1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(chkColumn2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(chkColumn3)
                    .addGap(18, 18, 18)
                    .addComponent(lblKeyword)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSearch)))
            .addContainerGap(27, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        getSelectedCheckBoxes();
        tblBRE.setModel(new DefaultTableModel(
                frms.Home.database.getSearch(getColumn(getButtonValue()),
                txtSearch.getText(), getButtonValue(), check),
                getColumnHeader(getButtonValue())));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void radAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAllActionPerformed
        tblBRE.setModel(new DefaultTableModel(getTable(),
                getColumnHeader(getButtonValue())));
        setComponents(false);
        setSelectedCheckBox(false);
    }//GEN-LAST:event_radAllActionPerformed

    private void radSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSelectActionPerformed
        setComponents(true);
    }//GEN-LAST:event_radSelectActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup btngrpSelect;
    public static javax.swing.JCheckBox chkColumn1;
    public static javax.swing.JCheckBox chkColumn2;
    public static javax.swing.JCheckBox chkColumn3;
    private javax.swing.JLabel lblKeyword;
    public static javax.swing.JLabel lblTitle;
    public static javax.swing.JRadioButton radAll;
    public static javax.swing.JRadioButton radSelect;
    private javax.swing.JScrollPane scrBooks;
    public static javax.swing.JTable tblBRE;
    public static javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public int getButtonValue() {
        return frms.bre.BRE.button;
    }

    public String[] getColumn(int button) {
        return button == 0
                ? book_column
                : (button == 1 ? reports_column : equip_column);
    }

    public String[] getColumnHeader(int tab) {
        return tab == 0
                ? book_column_header
                : (tab == 1 ? reports_column_header : equip_column_header);
    }

    private String[][] getTable() {
        return frms.Home.database.getTable(getColumn(getButtonValue()),
                getButtonValue());
    }

    private void setComponents(boolean b) {
        txtSearch.setText(null);
        txtSearch.setEnabled(b);
        btnSearch.setEnabled(b);
        chkColumn1.setEnabled(b);
        chkColumn2.setEnabled(b);
        chkColumn3.setEnabled(b);
    }

    private void setSelectedCheckBox(boolean b) {
        chkColumn1.setSelected(b);
        chkColumn2.setSelected(b);
        chkColumn3.setSelected(b);

    }

    private void getSelectedCheckBoxes() {
        check[0] = chkColumn1.isSelected();
        check[1] = chkColumn2.isSelected();
        check[2] = chkColumn3.isSelected();
    }
}