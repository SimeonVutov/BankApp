/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames.CreateFrames;

import BankAccount.BankAccount;
import Core.Application;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Moni
 */
public class CreateDepositTransactionFrame extends CreateFrame {
    private Application _app;
    private BankAccount _bankAccount;
    private String _amouthOfMoney;
    /**
     * Creates new form CreateTransactionFrame
     */
    public CreateDepositTransactionFrame(Application app) {
        initComponents();
        _app = app;
        
        DefaultListModel<BankAccount> bankAccountsListModel = new DefaultListModel<>();
        bankAccountsList.setModel(bankAccountsListModel);
        
        for(var bankAccount : _app.getAllBankAccounts()) {
            bankAccountsListModel.addElement(bankAccount);
        }
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        bankAccountsList = new javax.swing.JList<>();
        bankAccountsLabel = new javax.swing.JLabel();
        moneyTextField = new javax.swing.JTextField();
        moneyLabel = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(bankAccountsList);

        bankAccountsLabel.setText("bankAccounts");

        moneyLabel.setText("Amouth of money");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bankAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moneyTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moneyLabel)
                                .addGap(0, 167, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(bankAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(moneyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        _bankAccount = bankAccountsList.getSelectedValue();
        _amouthOfMoney = moneyTextField.getText();
        
        List<String> errors = validateInput();
        
        if(errors.size() == 0) {
            try {
                _app.createTransaction(new BigDecimal(_amouthOfMoney), null, _bankAccount.getIban());
                getDataCreatedEvent().fireDataCreatedEvent();
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error has occured!", "Error", 0);
                e.printStackTrace();
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

    private List<String> validateInput() {
        List<String> errors = new LinkedList<>();
        
        if(!_amouthOfMoney.matches("^([1-9]{1}[0-9]*(\\.[0-9]{0,})?|0(\\.[0-9]{0,})?|(\\.[0-9]{1,}))$")) {
            errors.add("Invalid amouth of money");
        }
        else {
            BigDecimal money = new BigDecimal(moneyTextField.getText());
            if(money.compareTo(BigDecimal.ZERO) <= 0) {
                errors.add("The amouth of money cannot be equal or less than zero.");
            }
        }
        if(_bankAccount == null) {
            errors.add("A bank account was not selected");
        }
        
        return errors;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankAccountsLabel;
    private javax.swing.JList<BankAccount> bankAccountsList;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JTextField moneyTextField;
    // End of variables declaration//GEN-END:variables
}
