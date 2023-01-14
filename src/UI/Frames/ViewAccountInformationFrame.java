/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;
import UI.Frames.EditFrames.EditBankAccountFrame;
import UI.Frames.EditFrames.DataChangedListener;
import Core.Application;
import Core.FramesController;
import UI.UI_Variables;
import BankAccount.BankAccount;
import Core.FrameType;
import TransactionSystem.Transaction;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bubo & Yana
 */
public class ViewAccountInformationFrame extends javax.swing.JFrame implements DataChangedListener {
    private Application _app;
    private FramesController _framesController;
    private BankAccount _bankAccount;
    private DefaultListModel<Transaction> _transactionsDefaultListModel;
    
    /**
     * Creates new form ViewAccountInformationFrame
     */
    public ViewAccountInformationFrame(Application application, FramesController framesController, Object iban) {
        initComponents();
        _app = application;
        _framesController = framesController;
        
        _bankAccount = _app.getBankAccountByIban((String) iban);
        _transactionsDefaultListModel = new DefaultListModel<>();
        transactionHistoryList.setModel(_transactionsDefaultListModel);
        
        //UI settings
        setSize(1920, 935);
        setBackground(UI_Variables.BACKGROUND_COLOR);
        
        //Setting infromation
        usernameLabel.setText(_app.getUser().getUsername());
        loadData();
        
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

        navBarPannel = new javax.swing.JPanel();
        transactionsBtn = new javax.swing.JButton();
        contactUsBtn = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        viewUserProfileBtn = new javax.swing.JButton();
        transactionHistoryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionHistoryList = new javax.swing.JList<>();
        transactionHistoryTitleLabel = new javax.swing.JLabel();
        currentBalancePanel = new javax.swing.JPanel();
        cudentBalanceTitleLabel = new javax.swing.JLabel();
        currentBalanceLabel = new javax.swing.JLabel();
        ibanPanel = new javax.swing.JPanel();
        ibanTitleLabel = new javax.swing.JLabel();
        ibanLabel = new javax.swing.JLabel();
        accoutNamePanel = new javax.swing.JPanel();
        accountNameTitleLabel = new javax.swing.JLabel();
        acouuntNameLabel = new javax.swing.JLabel();
        accountNameLabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navBarPannel.setBackground(new java.awt.Color(255, 115, 115));
        navBarPannel.setPreferredSize(new java.awt.Dimension(1920, 99));

        transactionsBtn.setBackground(new java.awt.Color(255, 115, 115));
        transactionsBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        transactionsBtn.setForeground(new java.awt.Color(0, 0, 0));
        transactionsBtn.setText("Transactions");
        transactionsBtn.setAlignmentY(0.0F);
        transactionsBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        transactionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsBtnActionPerformed(evt);
            }
        });

        contactUsBtn.setBackground(new java.awt.Color(255, 115, 115));
        contactUsBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        contactUsBtn.setForeground(new java.awt.Color(0, 0, 0));
        contactUsBtn.setText("Contact Us");
        contactUsBtn.setToolTipText("");
        contactUsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactUsBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        contactUsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUsBtnActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("User Name");

        viewUserProfileBtn.setBackground(new java.awt.Color(255, 115, 115));
        viewUserProfileBtn.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        viewUserProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUserProfileBtn.setText("View user profile");
        viewUserProfileBtn.setBorder(null);
        viewUserProfileBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewUserProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarPannelLayout = new javax.swing.GroupLayout(navBarPannel);
        navBarPannel.setLayout(navBarPannelLayout);
        navBarPannelLayout.setHorizontalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(transactionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewUserProfileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        navBarPannelLayout.setVerticalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navBarPannelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewUserProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        transactionHistoryPanel.setBackground(new java.awt.Color(201, 201, 201));

        transactionHistoryList.setFont(new java.awt.Font("Gadugi", 0, 28)); // NOI18N
        transactionHistoryList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(transactionHistoryList);

        transactionHistoryTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        transactionHistoryTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        transactionHistoryTitleLabel.setText("Transaction History");

        javax.swing.GroupLayout transactionHistoryPanelLayout = new javax.swing.GroupLayout(transactionHistoryPanel);
        transactionHistoryPanel.setLayout(transactionHistoryPanelLayout);
        transactionHistoryPanelLayout.setHorizontalGroup(
            transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(221, 746, Short.MAX_VALUE)
                .addComponent(transactionHistoryTitleLabel)
                .addGap(611, 611, 611))
        );
        transactionHistoryPanelLayout.setVerticalGroup(
            transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(transactionHistoryTitleLabel)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        currentBalancePanel.setBackground(new java.awt.Color(201, 201, 201));

        cudentBalanceTitleLabel.setBackground(new java.awt.Color(201, 201, 201));
        cudentBalanceTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        cudentBalanceTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        cudentBalanceTitleLabel.setText("Current Balance");

        currentBalanceLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N

        javax.swing.GroupLayout currentBalancePanelLayout = new javax.swing.GroupLayout(currentBalancePanel);
        currentBalancePanel.setLayout(currentBalancePanelLayout);
        currentBalancePanelLayout.setHorizontalGroup(
            currentBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalancePanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(cudentBalanceTitleLabel)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(currentBalancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        currentBalancePanelLayout.setVerticalGroup(
            currentBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cudentBalanceTitleLabel)
                .addGap(33, 33, 33)
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ibanPanel.setBackground(new java.awt.Color(201, 201, 201));

        ibanTitleLabel.setBackground(new java.awt.Color(201, 201, 201));
        ibanTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        ibanTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        ibanTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibanTitleLabel.setText("IBAN");

        ibanLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N

        javax.swing.GroupLayout ibanPanelLayout = new javax.swing.GroupLayout(ibanPanel);
        ibanPanel.setLayout(ibanPanelLayout);
        ibanPanelLayout.setHorizontalGroup(
            ibanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ibanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ibanPanelLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(ibanTitleLabel)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        ibanPanelLayout.setVerticalGroup(
            ibanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ibanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibanTitleLabel)
                .addGap(33, 33, 33)
                .addComponent(ibanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accoutNamePanel.setBackground(new java.awt.Color(201, 201, 201));

        accountNameTitleLabel.setBackground(new java.awt.Color(201, 201, 201));
        accountNameTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        accountNameTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        accountNameTitleLabel.setText("Account name");

        acouuntNameLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N

        accountNameLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        accountNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout accoutNamePanelLayout = new javax.swing.GroupLayout(accoutNamePanel);
        accoutNamePanel.setLayout(accoutNamePanelLayout);
        accoutNamePanelLayout.setHorizontalGroup(
            accoutNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accoutNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acouuntNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(accoutNamePanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(accountNameTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accoutNamePanelLayout.setVerticalGroup(
            accoutNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accoutNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountNameTitleLabel)
                .addGap(25, 25, 25)
                .addGroup(accoutNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acouuntNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Edit");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(0, 0, 0));
        removeBtn.setText("Remove");
        removeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBarPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(transactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ibanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(accoutNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accoutNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.TRANSACTION_FRAME);
    }//GEN-LAST:event_transactionsBtnActionPerformed

    private void contactUsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.CONTACT_US_FRAME);
    }//GEN-LAST:event_contactUsBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        EditBankAccountFrame editBankAccountFrame = new EditBankAccountFrame(_bankAccount);
        editBankAccountFrame.getDataChangedEvent().addListener(this);
    }//GEN-LAST:event_editBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        _app.removeBankAccount(_bankAccount.getIban());
        _framesController.openFrame(FrameType.MAIN_FRAME);
        dispose();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void viewUserProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserProfileBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.VIEW_USER_FRAME);
        dispose();
    }//GEN-LAST:event_viewUserProfileBtnActionPerformed

    private void loadData() {
        ibanLabel.setText(_bankAccount.getIban());
        accountNameLabel.setText(_bankAccount.getName());
        currentBalanceLabel.setText(_bankAccount.getBalance().toString());
        
        for(var transaction : _app.getTransactionsForBankAccount(_bankAccount.getIban())) {
            _transactionsDefaultListModel.addElement(transaction);
        }
    }
    
    @Override
    public void onDataChangedEvent() {
        loadData();
        _app.save();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JLabel accountNameTitleLabel;
    private javax.swing.JPanel accoutNamePanel;
    private javax.swing.JLabel acouuntNameLabel;
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JLabel cudentBalanceTitleLabel;
    private javax.swing.JLabel currentBalanceLabel;
    private javax.swing.JPanel currentBalancePanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel ibanLabel;
    private javax.swing.JPanel ibanPanel;
    private javax.swing.JLabel ibanTitleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JButton removeBtn;
    private javax.swing.JList<Transaction> transactionHistoryList;
    private javax.swing.JPanel transactionHistoryPanel;
    private javax.swing.JLabel transactionHistoryTitleLabel;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables

}
