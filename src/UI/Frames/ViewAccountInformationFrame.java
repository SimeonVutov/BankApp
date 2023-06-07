/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;
import UI.Frames.EditFrames.EditBankAccountFrame;
import Core.DataChangedListener;
import Core.Application;
import Core.FramesController;
import UI.UI_Variables;
import BankAccount.BankAccount;
import Core.FrameType;
import TransactionSystem.Transaction;
import java.util.List;
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
        userNameNavbar.setText(_app.getUser().getUsername());
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
        navBarPannel = new javax.swing.JPanel();
        transactionsBtn = new javax.swing.JButton();
        contactUsBtn = new javax.swing.JButton();
        userNameNavbar = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        viewUserProfileBtn = new javax.swing.JButton();
        mainPageBtn = new javax.swing.JButton();
        loansBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        transactionHistoryPanel.setBackground(new java.awt.Color(201, 201, 201));

        transactionHistoryList.setFont(new java.awt.Font("Gadugi", 1, 32)); // NOI18N
        transactionHistoryList.setForeground(new java.awt.Color(0, 0, 0));
        transactionHistoryList.setMaximumSize(new java.awt.Dimension(1710, 340));
        transactionHistoryList.setPreferredSize(new java.awt.Dimension(1650, 10000));
        jScrollPane1.setViewportView(transactionHistoryList);

        transactionHistoryTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        transactionHistoryTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        transactionHistoryTitleLabel.setText("Transaction History");

        javax.swing.GroupLayout transactionHistoryPanelLayout = new javax.swing.GroupLayout(transactionHistoryPanel);
        transactionHistoryPanel.setLayout(transactionHistoryPanelLayout);
        transactionHistoryPanelLayout.setHorizontalGroup(
            transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(221, 746, Short.MAX_VALUE)
                .addComponent(transactionHistoryTitleLabel)
                .addGap(611, 611, 611))
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transactionHistoryPanelLayout.setVerticalGroup(
            transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(transactionHistoryTitleLabel)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        currentBalancePanel.setBackground(new java.awt.Color(201, 201, 201));

        cudentBalanceTitleLabel.setBackground(new java.awt.Color(201, 201, 201));
        cudentBalanceTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        cudentBalanceTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        cudentBalanceTitleLabel.setText("Current Balance");

        currentBalanceLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        currentBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout currentBalancePanelLayout = new javax.swing.GroupLayout(currentBalancePanel);
        currentBalancePanel.setLayout(currentBalancePanelLayout);
        currentBalancePanelLayout.setHorizontalGroup(
            currentBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentBalancePanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(cudentBalanceTitleLabel)
                .addGap(135, 135, 135))
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
                .addGap(18, 18, 18)
                .addComponent(ibanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(acouuntNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(accoutNamePanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Edit account");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(234, 34, 34));
        removeBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(0, 0, 0));
        removeBtn.setText("Remove accont");
        removeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(163, 30, 30), 1, true));
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        navBarPannel.setBackground(new java.awt.Color(255, 115, 115));
        navBarPannel.setPreferredSize(new java.awt.Dimension(1920, 99));

        transactionsBtn.setBackground(new java.awt.Color(255, 115, 115));
        transactionsBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        transactionsBtn.setForeground(new java.awt.Color(0, 0, 0));
        transactionsBtn.setText("Transactions");
        transactionsBtn.setAlignmentY(0.0F);
        transactionsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        transactionsBtn.setFocusPainted(false);
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
        contactUsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        contactUsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactUsBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        contactUsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUsBtnActionPerformed(evt);
            }
        });

        userNameNavbar.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        userNameNavbar.setForeground(new java.awt.Color(0, 0, 0));
        userNameNavbar.setText("User Name");

        logOutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logOutBtn.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        logOutBtn.setText("Log Out");
        logOutBtn.setToolTipText("");
        logOutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        viewUserProfileBtn.setBackground(new java.awt.Color(255, 115, 115));
        viewUserProfileBtn.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        viewUserProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUserProfileBtn.setText("View user profile");
        viewUserProfileBtn.setBorder(null);
        viewUserProfileBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        viewUserProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserProfileBtnActionPerformed(evt);
            }
        });

        mainPageBtn.setBackground(new java.awt.Color(255, 115, 115));
        mainPageBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        mainPageBtn.setForeground(new java.awt.Color(0, 0, 0));
        mainPageBtn.setText("Main Page");
        mainPageBtn.setAlignmentY(0.0F);
        mainPageBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        mainPageBtn.setFocusPainted(false);
        mainPageBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        mainPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPageBtnActionPerformed(evt);
            }
        });

        loansBtn.setBackground(new java.awt.Color(255, 115, 115));
        loansBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        loansBtn.setForeground(new java.awt.Color(0, 0, 0));
        loansBtn.setText("Loans");
        loansBtn.setToolTipText("");
        loansBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        loansBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loansBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        loansBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarPannelLayout = new javax.swing.GroupLayout(navBarPannel);
        navBarPannel.setLayout(navBarPannelLayout);
        navBarPannelLayout.setHorizontalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(mainPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transactionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(loansBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewUserProfileBtn)
                    .addComponent(userNameNavbar))
                .addGap(18, 18, 18)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        navBarPannelLayout.setVerticalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainPageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loansBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navBarPannelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navBarPannelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(navBarPannelLayout.createSequentialGroup()
                                .addComponent(userNameNavbar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewUserProfileBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(102, 102, 102)
                        .addComponent(ibanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(accoutNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(navBarPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ibanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accoutNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addComponent(transactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        EditBankAccountFrame editBankAccountFrame = new EditBankAccountFrame(_bankAccount);
        editBankAccountFrame.getDataChangedEvent().addListener(this);
    }//GEN-LAST:event_editBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        _app.removeBankAccount(_bankAccount);
        _framesController.openFrame(FrameType.MAIN_FRAME);
        dispose();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.TRANSACTION_FRAME);
        dispose();
    }//GEN-LAST:event_transactionsBtnActionPerformed

    private void contactUsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.CONTACT_US_FRAME);
        dispose();
    }//GEN-LAST:event_contactUsBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        _app.logOut();
        _framesController.openFrame(FrameType.LOGIN_FRAME);
        dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void viewUserProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserProfileBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.VIEW_USER_FRAME);
        dispose();
    }//GEN-LAST:event_viewUserProfileBtnActionPerformed

    private void mainPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPageBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.MAIN_FRAME);
        dispose();
    }//GEN-LAST:event_mainPageBtnActionPerformed

    private void loansBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansBtnActionPerformed
        // TODO add your handling code here:
        _framesController.openFrame(FrameType.LOANS_FRAME);
        dispose();
    }//GEN-LAST:event_loansBtnActionPerformed

    private void loadData() {
        ibanLabel.setText(_bankAccount.getIban());
        accountNameLabel.setText(_bankAccount.getName());
        currentBalanceLabel.setText(_bankAccount.getBalance().toString());
        
        List<Transaction> list = _app.getTransactionsForBankAccount(_bankAccount.getIban());
        _transactionsDefaultListModel.clear();
        for(int i = list.size() - 1; i >= 0; i--) {
            _transactionsDefaultListModel.addElement(list.get(i));
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
    private javax.swing.JButton loansBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton mainPageBtn;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JButton removeBtn;
    private javax.swing.JList<Transaction> transactionHistoryList;
    private javax.swing.JPanel transactionHistoryPanel;
    private javax.swing.JLabel transactionHistoryTitleLabel;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel userNameNavbar;
    private javax.swing.JButton viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables

}
