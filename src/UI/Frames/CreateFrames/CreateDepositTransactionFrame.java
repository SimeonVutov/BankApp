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
    private Application app;
    private BankAccount bankAccount;
    private String amouthOfMoney;
    /**
     * Creates new form CreateTransactionFrame
     */
    public CreateDepositTransactionFrame(Application app) {
        initComponents();
        this.app = app;
        
        DefaultListModel<BankAccount> bankAccountsListModel = new DefaultListModel<>();
        bankAccountsList.setModel(bankAccountsListModel);
        
        for(var bankAccount : app.getAllBankAccounts()) {
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(201, 201, 201));

        bankAccountsList.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(bankAccountsList);

        bankAccountsLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        bankAccountsLabel.setForeground(new java.awt.Color(0, 0, 0));
        bankAccountsLabel.setText("Bank Accounts:");

        moneyTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        moneyLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(0, 0, 0));
        moneyLabel.setText("Amount of money:");

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

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Create deposit transaction");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(moneyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(moneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bankAccountsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(moneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyLabel))
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Creates a deposit transaction
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        bankAccount = bankAccountsList.getSelectedValue();
        amouthOfMoney = moneyTextField.getText();
        
        List<String> errors = validateInput();
        
        if(errors.size() == 0) {
            try {
                app.createTransaction(new BigDecimal(amouthOfMoney), null, bankAccount.getIban());
                getDataRefreshEvent().fireDataRefreshEvent();
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

    //Closes the frame
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    //Validating input
    private List<String> validateInput() {
        List<String> errors = new LinkedList<>();
        
        if(!amouthOfMoney.matches("^([1-9]{1}[0-9]*(\\.[0-9]{0,})?|0(\\.[0-9]{0,})?|(\\.[0-9]{1,}))$")) {
            errors.add("Invalid amouth of money");
        }
        else {
            BigDecimal money = new BigDecimal(moneyTextField.getText());
            if(money.compareTo(BigDecimal.ZERO) <= 0) {
                errors.add("The amouth of money cannot be equal or less than zero.");
            }
        }
        if(bankAccount == null) {
            errors.add("A bank account was not selected");
        }
        
        return errors;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankAccountsLabel;
    private javax.swing.JList<BankAccount> bankAccountsList;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JTextField moneyTextField;
    // End of variables declaration//GEN-END:variables
}
