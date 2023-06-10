/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;
import Core.Application;
import Core.FrameType;
import Core.FramesController;
import PlannedPayments.Loans.LongTermLoanType;
import PlannedPayments.Loans.MediumTermLoanType;
import PlannedPayments.Loans.ShortTermLoanType;
import UI.Frames.CreateFrames.CreateLoanFrame;
import UI.UI_Variables;
import Users.User;

/**
 *
 * @author Bubo & Yana
 */
public class LoansFrame extends javax.swing.JFrame {
    private Application _app;
    private FramesController _framesController;
    
    /**
     * Creates new form ViewUserProfielFrame
     */
    public LoansFrame(Application application, FramesController framesController) {
        initComponents();
        _app = application;
        _framesController = framesController;
        
        //UI settings
        setSize(1920, 935);
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

        oneMonthLoansPanel = new javax.swing.JPanel();
        oneMonthLoanLabel1 = new javax.swing.JLabel();
        oneMonthLoansInterestLabel = new javax.swing.JLabel();
        openSTLFrame = new javax.swing.JButton();
        oneYearLoanPanel = new javax.swing.JPanel();
        oneYearLoansInterestLabel = new javax.swing.JLabel();
        oneYearLoanLabel = new javax.swing.JLabel();
        openMTLFrame = new javax.swing.JButton();
        fiveYearsLoanPanel = new javax.swing.JPanel();
        fiveYearsLoanLabel = new javax.swing.JLabel();
        fiveYearLoansInterestLabel = new javax.swing.JLabel();
        openLTLFrame = new javax.swing.JButton();
        navBarPannel = new javax.swing.JPanel();
        transactionsBtn = new javax.swing.JButton();
        contactUsBtn = new javax.swing.JButton();
        userNameNavbar = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        viewUserProfileBtn = new javax.swing.JButton();
        mainPageBtn = new javax.swing.JButton();
        loansBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1920, 935));

        oneMonthLoansPanel.setBackground(new java.awt.Color(201, 201, 201));
        oneMonthLoansPanel.setPreferredSize(new java.awt.Dimension(578, 792));

        oneMonthLoanLabel1.setFont(new java.awt.Font("Gadugi", 1, 45)); // NOI18N
        oneMonthLoanLabel1.setForeground(new java.awt.Color(0, 0, 0));
        oneMonthLoanLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oneMonthLoanLabel1.setText("1 Month Loan");

        oneMonthLoansInterestLabel.setFont(new java.awt.Font("Gadugi", 0, 38)); // NOI18N
        oneMonthLoansInterestLabel.setForeground(new java.awt.Color(0, 0, 0));
        oneMonthLoansInterestLabel.setText("5% montly interest");

        openSTLFrame.setText("Choose");
        openSTLFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSTLFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oneMonthLoansPanelLayout = new javax.swing.GroupLayout(oneMonthLoansPanel);
        oneMonthLoansPanel.setLayout(oneMonthLoansPanelLayout);
        oneMonthLoansPanelLayout.setHorizontalGroup(
            oneMonthLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oneMonthLoansPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oneMonthLoanLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oneMonthLoansPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(oneMonthLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(openSTLFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneMonthLoansInterestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        oneMonthLoansPanelLayout.setVerticalGroup(
            oneMonthLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oneMonthLoansPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(oneMonthLoanLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oneMonthLoansInterestLabel)
                .addGap(18, 18, 18)
                .addComponent(openSTLFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        oneYearLoanPanel.setBackground(new java.awt.Color(201, 201, 201));
        oneYearLoanPanel.setPreferredSize(new java.awt.Dimension(578, 792));

        oneYearLoansInterestLabel.setFont(new java.awt.Font("Gadugi", 0, 38)); // NOI18N
        oneYearLoansInterestLabel.setForeground(new java.awt.Color(0, 0, 0));
        oneYearLoansInterestLabel.setText("2.5% montly interest");

        oneYearLoanLabel.setFont(new java.awt.Font("Gadugi", 1, 45)); // NOI18N
        oneYearLoanLabel.setForeground(new java.awt.Color(0, 0, 0));
        oneYearLoanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oneYearLoanLabel.setText("1 Year Loan");

        openMTLFrame.setText("Choose");
        openMTLFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMTLFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oneYearLoanPanelLayout = new javax.swing.GroupLayout(oneYearLoanPanel);
        oneYearLoanPanel.setLayout(oneYearLoanPanelLayout);
        oneYearLoanPanelLayout.setHorizontalGroup(
            oneYearLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oneYearLoanPanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(oneYearLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(openMTLFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneYearLoansInterestLabel))
                .addGap(107, 107, 107))
            .addGroup(oneYearLoanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oneYearLoanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        oneYearLoanPanelLayout.setVerticalGroup(
            oneYearLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oneYearLoanPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(oneYearLoanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oneYearLoansInterestLabel)
                .addGap(18, 18, 18)
                .addComponent(openMTLFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        fiveYearsLoanPanel.setBackground(new java.awt.Color(201, 201, 201));
        fiveYearsLoanPanel.setPreferredSize(new java.awt.Dimension(578, 792));

        fiveYearsLoanLabel.setFont(new java.awt.Font("Gadugi", 1, 45)); // NOI18N
        fiveYearsLoanLabel.setForeground(new java.awt.Color(0, 0, 0));
        fiveYearsLoanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiveYearsLoanLabel.setText("5 Years Loan");

        fiveYearLoansInterestLabel.setFont(new java.awt.Font("Gadugi", 0, 38)); // NOI18N
        fiveYearLoansInterestLabel.setForeground(new java.awt.Color(0, 0, 0));
        fiveYearLoansInterestLabel.setText("1% montly interest");

        openLTLFrame.setText("Choose");
        openLTLFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openLTLFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fiveYearsLoanPanelLayout = new javax.swing.GroupLayout(fiveYearsLoanPanel);
        fiveYearsLoanPanel.setLayout(fiveYearsLoanPanelLayout);
        fiveYearsLoanPanelLayout.setHorizontalGroup(
            fiveYearsLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fiveYearsLoanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fiveYearsLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fiveYearsLoanPanelLayout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addGroup(fiveYearsLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fiveYearsLoanPanelLayout.createSequentialGroup()
                                .addComponent(openLTLFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fiveYearsLoanPanelLayout.createSequentialGroup()
                                .addComponent(fiveYearLoansInterestLabel)
                                .addGap(117, 117, 117))))
                    .addComponent(fiveYearsLoanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        fiveYearsLoanPanelLayout.setVerticalGroup(
            fiveYearsLoanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fiveYearsLoanPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(fiveYearsLoanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(fiveYearLoansInterestLabel)
                .addGap(18, 18, 18)
                .addComponent(openLTLFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
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
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(oneMonthLoansPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(oneYearLoanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(fiveYearsLoanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addComponent(navBarPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 1914, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(oneYearLoanPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(oneMonthLoansPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(fiveYearsLoanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                .addGap(0, 91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
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

    private void openLTLFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openLTLFrameActionPerformed
        // TODO add your handling code here:
        CreateLoanFrame clf = new CreateLoanFrame(_app, new LongTermLoanType());
    }//GEN-LAST:event_openLTLFrameActionPerformed

    private void openMTLFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMTLFrameActionPerformed
        // TODO add your handling code here:
        CreateLoanFrame clf = new CreateLoanFrame(_app, new MediumTermLoanType());
    }//GEN-LAST:event_openMTLFrameActionPerformed

    private void openSTLFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSTLFrameActionPerformed
        // TODO add your handling code here:
        CreateLoanFrame clf = new CreateLoanFrame(_app, new ShortTermLoanType());
    }//GEN-LAST:event_openSTLFrameActionPerformed

    private void loadData() {
        User user = _app.getUser();
        
        userNameNavbar.setText(_app.getUser().getUsername());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JLabel fiveYearLoansInterestLabel;
    private javax.swing.JLabel fiveYearsLoanLabel;
    private javax.swing.JPanel fiveYearsLoanPanel;
    private javax.swing.JButton loansBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton mainPageBtn;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JLabel oneMonthLoanLabel1;
    private javax.swing.JLabel oneMonthLoansInterestLabel;
    private javax.swing.JPanel oneMonthLoansPanel;
    private javax.swing.JLabel oneYearLoanLabel;
    private javax.swing.JPanel oneYearLoanPanel;
    private javax.swing.JLabel oneYearLoansInterestLabel;
    private javax.swing.JButton openLTLFrame;
    private javax.swing.JButton openMTLFrame;
    private javax.swing.JButton openSTLFrame;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel userNameNavbar;
    private javax.swing.JButton viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables
}
