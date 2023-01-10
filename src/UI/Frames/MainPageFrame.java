/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Elements;
import UI.UI_Variables;

/**
 *
 * @author Bubo & Yana
 */
public class MainPageFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainPageFrame
     */
    public MainPageFrame() {
        initComponents();
        
        setSize(1920, 935);
        setBackground(UI_Variables.BACKGROUND_COLOR);
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
        userNameNavBar = new javax.swing.JLabel();
        viewUserProfileBtn = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountsList = new javax.swing.JList<>();
        accountsLabel = new javax.swing.JLabel();
        currentBalanceLabel = new javax.swing.JPanel();
        CurrentBalanceTitle = new javax.swing.JLabel();
        CurrenBalanceValue = new javax.swing.JLabel();
        plannedPaymentsList = new javax.swing.JPanel();
        plannedPaymentsTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankApp - MAin Page");
        setBackground(new java.awt.Color(255, 255, 255));

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

        lonasBtn.setBackground(new java.awt.Color(255, 115, 115));
        lonasBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        lonasBtn.setForeground(new java.awt.Color(0, 0, 0));
        lonasBtn.setText("Loans");
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
        contactUsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactUsBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        contactUsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUsBtnActionPerformed(evt);
            }
        });

        userNameNavBar.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        userNameNavBar.setForeground(new java.awt.Color(0, 0, 0));
        userNameNavBar.setText("User Name");

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
                .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewUserProfileBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameNavBar, javax.swing.GroupLayout.Alignment.TRAILING))
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
                        .addComponent(userNameNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewUserProfileBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(201, 201, 201));

        accountsList.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        accountsList.setPreferredSize(new java.awt.Dimension(720, 583));
        jScrollPane1.setViewportView(accountsList);

        accountsLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        accountsLabel.setForeground(new java.awt.Color(0, 0, 0));
        accountsLabel.setText("Accounts");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(accountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(accountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        currentBalanceLabel.setBackground(new java.awt.Color(201, 201, 201));
        currentBalanceLabel.setForeground(new java.awt.Color(0, 0, 0));

        CurrentBalanceTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        CurrentBalanceTitle.setForeground(new java.awt.Color(0, 0, 0));
        CurrentBalanceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentBalanceTitle.setText("Current balance");
        CurrentBalanceTitle.setToolTipText("");

        CurrenBalanceValue.setFont(new java.awt.Font("Gadugi", 1, 113)); // NOI18N
        CurrenBalanceValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout currentBalanceLabelLayout = new javax.swing.GroupLayout(currentBalanceLabel);
        currentBalanceLabel.setLayout(currentBalanceLabelLayout);
        currentBalanceLabelLayout.setHorizontalGroup(
            currentBalanceLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalanceLabelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(CurrenBalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentBalanceLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CurrentBalanceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        currentBalanceLabelLayout.setVerticalGroup(
            currentBalanceLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentBalanceLabelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(CurrentBalanceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(CurrenBalanceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        plannedPaymentsList.setBackground(new java.awt.Color(201, 201, 201));
        plannedPaymentsList.setForeground(new java.awt.Color(0, 0, 0));

        plannedPaymentsTitle.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        plannedPaymentsTitle.setForeground(new java.awt.Color(0, 0, 0));
        plannedPaymentsTitle.setText("Planned payments");

        jList2.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout plannedPaymentsListLayout = new javax.swing.GroupLayout(plannedPaymentsList);
        plannedPaymentsList.setLayout(plannedPaymentsListLayout);
        plannedPaymentsListLayout.setHorizontalGroup(
            plannedPaymentsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plannedPaymentsListLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(plannedPaymentsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plannedPaymentsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        plannedPaymentsListLayout.setVerticalGroup(
            plannedPaymentsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plannedPaymentsListLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(plannedPaymentsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBarPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1931, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plannedPaymentsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plannedPaymentsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 26, Short.MAX_VALUE))
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

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrenBalanceValue;
    private javax.swing.JLabel CurrentBalanceTitle;
    private javax.swing.JLabel accountsLabel;
    private javax.swing.JList<String> accountsList;
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JPanel currentBalanceLabel;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton lonasBtn;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JPanel plannedPaymentsList;
    private javax.swing.JLabel plannedPaymentsTitle;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel userNameNavBar;
    private javax.swing.JLabel viewUserProfileBtn;
    // End of variables declaration//GEN-END:variables
}