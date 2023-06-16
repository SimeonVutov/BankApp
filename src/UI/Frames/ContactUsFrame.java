/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;
import Core.Application;
import Core.FrameType;
import Core.FramesController;
import UI.UI_Variables;

/**
 *
 * @author Bubo & Yana
 */
public class ContactUsFrame extends javax.swing.JFrame {
    private Application app;
    private FramesController framesController;
    /**
     * Creates new form ContatctUsFrame
     */
    public ContactUsFrame(Application application, FramesController framesController) {
        initComponents();
        this.app = application;
        this.framesController = framesController;
        
        //UI settings
        setSize(1920, 935);
        setBackground(UI_Variables.BACKGROUND_COLOR);
        
        //Setting information
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

        contactUsPanel = new javax.swing.JPanel();
        contactUsMessageLine7 = new javax.swing.JLabel();
        contactUsMessageLine1 = new javax.swing.JLabel();
        contactUsMessageLine2 = new javax.swing.JLabel();
        contactUsMessageLine3 = new javax.swing.JLabel();
        contactUsMessageLine4 = new javax.swing.JLabel();
        contactUsMessageLine5 = new javax.swing.JLabel();
        contactUsMessageLine6 = new javax.swing.JLabel();
        navBarPannel = new javax.swing.JPanel();
        transactionsBtn = new javax.swing.JButton();
        contactUsBtn = new javax.swing.JButton();
        userNameNavbar = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        viewUserProfileBtn = new javax.swing.JButton();
        mainPageBtn = new javax.swing.JButton();
        loansBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contactUsPanel.setBackground(new java.awt.Color(201, 201, 201));
        contactUsPanel.setPreferredSize(new java.awt.Dimension(1835, 792));

        contactUsMessageLine7.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine7.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine7.setText("For more info for check out info.bank.app.com");

        contactUsMessageLine1.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine1.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine1.setText("This is BankApp support. If you need any HELP");

        contactUsMessageLine2.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine2.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine2.setText("you can contact us here: ");

        contactUsMessageLine3.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine3.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine3.setText("Email: support@bank.app.com");

        contactUsMessageLine4.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine4.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine4.setText("Phone: +359 8 888 8888");

        contactUsMessageLine5.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine5.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine5.setText("Discord: BankApp#0000");

        contactUsMessageLine6.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        contactUsMessageLine6.setForeground(new java.awt.Color(0, 0, 0));
        contactUsMessageLine6.setText("Thanks for using BankApp and please consider joining");

        javax.swing.GroupLayout contactUsPanelLayout = new javax.swing.GroupLayout(contactUsPanel);
        contactUsPanel.setLayout(contactUsPanelLayout);
        contactUsPanelLayout.setHorizontalGroup(
            contactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactUsPanelLayout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(contactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactUsMessageLine7)
                    .addComponent(contactUsMessageLine6)
                    .addComponent(contactUsMessageLine5)
                    .addComponent(contactUsMessageLine4)
                    .addComponent(contactUsMessageLine3)
                    .addComponent(contactUsMessageLine2)
                    .addComponent(contactUsMessageLine1))
                .addGap(309, 309, 309))
        );
        contactUsPanelLayout.setVerticalGroup(
            contactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactUsPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(contactUsMessageLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactUsMessageLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(contactUsMessageLine3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactUsMessageLine4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactUsMessageLine5)
                .addGap(55, 55, 55)
                .addComponent(contactUsMessageLine6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactUsMessageLine7)
                .addGap(85, 85, 85))
        );

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
                .addGap(41, 41, 41)
                .addComponent(contactUsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(navBarPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(contactUsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Opens the transaction frame
    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        // TODO add your handling code here:
        framesController.openFrame(FrameType.TRANSACTION_FRAME);
        dispose();
    }//GEN-LAST:event_transactionsBtnActionPerformed

    //Opens the contact us frame
    private void contactUsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsBtnActionPerformed
        // TODO add your handling code here:
        framesController.openFrame(FrameType.CONTACT_US_FRAME);
        dispose();
    }//GEN-LAST:event_contactUsBtnActionPerformed

    //Logs out the user
    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        app.logOut();
        framesController.openFrame(FrameType.LOGIN_FRAME);
        dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    //Opens the view user profile frame
    private void viewUserProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserProfileBtnActionPerformed
        // TODO add your handling code here:
        framesController.openFrame(FrameType.VIEW_USER_FRAME);
        dispose();
    }//GEN-LAST:event_viewUserProfileBtnActionPerformed

    //Opens the main page frame
    private void mainPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPageBtnActionPerformed
        // TODO add your handling code here:
        framesController.openFrame(FrameType.MAIN_FRAME);
        dispose();
    }//GEN-LAST:event_mainPageBtnActionPerformed

    //Opens the loans frame
    private void loansBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansBtnActionPerformed
        // TODO add your handling code here:
        framesController.openFrame(FrameType.LOANS_FRAME);
        dispose();
    }//GEN-LAST:event_loansBtnActionPerformed
    
    //Loading user information
    private void loadData() {
        userNameNavbar.setText(app.getUser().getUsername());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JLabel contactUsMessageLine1;
    private javax.swing.JLabel contactUsMessageLine2;
    private javax.swing.JLabel contactUsMessageLine3;
    private javax.swing.JLabel contactUsMessageLine4;
    private javax.swing.JLabel contactUsMessageLine5;
    private javax.swing.JLabel contactUsMessageLine6;
    private javax.swing.JLabel contactUsMessageLine7;
    private javax.swing.JPanel contactUsPanel;
    private javax.swing.JButton loansBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton mainPageBtn;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel userNameNavbar;
    private javax.swing.JButton viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables
}
