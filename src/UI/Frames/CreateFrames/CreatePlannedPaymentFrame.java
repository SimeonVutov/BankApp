/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames.CreateFrames;

import BankAccount.BankAccount;
import Core.Application;
import Database.ItemAlreadyExistsException;
import UI.Frames.EditFrames.EditFrame;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Bubo & Yana
 */
public class CreatePlannedPaymentFrame extends EditFrame {
    private Application _app;
    private BankAccount _selectedBankAccount = null;
    private String _name;
    private String _money;
    private String _date;
    /**
     * Creates new form CreatePlannedPaymentFrame
     */
    public CreatePlannedPaymentFrame(Application app) {
        initComponents();
        _app = app;
        DefaultListModel<BankAccount> defaultListModel = new DefaultListModel<>();
        bankAccountsList.setModel(defaultListModel);
        defaultListModel.addAll(_app.getAllBankAccounts());
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPlannedPaymentTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bankAccountsList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        bankAccountsLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        amountOfMoneyTextField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(201, 201, 201));

        createPlannedPaymentTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        createPlannedPaymentTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        createPlannedPaymentTitleLabel.setText("Create planned payment");

        bankAccountsList.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(bankAccountsList);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Date:");

        bankAccountsLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        bankAccountsLabel.setForeground(new java.awt.Color(0, 0, 0));
        bankAccountsLabel.setText("Bank Account:");

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Amount of money:");

        dateTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        dateTextField.setText("01.01.2025");

        nameTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        amountOfMoneyTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        createBtn.setBackground(new java.awt.Color(255, 115, 115));
        createBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        createBtn.setForeground(new java.awt.Color(0, 0, 0));
        createBtn.setText("Create");
        createBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 30, 30)));
        createBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        cancelBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createPlannedPaymentTitleLabel)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(dateTextField)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountOfMoneyTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(bankAccountsLabel)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(createPlannedPaymentTitleLabel)
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amountOfMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(bankAccountsLabel)
                    .addContainerGap(729, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Create button checks
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        _selectedBankAccount = bankAccountsList.getSelectedValue();
        _name = nameTextField.getText();
        _money = amountOfMoneyTextField.getText();
        _date = dateTextField.getText();
        
        List<String> errors = validateInput();
        
        if(errors.size() == 0) {
            var dateStringArr = _date.split("[.]");
            LocalDate date = LocalDate.of(
                    Integer.parseInt(dateStringArr[2]),
                    Integer.parseInt(dateStringArr[1]),
                    Integer.parseInt(dateStringArr[0])
            );
            
            try {
                _app.createPlannedPayment(date, _selectedBankAccount.getIban(), new BigDecimal(_money), _name);
                getDataChangedEvent().fireDataChangedEvent();
                dispose();
            } catch (ItemAlreadyExistsException ex) {
                JOptionPane.showMessageDialog(this, "An error occured", "Error", 0);
            }
        }
        else {
            String errorMessage = "";
            
            for(var error : errors) {
                errorMessage = errorMessage.concat(error + '\n');
            }
            
            JOptionPane.showMessageDialog(this, errorMessage, "Error", 0);
        }
    }//GEN-LAST:event_createBtnActionPerformed

    //Cancle button functionality
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    //Validating information
    private List<String> validateInput() {
        List<String> errors = new LinkedList<>();
        
        if(_selectedBankAccount == null) {
            errors.add("Bank account was not selected");
        }
        if(_name.length() == 0) {
            errors.add("Planned payment name field cannot be empty");
        }
        if(!_money.matches("^([1-9]{1}[0-9]*(\\.[0-9]{0,})?|0(\\.[0-9]{0,})?|(\\.[0-9]{1,}))$")) {
            errors.add("Invalid amount of money");
        }
        if(!_date.matches("^\\d{2}.\\d{2}.\\d{4}$")) {
            errors.add("Invalid date");
        }

        return errors;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountOfMoneyTextField;
    private javax.swing.JLabel bankAccountsLabel;
    private javax.swing.JList<BankAccount> bankAccountsList;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel createPlannedPaymentTitleLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
