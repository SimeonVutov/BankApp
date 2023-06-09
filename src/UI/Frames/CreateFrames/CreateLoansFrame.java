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
public class CreateLoansFrame extends EditFrame {
    private Application _app;
    private BankAccount _selectedBankAccount = null;
    private String _name;
    private String _money;
    private String _date;
    /**
     * Creates new form CreatePlannedPaymentFrame
     */
    public CreateLoansFrame(Application app) {
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
        nameLabel = new javax.swing.JLabel();
        amountOfMoneyLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        amountOfMoneyTextField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        typeOfLoanLabel = new javax.swing.JLabel();
        returnAmountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(201, 201, 201));

        createPlannedPaymentTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        createPlannedPaymentTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        createPlannedPaymentTitleLabel.setText("Take out a loan");

        bankAccountsList.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(bankAccountsList);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));

        bankAccountsLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        bankAccountsLabel.setForeground(new java.awt.Color(0, 0, 0));
        bankAccountsLabel.setText("Bank Account:");

        nameLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name:");

        amountOfMoneyLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        amountOfMoneyLabel.setForeground(new java.awt.Color(0, 0, 0));
        amountOfMoneyLabel.setText("Amount of money:");

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

        typeOfLoanLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        typeOfLoanLabel.setText("This is a 5% 1 month loan");

        returnAmountLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        returnAmountLabel.setText("You will need to return your soul until 21.2.2025.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createPlannedPaymentTitleLabel)
                        .addGap(240, 240, 240))))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(typeOfLoanLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(returnAmountLabel)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountOfMoneyLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addComponent(bankAccountsLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountOfMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(createPlannedPaymentTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeOfLoanLabel)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankAccountsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountOfMoneyLabel)
                    .addComponent(amountOfMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(returnAmountLabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        _selectedBankAccount = bankAccountsList.getSelectedValue();
        _name = nameTextField.getText();
        _money = amountOfMoneyTextField.getText();
        
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

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
    private javax.swing.JLabel amountOfMoneyLabel;
    private javax.swing.JTextField amountOfMoneyTextField;
    private javax.swing.JLabel bankAccountsLabel;
    private javax.swing.JList<BankAccount> bankAccountsList;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel createPlannedPaymentTitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel returnAmountLabel;
    private javax.swing.JLabel typeOfLoanLabel;
    // End of variables declaration//GEN-END:variables
}
