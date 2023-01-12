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
public class ViewAccountInformationFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewAccountInformationFrame
     */
    public ViewAccountInformationFrame(Application applciation) {
        initComponents();
        
        //UI settings
        setSize(1920, 935);
        setBackground(UI_Variables.BACKGROUND_COLOR);
        
        //Setting infromation
        
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
        loansBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transactionHistoryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionHistoryList = new javax.swing.JList<>();
        transactionHistoryTitleLabel = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        currentBalancePanel = new javax.swing.JPanel();
        cudentBalanceTitleLabel = new javax.swing.JLabel();
        currentBalanceLabel = new javax.swing.JLabel();
        ibanPanel = new javax.swing.JPanel();
        ibanTitleLabel = new javax.swing.JLabel();
        ibanLabel = new javax.swing.JLabel();
        accoutNamePanel = new javax.swing.JPanel();
        accountNameTitleLabel = new javax.swing.JLabel();
        acouuntNameLabel = new javax.swing.JLabel();

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

        loansBtn.setBackground(new java.awt.Color(255, 115, 115));
        loansBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        loansBtn.setForeground(new java.awt.Color(0, 0, 0));
        loansBtn.setText("Loans");
        loansBtn.setPreferredSize(new java.awt.Dimension(185, 99));
        loansBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 115, 115));
        jButton1.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Contact Us");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(185, 99));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("User Name");

        jLabel2.setBackground(new java.awt.Color(255, 115, 115));
        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View user profile");
        jLabel2.setAlignmentY(0.0F);

        javax.swing.GroupLayout navBarPannelLayout = new javax.swing.GroupLayout(navBarPannel);
        navBarPannel.setLayout(navBarPannelLayout);
        navBarPannelLayout.setHorizontalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(transactionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loansBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1057, Short.MAX_VALUE)
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(98, 98, 98))
        );
        navBarPannelLayout.setVerticalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loansBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navBarPannelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
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

        removeBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(0, 0, 0));
        removeBtn.setText("Remove");
        removeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Edit");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));

        javax.swing.GroupLayout transactionHistoryPanelLayout = new javax.swing.GroupLayout(transactionHistoryPanel);
        transactionHistoryPanel.setLayout(transactionHistoryPanelLayout);
        transactionHistoryPanelLayout.setHorizontalGroup(
            transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transactionHistoryTitleLabel)
                .addGap(611, 611, 611))
            .addGroup(transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1619, Short.MAX_VALUE)))
        );
        transactionHistoryPanelLayout.setVerticalGroup(
            transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionHistoryTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(transactionHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(transactionHistoryPanelLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
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
                .addContainerGap(184, Short.MAX_VALUE))
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

        javax.swing.GroupLayout accoutNamePanelLayout = new javax.swing.GroupLayout(accoutNamePanel);
        accoutNamePanel.setLayout(accoutNamePanelLayout);
        accoutNamePanelLayout.setHorizontalGroup(
            accoutNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accoutNamePanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(accountNameTitleLabel)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accoutNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acouuntNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        accoutNamePanelLayout.setVerticalGroup(
            accoutNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accoutNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountNameTitleLabel)
                .addGap(33, 33, 33)
                .addComponent(acouuntNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBarPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ibanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(accoutNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(currentBalancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(transactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(transactionHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsBtnActionPerformed

    private void loansBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loansBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNameTitleLabel;
    private javax.swing.JPanel accoutNamePanel;
    private javax.swing.JLabel acouuntNameLabel;
    private javax.swing.JLabel cudentBalanceTitleLabel;
    private javax.swing.JLabel currentBalanceLabel;
    private javax.swing.JPanel currentBalancePanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel ibanLabel;
    private javax.swing.JPanel ibanPanel;
    private javax.swing.JLabel ibanTitleLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loansBtn;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JButton removeBtn;
    private javax.swing.JList<String> transactionHistoryList;
    private javax.swing.JPanel transactionHistoryPanel;
    private javax.swing.JLabel transactionHistoryTitleLabel;
    private javax.swing.JButton transactionsBtn;
    // End of variables declaration//GEN-END:variables
}
