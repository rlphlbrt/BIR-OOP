package frms.employee.panels;

import javax.swing.*;
import mysql.Database;

public class EmployeeInfo1 extends javax.swing.JPanel {

    String[] data;
    String message;
    boolean reset;

    public EmployeeInfo1() {
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

        rbgResetGroup = new javax.swing.ButtonGroup();
        lblEmployeeTitle = new javax.swing.JLabel();
        pnlEmployee = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        lblMiddleInitial = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        txtEmployeeNumber = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtMiddleInitial = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox();
        pnlReset = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        radResetYes = new javax.swing.JRadioButton();
        radResetNo = new javax.swing.JRadioButton();
        chkConfirm = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();

        lblEmployeeTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmployeeTitle.setText("");

        lblNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNumber.setText("Employee Number:");

        lblSurname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSurname.setText("Surname:");

        lblFirstname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblFirstname.setText("First Name:");

        lblMiddleInitial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMiddleInitial.setText("Middle Initial:");

        lblDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDepartment.setText("Department:");

        lblUserType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUserType.setText("User Type:");

        txtEmployeeNumber.setColumns(8);
        txtEmployeeNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmployeeNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmployeeNumberKeyTyped(evt);
            }
        });

        txtSurname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSurnameKeyReleased(evt);
            }
        });

        txtFirstname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtFirstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstnameKeyReleased(evt);
            }
        });

        txtMiddleInitial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMiddleInitial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMiddleInitialKeyReleased(evt);
            }
        });

        txtDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDepartmentKeyReleased(evt);
            }
        });

        cmbUserType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Admin" }));
        cmbUserType.setSelectedIndex(-1);
        cmbUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserTypeActionPerformed(evt);
            }
        });

        lblreset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblreset.setText("Reset Password:");

        rbgResetGroup.add(radResetYes);
        radResetYes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radResetYes.setText("Yes");

        rbgResetGroup.add(radResetNo);
        radResetNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radResetNo.setSelected(true);
        radResetNo.setText("No");

        javax.swing.GroupLayout pnlResetLayout = new javax.swing.GroupLayout(pnlReset);
        pnlReset.setLayout(pnlResetLayout);
        pnlResetLayout.setHorizontalGroup(
            pnlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResetLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblreset)
                .addGap(18, 18, 18)
                .addComponent(radResetYes)
                .addGap(18, 18, 18)
                .addComponent(radResetNo)
                .addContainerGap())
        );
        pnlResetLayout.setVerticalGroup(
            pnlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblreset)
                    .addComponent(radResetYes)
                    .addComponent(radResetNo))
                .addContainerGap())
        );

        chkConfirm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkConfirm.setSelected(true);
        chkConfirm.setText("Save without confirm");

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEmployeeLayout = new javax.swing.GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chkConfirm)
                            .addComponent(btnSave)
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addComponent(lblSurname)
                                .addGap(49, 49, 49)
                                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addComponent(lblFirstname)
                                .addGap(33, 33, 33)
                                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addComponent(lblMiddleInitial)
                                .addGap(18, 18, 18)
                                .addComponent(txtMiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                                .addComponent(lblDepartment)
                                .addGap(28, 28, 28)
                                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUserType))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtEmployeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstname)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMiddleInitial)
                    .addComponent(txtMiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserType)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(chkConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmployeeTitle)
                    .addComponent(pnlEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmployeeTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNumberKeyReleased
        String text = txtEmployeeNumber.getText();
        if (txtEmployeeNumber.getText().length() > 10) {
            txtEmployeeNumber.setText(text.substring(0, 10));
        }

        if (Employee.button == 1
                && frms.Home.database.isEmployeeExisted(text)) {
            txtSurname.setText(Database.getEmployeeInfo[0]);
            txtFirstname.setText(Database.getEmployeeInfo[1]);
            txtMiddleInitial.setText(Database.getEmployeeInfo[2]);
            txtDepartment.setText(Database.getEmployeeInfo[3]);
            cmbUserType.setSelectedIndex(Database.getEmployeeUserType);

        } else {
            if (Employee.button == 1) {
                txtSurname.setText(txtEmployeeNumber.getText());
                txtFirstname.setText(txtEmployeeNumber.getText());
                txtMiddleInitial.setText(txtEmployeeNumber.getText());
                txtDepartment.setText(txtEmployeeNumber.getText());
                cmbUserType.setSelectedIndex(-1);
            }
        }
    }//GEN-LAST:event_txtEmployeeNumberKeyReleased

    private void txtEmployeeNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNumberKeyTyped
        if (Employee.button == 1 && evt.getKeyChar() == 10
                && frms.Home.database.isEmployeeExisted(txtEmployeeNumber.getText())) {
            setFieldComponents(true);
            txtSurname.requestFocus(true);
        }
    }//GEN-LAST:event_txtEmployeeNumberKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (areOneOfTextFieldsEmpty() || isComboBoxNotSelected()) {
            JOptionPane.showMessageDialog(null,
                    "Please enter complete information.",
                    Employee.button == 0 ? "Add " : "Update " + "Employee", 1);
        } else {
            if (Employee.button == 0) {
                getTextFieldsFromAdd();
                if (chkConfirm.isSelected()) {
                    addEmployee();

                } else {
                    if (JOptionPane.showConfirmDialog(null, message, "Add Employee", 0, 3) == 0) {
                        addEmployee();
                    }
                }
            } else {
                getTextFieldsFromUpdate();
                if (chkConfirm.isSelected()) {
                    updateEmployee();
                } else {
                    if (JOptionPane.showConfirmDialog(null, message, "Update Employee", 0, 3) == 0) {
                        updateEmployee();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtMiddleInitialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMiddleInitialKeyReleased
        String text = txtMiddleInitial.getText();
        if (txtMiddleInitial.getText().length() > 1) {
            txtMiddleInitial.setText(text.substring(0, 1));
        }
    }//GEN-LAST:event_txtMiddleInitialKeyReleased

    private void txtFirstnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstnameKeyReleased
        String text = txtFirstname.getText();
        if (txtFirstname.getText().length() > 32) {
            txtFirstname.setText(text.substring(0, 32));
        }
    }//GEN-LAST:event_txtFirstnameKeyReleased

    private void txtSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyReleased
        String text = txtSurname.getText();
        if (txtSurname.getText().length() > 32) {
            txtSurname.setText(text.substring(0, 32));
        }
    }//GEN-LAST:event_txtSurnameKeyReleased

    private void txtDepartmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartmentKeyReleased
        String text = txtDepartment.getText();
        if (txtDepartment.getText().length() > 32) {
            txtDepartment.setText(text.substring(0, 32));
        }
    }//GEN-LAST:event_txtDepartmentKeyReleased

    private void cmbUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnSave;
    public static javax.swing.JCheckBox chkConfirm;
    public static javax.swing.JComboBox cmbUserType;
    private javax.swing.JLabel lblDepartment;
    public static javax.swing.JLabel lblEmployeeTitle;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblMiddleInitial;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblreset;
    private javax.swing.JPanel pnlEmployee;
    public static javax.swing.JPanel pnlReset;
    public static javax.swing.JRadioButton radResetNo;
    public static javax.swing.JRadioButton radResetYes;
    public static javax.swing.ButtonGroup rbgResetGroup;
    public static javax.swing.JTextField txtDepartment;
    public static javax.swing.JTextField txtEmployeeNumber;
    public static javax.swing.JTextField txtFirstname;
    public static javax.swing.JTextField txtMiddleInitial;
    public static javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    /*
     * THE METHOD setFieldComponents
     * 
     * boolean TRUE
     * When the enter key is pressed in txtEmployeeNumber,
     * all textfields except txtEmployeeNumber, radiobuttons and combo box
     * are enabled and chkConfirm and btnSave is set to visible state.
     * 
     */
    private void setFieldComponents(boolean b) {
        txtEmployeeNumber.setEnabled(!b);
        txtSurname.setEnabled(b);
        txtFirstname.setEnabled(b);
        txtMiddleInitial.setEnabled(b);
        txtDepartment.setEnabled(b);
        cmbUserType.setEnabled(b);
        radResetYes.setEnabled(b);
        radResetNo.setEnabled(b);
        chkConfirm.setVisible(b);
        btnSave.setVisible(b);
    }

    /*
     * THE METHOD areOneOfTextFieldsEmpty
     * The return value is false if and only if the textfields are entered.
     */
    private boolean areOneOfTextFieldsEmpty() {
        return (txtEmployeeNumber.getText().isEmpty()
                || txtSurname.getText().isEmpty()
                || txtFirstname.getText().isEmpty()
                || txtDepartment.getText().isEmpty())
                ? true
                : false;
    }

    /*
     * THE METHOD isComboBoxNotSelected
     * The return value is true if the combo box, cmbUserType, is not selected.
     */
    private boolean isComboBoxNotSelected() {
        return cmbUserType.getSelectedIndex() == -1;
    }

    private boolean isEmployeeExisted(String data) {
        return frms.Home.database.isEmployeeExisted(data);
    }

    private boolean isEmployeeNumberANumber(String data) {
        boolean isNum = true;
        try {
            Integer.parseInt(data);
        } catch (Exception e) {
            isNum = false;
        }
        return isNum;
    }

    private void getTextFieldsFromAdd() {
        data = new String[6];
        data[0] = txtEmployeeNumber.getText();
        data[1] = txtSurname.getText();
        data[2] = txtFirstname.getText();
        data[3] = txtMiddleInitial.getText();
        data[4] = txtDepartment.getText();
        data[5] = String.valueOf(cmbUserType.getSelectedIndex());
        message = "Employee Number: " + data[0] + "\n"
                + "Surname: " + data[1] + "\n"
                + "First name: " + data[2] + "\n"
                + "Middle Initial: " + data[3] + "\n"
                + "Department: " + data[4] + "\n"
                + "User Type: " + (data[5].equals("0") ? "User" : "Admin")
                + "\nConfirm?";
    }

    private void addEmployee() {
        if (isEmployeeNumberANumber(data[0])) {
            if (isEmployeeExisted(data[0])) {
                JOptionPane.showMessageDialog(null,
                        "Employee number is existed.", null, 1, null);
            } else {
                //Add
                frms.Home.database.addEmployee(data);
                //Set Components
                txtEmployeeNumber.setText(null);
                txtSurname.setText(null);
                txtFirstname.setText(null);
                txtMiddleInitial.setText(null);
                txtDepartment.setText(null);
                cmbUserType.setSelectedIndex(-1);
                txtEmployeeNumber.requestFocusInWindow();

                JOptionPane.showMessageDialog(null,
                        "The employee number is created.", "Add Employee", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Please enter correct Employee number.", null, 1, null);
        }
    }

    private void getTextFieldsFromUpdate() {
        getTextFieldsFromAdd();
        message = "Employee Number: " + data[0] + "\n"
                + "Surname: " + data[1] + "\n"
                + "First name: " + data[2] + "\n"
                + "Middle Initial: " + data[3] + "\n"
                + "Department: " + data[4] + "\n"
                + "User Type: " + (data[5].equals("0") ? "User" : "Admin")
                + "\n" + "Reset Password: "
                + (radResetYes.isSelected() ? "YES" : "NO")
                + "\nConfirm?";
        reset = radResetYes.isSelected();
    }

    private void updateEmployee() {
        //Add
        frms.Home.database.updateEmployee(data, reset);
        JOptionPane.showMessageDialog(null, "Update successful.",
                "Update Employee", 1);
        //Set Components

        //empty textfields
        txtEmployeeNumber.setText(null);
        txtSurname.setText(null);
        txtFirstname.setText(null);
        txtMiddleInitial.setText(null);
        txtDepartment.setText(null);

        //disable fields except txtEmployeeNumber
        txtEmployeeNumber.setEnabled(true);
        txtSurname.setEnabled(false);
        txtFirstname.setEnabled(false);
        txtMiddleInitial.setEnabled(false);
        txtDepartment.setEnabled(false);
        cmbUserType.setEnabled(false);
        radResetYes.setEnabled(false);
        radResetNo.setEnabled(false);

        //select default
        radResetYes.setSelected(false);
        radResetNo.setSelected(true);

        //others
        cmbUserType.setSelectedIndex(-1);
        txtEmployeeNumber.requestFocusInWindow();
    }
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo1().setVisible(true);
            }
        });
    }
}
