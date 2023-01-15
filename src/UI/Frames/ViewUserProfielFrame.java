/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames;
import Core.Application;
import Core.FrameType;
import Core.FramesController;
import UI.Frames.EditFrames.DataChangedListener;
import UI.Frames.EditFrames.EditUserFrame;
import UI.UI_Variables;
import Users.User;

/**
 *
 * @author Bubo & Yana
 */
public class ViewUserProfielFrame extends javax.swing.JFrame implements DataChangedListener{
    private Application _app;
    private FramesController _framesController;
    
    /**
     * Creates new form ViewUserProfielFrame
     */
    public ViewUserProfielFrame(Application application, FramesController framesController) {
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

        navBarPannel = new javax.swing.JPanel();
        transactionsBtn = new javax.swing.JButton();
        contactUsBtn = new javax.swing.JButton();
        usernameNavBar = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userInformationPanel = new javax.swing.JPanel();
        userInformationLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameLabelTitle = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        phoneNumberLabelTitle = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        emailLabelTitle = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1920, 935));
        setPreferredSize(new java.awt.Dimension(1920, 935));

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

        usernameNavBar.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        usernameNavBar.setForeground(new java.awt.Color(0, 0, 0));
        usernameNavBar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameNavBar.setText("User Name");

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

        jButton1.setBackground(new java.awt.Color(255, 115, 115));
        jButton1.setFont(new java.awt.Font("Gadugi", 1, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View user profile");
        jButton1.setBorder(null);

        javax.swing.GroupLayout navBarPannelLayout = new javax.swing.GroupLayout(navBarPannel);
        navBarPannel.setLayout(navBarPannelLayout);
        navBarPannelLayout.setHorizontalGroup(
            navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPannelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(transactionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1074, Short.MAX_VALUE)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(usernameNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(navBarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(navBarPannelLayout.createSequentialGroup()
                                .addComponent(usernameNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        userInformationPanel.setBackground(new java.awt.Color(201, 201, 201));
        userInformationPanel.setMinimumSize(new java.awt.Dimension(525, 900));
        userInformationPanel.setPreferredSize(new java.awt.Dimension(525, 900));

        userInformationLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        userInformationLabel.setForeground(new java.awt.Color(0, 0, 0));
        userInformationLabel.setText("User Information");

        nameLabel.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Full name:");

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabelTitle.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        usernameLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabelTitle.setText("Username:");

        fullNameLabel.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        fullNameLabel.setText("Name");

        usernameLabel.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("Username");

        phoneNumberLabelTitle.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        phoneNumberLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabelTitle.setText("Phone number:");

        phoneNumberLabel.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabel.setText("08234852938745");

        emailLabelTitle.setFont(new java.awt.Font("Gadugi", 1, 42)); // NOI18N
        emailLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        emailLabelTitle.setText("Email:");

        emailLabel.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("someone@gmail.com");

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Edit user");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true));
        editBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(234, 34, 34));
        deleteBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setText("Delete user");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 30, 30), 1, true));
        deleteBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInformationPanelLayout = new javax.swing.GroupLayout(userInformationPanel);
        userInformationPanel.setLayout(userInformationPanelLayout);
        userInformationPanelLayout.setHorizontalGroup(
            userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabelTitle)
                    .addComponent(emailLabelTitle)
                    .addComponent(nameLabel)
                    .addComponent(usernameLabelTitle))
                .addGap(56, 56, 56)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInformationPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(userInformationPanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fullNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(userInformationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(userInformationPanelLayout.createSequentialGroup()
                .addGap(679, 679, 679)
                .addComponent(userInformationLabel)
                .addContainerGap(676, Short.MAX_VALUE))
        );
        userInformationPanelLayout.setVerticalGroup(
            userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationPanelLayout.createSequentialGroup()
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInformationPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(userInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userInformationPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGap(79, 79, 79)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBarPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(userInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(userInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
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

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        EditUserFrame editUserFrame = new EditUserFrame(_app.getUser());
        editUserFrame.getDataChangedEvent().addListener(this);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        _app.removeUser(_app.getUser().getUserId());
        _framesController.openFrame(FrameType.LOGIN_FRAME);
        
        dispose();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void loadData() {
        User user = _app.getUser();
        
        usernameNavBar.setText(_app.getUser().getUsername());
        usernameLabel.setText(user.getUsername());
        fullNameLabel.setText(user.getPerson().toString());
        emailLabel.setText(user.getEmail());
        phoneNumberLabel.setText(user.getPhoneNumber());
    }
    
    @Override
    public void onDataChangedEvent() {
        loadData();
        _app.save();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contactUsBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabelTitle;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel navBarPannel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel phoneNumberLabelTitle;
    private javax.swing.JButton transactionsBtn;
    private javax.swing.JLabel userInformationLabel;
    private javax.swing.JPanel userInformationPanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabelTitle;
    private javax.swing.JLabel usernameNavBar;
    // End of variables declaration//GEN-END:variables
}
