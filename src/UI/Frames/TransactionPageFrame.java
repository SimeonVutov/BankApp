/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;

import UI.UI_Variables;

/**
 *
 * @author Bubo & Yana
 */
public class TransactionPageFrame extends javax.swing.JFrame {

    /**
     * Creates new form TransactionPageFrame
     */
    public TransactionPageFrame(Application application) {
        initComponents();
        
        //UI settings
        setSize(1920, 935);
        setBackground(UI_Variables.BACKGROUND_COLOR);
        
        //Setting information
        
        
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
        lonasBtn = new javax.swing.JButton();
        contactUsBtn = new javax.swing.JButton();
        userNameNavbar = new javax.swing.JLabel();
        viewUserProfileBtn = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        transactionsHistoryPanel = new javax.swing.JPanel();
        transactionsHistoryLabel = new javax.swing.JLabel();
        TransactionsHistoryList = new javax.swing.JScrollPane();
        transactionHistoryList = new javax.swing.JList<>();
        plannedPaymentsPanel = new javax.swing.JPanel();
        plannedPaymentsTitle = new javax.swing.JLabel();
        plannedPaymentsLabel = new javax.swing.JLabel();
        currentBalancePanel = new javax.swing.JPanel();
        currentBalanceTitle = new javax.swing.JLabel();
        currentBalanceLabel = new javax.swing.JLabel();
        motnlyLimitPanel = new javax.swing.JPanel();
        montlyLimitTitle = new javax.swing.JLabel();
        montlyLimitLabel = new javax.swing.JLabel();
        makeATransactionBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1920, 935));

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

        lonasBtn.setBackground(new java.awt.Color(255, 115, 115));
        lonasBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        lonasBtn.setForeground(new java.awt.Color(0, 0, 0));
        lonasBtn.setText("Loans");
        lonasBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        lonasBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        lonasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lonasBtnActionPerformed(evt);
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

        viewUserProfileBtn.setBackground(new java.awt.Color(255, 115, 115));
        viewUserProfileBtn.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        viewUserProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUserProfileBtn.setText("View user profile");
        viewUserProfileBtn.setAlignmentY(0.0F);

        logOutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logOutBtn.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        logOutBtn.setText("Log Out");
        logOutBtn.setToolTipText("");
        logOutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
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
                .addComponent(lonasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewUserProfileBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameNavbar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(98, 98, 98))
        );
        navBarPannelLayout.setVerticalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lonasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navBarPannelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userNameNavbar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewUserProfileBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        transactionsHistoryPanel.setBackground(new java.awt.Color(201, 201, 201));
        transactionsHistoryPanel.setMaximumSize(new java.awt.Dimension(1826, 639));
        transactionsHistoryPanel.setMinimumSize(new java.awt.Dimension(1826, 639));
        transactionsHistoryPanel.setPreferredSize(new java.awt.Dimension(1826, 639));

        transactionsHistoryLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        transactionsHistoryLabel.setForeground(new java.awt.Color(0, 0, 0));
        transactionsHistoryLabel.setText("Transactions history");

        TransactionsHistoryList.setMinimumSize(new java.awt.Dimension(1676, 484));
        TransactionsHistoryList.setPreferredSize(new java.awt.Dimension(1676, 484));

        transactionHistoryList.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        transactionHistoryList.setPreferredSize(new java.awt.Dimension(1826, 553));
        TransactionsHistoryList.setViewportView(transactionHistoryList);

        javax.swing.GroupLayout transactionsHistoryPanelLayout = new javax.swing.GroupLayout(transactionsHistoryPanel);
        transactionsHistoryPanel.setLayout(transactionsHistoryPanelLayout);
        transactionsHistoryPanelLayout.setHorizontalGroup(
            transactionsHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsHistoryPanelLayout.createSequentialGroup()
                .addGroup(transactionsHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionsHistoryPanelLayout.createSequentialGroup()
                        .addGap(643, 643, 643)
                        .addComponent(transactionsHistoryLabel))
                    .addGroup(transactionsHistoryPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(TransactionsHistoryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transactionsHistoryPanelLayout.setVerticalGroup(
            transactionsHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsHistoryPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(transactionsHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TransactionsHistoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        plannedPaymentsPanel.setBackground(new java.awt.Color(201, 201, 201));
        plannedPaymentsPanel.setForeground(new java.awt.Color(0, 0, 0));

        plannedPaymentsTitle.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        plannedPaymentsTitle.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsTitle.setText("Planned Payments");

        plannedPaymentsLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        plannedPaymentsLabel.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout plannedPaymentsPanelLayout = new javax.swing.GroupLayout(plannedPaymentsPanel);
        plannedPaymentsPanel.setLayout(plannedPaymentsPanelLayout);
        plannedPaymentsPanelLayout.setHorizontalGroup(
            plannedPaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plannedPaymentsPanelLayout.createSequentialGroup()
                .addGroup(plannedPaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plannedPaymentsPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(plannedPaymentsTitle))
                    .addGroup(plannedPaymentsPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(plannedPaymentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        plannedPaymentsPanelLayout.setVerticalGroup(
            plannedPaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plannedPaymentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plannedPaymentsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(plannedPaymentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        currentBalancePanel.setBackground(new java.awt.Color(201, 201, 201));
        currentBalancePanel.setForeground(new java.awt.Color(0, 0, 0));

        currentBalanceTitle.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        currentBalanceTitle.setForeground(new java.awt.Color(0, 0, 0));
        currentBalanceTitle.setText("Current balance");

        currentBalanceLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        currentBalanceLabel.setForeground(new java.awt.Color(0, 0, 0));
        currentBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout currentBalancePanelLayout = new javax.swing.GroupLayout(currentBalancePanel);
        currentBalancePanel.setLayout(currentBalancePanelLayout);
        currentBalancePanelLayout.setHorizontalGroup(
            currentBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalancePanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(currentBalanceTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentBalancePanelLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        currentBalancePanelLayout.setVerticalGroup(
            currentBalancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentBalanceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        motnlyLimitPanel.setBackground(new java.awt.Color(201, 201, 201));
        motnlyLimitPanel.setForeground(new java.awt.Color(0, 0, 0));

        montlyLimitTitle.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        montlyLimitTitle.setForeground(new java.awt.Color(0, 0, 0));
        montlyLimitTitle.setText("Montly limit");

        montlyLimitLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        montlyLimitLabel.setForeground(new java.awt.Color(0, 0, 0));
        montlyLimitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout motnlyLimitPanelLayout = new javax.swing.GroupLayout(motnlyLimitPanel);
        motnlyLimitPanel.setLayout(motnlyLimitPanelLayout);
        motnlyLimitPanelLayout.setHorizontalGroup(
            motnlyLimitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motnlyLimitPanelLayout.createSequentialGroup()
                .addGroup(motnlyLimitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(motnlyLimitPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(montlyLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(motnlyLimitPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(montlyLimitTitle)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        motnlyLimitPanelLayout.setVerticalGroup(
            motnlyLimitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motnlyLimitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(montlyLimitTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(montlyLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        makeATransactionBtn.setBackground(new java.awt.Color(255, 115, 115));
        makeATransactionBtn.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        makeATransactionBtn.setForeground(new java.awt.Color(0, 0, 0));
        makeATransactionBtn.setText("Make a transaction");
        makeATransactionBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        makeATransactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeATransactionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBarPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transactionsHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(makeATransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(motnlyLimitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(plannedPaymentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motnlyLimitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plannedPaymentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(makeATransactionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(transactionsHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsBtnActionPerformed

    private void lonasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lonasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lonasBtnActionPerformed

    private void contactUsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactUsBtnActionPerformed

    private void makeATransactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeATransactionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeATransactionBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TransactionsHistoryList;
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JLabel currentBalanceLabel;
    private javax.swing.JPanel currentBalancePanel;
    private javax.swing.JLabel currentBalanceTitle;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton lonasBtn;
    private javax.swing.JButton makeATransactionBtn;
    private javax.swing.JLabel montlyLimitLabel;
    private javax.swing.JLabel montlyLimitTitle;
    private javax.swing.JPanel motnlyLimitPanel;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JLabel plannedPaymentsLabel;
    private javax.swing.JPanel plannedPaymentsPanel;
    private javax.swing.JLabel plannedPaymentsTitle;
    private javax.swing.JList<String> transactionHistoryList;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel transactionsHistoryLabel;
    private javax.swing.JPanel transactionsHistoryPanel;
    private javax.swing.JLabel userNameNavbar;
    private javax.swing.JLabel viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables
}
