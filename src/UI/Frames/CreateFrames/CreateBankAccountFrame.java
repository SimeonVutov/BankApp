/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames.CreateFrames;

import Core.Application;
import Database.ItemAlreadyExistsException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bubo & Yana
 */
public class CreateBankAccountFrame extends CreateFrame {
    private Application app;
    private String bankAccountName;
    /**
     * Creates new form CreateBankAccountFrame
     */
    public CreateBankAccountFrame(Application app) {
        initComponents();
        this.app = app;
        
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

        cancelBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        createABankAccountLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(201, 201, 201));

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        cancelBtn.setMinimumSize(new java.awt.Dimension(213, 84));
        cancelBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bank account name:");

        createABankAccountLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        createABankAccountLabel.setForeground(new java.awt.Color(0, 0, 0));
        createABankAccountLabel.setText("Create a bank account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(createABankAccountLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(createABankAccountLabel)
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Creates a new bank account
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        bankAccountName = nameTextField.getText();
        
        //Errors
        List<String> errors = validateInput();
        
        if(errors.size() == 0) {
            try {
                app.createBankAccount(bankAccountName);
                getDataRefreshEvent().fireDataRefreshEvent();
                dispose();
            } catch (ItemAlreadyExistsException ex) {
                JOptionPane.showMessageDialog(this, "An error has occured.", "Error", 0);
            }
        }
        else {
            String errorMessage = "";
            
            for(String error : errors) {
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
        
        if(bankAccountName.length() == 0) {
            errors.add("Bank account name field cannot be empty");
        }
        
        return errors;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel createABankAccountLabel;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
