/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;
import BankAccount.BankAccount;
import Core.Application;
import Core.FrameType;
import Core.FramesController;
import UI.UI_Variables;;
import javax.swing.DefaultListModel;
import PlannedPayments.PlannedPayment;
import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author Bubo & Yana
 */
public class MainPageFrame extends javax.swing.JFrame {
    private Application _app;
    private FramesController _framesController;
    private DefaultListModel<PlannedPayment> _plannedPaymentsDefaultListModel;
    private DefaultListModel<BankAccount> _bankAccountsDefaultListModel;
    private BankAccount _selectedBankAccount;
    private PlannedPayment _selectedPlannedPayment;
    
    /**
     * Creates new form MainPageFrame
     */
    public MainPageFrame(Application application, FramesController framesController) {
        initComponents();
        _app = application;
        _framesController = framesController;
        
        _plannedPaymentsDefaultListModel = new DefaultListModel<>();
        plannedPaymentsList.setModel(_plannedPaymentsDefaultListModel);
        _bankAccountsDefaultListModel= new DefaultListModel<>();
        bankAccountsList.setModel(_bankAccountsDefaultListModel);
        
        //UI settings
        setBackground(UI_Variables.BACKGROUND_COLOR);
        
        //Setting infromation
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
        userNameNavbar = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        viewUserProfileBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        plannedPaymentsTitle = new javax.swing.JLabel();
        plannedPaymentsCreateBtn = new javax.swing.JButton();
        plannedPaymentsDeleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        plannedPaymentsList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        plannedPaymentsTitle2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bankAccountsList = new javax.swing.JList<>();
        editBankAccountBtn = new javax.swing.JButton();
        deleteBankAccountBtn = new javax.swing.JButton();
        createBankAccountBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        plannedPaymentsTitle3 = new javax.swing.JLabel();
        currentBalanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankApp - Main Page");
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

        javax.swing.GroupLayout navBarPannelLayout = new javax.swing.GroupLayout(navBarPannel);
        navBarPannel.setLayout(navBarPannelLayout);
        navBarPannelLayout.setHorizontalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(transactionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(201, 201, 201));
        jPanel1.setPreferredSize(new java.awt.Dimension(616, 758));

        plannedPaymentsTitle.setFont(new java.awt.Font("Gadugi", 1, 45)); // NOI18N
        plannedPaymentsTitle.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plannedPaymentsTitle.setText("Planned payments");

        plannedPaymentsCreateBtn.setBackground(new java.awt.Color(27, 191, 0));
        plannedPaymentsCreateBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        plannedPaymentsCreateBtn.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsCreateBtn.setText("Create");
        plannedPaymentsCreateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(156, 156, 156), 1, true));

        plannedPaymentsDeleteBtn.setBackground(new java.awt.Color(234, 34, 34));
        plannedPaymentsDeleteBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        plannedPaymentsDeleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsDeleteBtn.setText("Delete");
        plannedPaymentsDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 30, 30), 1, true));

        plannedPaymentsList.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        plannedPaymentsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                plannedPaymentsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(plannedPaymentsList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(plannedPaymentsCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plannedPaymentsDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plannedPaymentsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plannedPaymentsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plannedPaymentsCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plannedPaymentsDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(201, 201, 201));

        plannedPaymentsTitle2.setFont(new java.awt.Font("Gadugi", 1, 45)); // NOI18N
        plannedPaymentsTitle2.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plannedPaymentsTitle2.setText("Bank Accounts");

        bankAccountsList.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        bankAccountsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bankAccountsListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(bankAccountsList);

        editBankAccountBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBankAccountBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        editBankAccountBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBankAccountBtn.setText("Edit");
        editBankAccountBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(156, 156, 156), 1, true));

        deleteBankAccountBtn.setBackground(new java.awt.Color(234, 34, 34));
        deleteBankAccountBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        deleteBankAccountBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBankAccountBtn.setText("Delete");
        deleteBankAccountBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 30, 30), 1, true));

        createBankAccountBtn.setBackground(new java.awt.Color(27, 191, 0));
        createBankAccountBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        createBankAccountBtn.setForeground(new java.awt.Color(0, 0, 0));
        createBankAccountBtn.setText("Create");
        createBankAccountBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(156, 156, 156), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(createBankAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(editBankAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(deleteBankAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(plannedPaymentsTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plannedPaymentsTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBankAccountBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createBankAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBankAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(201, 201, 201));

        plannedPaymentsTitle3.setFont(new java.awt.Font("Gadugi", 1, 45)); // NOI18N
        plannedPaymentsTitle3.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plannedPaymentsTitle3.setText("Current balance");

        currentBalanceLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        currentBalanceLabel.setForeground(new java.awt.Color(0, 0, 0));
        currentBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plannedPaymentsTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plannedPaymentsTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBarPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 2067, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("BankApp - Main Page");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsBtnActionPerformed

    private void contactUsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsBtnActionPerformed
        // TODO add your handling code here:
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

    private void bankAccountsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bankAccountsListValueChanged
        // TODO add your handling code here:
        _selectedBankAccount = bankAccountsList.getSelectedValue();
    }//GEN-LAST:event_bankAccountsListValueChanged

    private void plannedPaymentsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_plannedPaymentsListValueChanged
        // TODO add your handling code here:
        _selectedPlannedPayment = plannedPaymentsList.getSelectedValue();
    }//GEN-LAST:event_plannedPaymentsListValueChanged

    private void loadData() {
        userNameNavbar.setText(_app.getUser().getUsername());
        currentBalanceLabel.setText(calculateCurrentBalance().toString());
        
        for(var plannedPayment : _app.getAllPlannedPayments()){
            _plannedPaymentsDefaultListModel.addElement(plannedPayment);
        }
        
        for(var bankAccount: _app.getAllBankAccounts()){
            _bankAccountsDefaultListModel.addElement(bankAccount);
        }
    }
    
    private BigDecimal calculateCurrentBalance() {
        BigDecimal currentBalance = BigDecimal.ZERO;
        List<BankAccount> list = _app.getAllBankAccounts();
        
        for(var bankAccount : list) {
            currentBalance = currentBalance.add(bankAccount.getBalance());
        }
        
        return currentBalance;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<BankAccount> bankAccountsList;
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JButton createBankAccountBtn;
    private javax.swing.JLabel currentBalanceLabel;
    private javax.swing.JButton deleteBankAccountBtn;
    private javax.swing.JButton editBankAccountBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JButton plannedPaymentsCreateBtn;
    private javax.swing.JButton plannedPaymentsDeleteBtn;
    private javax.swing.JList<PlannedPayment> plannedPaymentsList;
    private javax.swing.JLabel plannedPaymentsTitle;
    private javax.swing.JLabel plannedPaymentsTitle2;
    private javax.swing.JLabel plannedPaymentsTitle3;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel userNameNavbar;
    private javax.swing.JButton viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables
}
