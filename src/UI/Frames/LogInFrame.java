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
public class LogInFrame extends javax.swing.JFrame {
    /**
     * Creates new form LogInFrame
     */
    public LogInFrame(Application application) {
        initComponents();
        
        //UI settings
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

        backgroundPanel = new javax.swing.JPanel();
        logInPanel = new javax.swing.JPanel();
        logInTitleLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        logInBtn = new javax.swing.JButton();
        singUpBtn = new javax.swing.JButton();
        haveAnAccountBtn = new javax.swing.JLabel();
        logInUserNameLabel = new javax.swing.JLabel();
        logInPasswordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 115, 115));

        backgroundPanel.setBackground(new java.awt.Color(255, 115, 115));

        logInPanel.setBackground(new java.awt.Color(255, 255, 255));
        logInPanel.setForeground(new java.awt.Color(0, 0, 0));
        logInPanel.setPreferredSize(new java.awt.Dimension(822, 890));
        logInPanel.setVerifyInputWhenFocusTarget(false);

        logInTitleLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        logInTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        logInTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInTitleLabel.setText("Welcome back!");
        logInTitleLabel.setPreferredSize(new java.awt.Dimension(565, 75));

        userNameTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        userNameTextField.setPreferredSize(new java.awt.Dimension(524, 52));

        logInBtn.setBackground(new java.awt.Color(255, 115, 115));
        logInBtn.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        logInBtn.setForeground(new java.awt.Color(0, 0, 0));
        logInBtn.setText("Log In");
        logInBtn.setPreferredSize(new java.awt.Dimension(215, 85));

        singUpBtn.setBackground(new java.awt.Color(255, 255, 255));
        singUpBtn.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        singUpBtn.setForeground(new java.awt.Color(0, 0, 0));
        singUpBtn.setText("Sing Up");
        singUpBtn.setPreferredSize(new java.awt.Dimension(204, 85));

        haveAnAccountBtn.setFont(new java.awt.Font("Gadugi", 0, 32)); // NOI18N
        haveAnAccountBtn.setForeground(new java.awt.Color(0, 0, 0));
        haveAnAccountBtn.setText("Don't have an account?");

        logInUserNameLabel.setFont(new java.awt.Font("Gadugi", 0, 28)); // NOI18N
        logInUserNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        logInUserNameLabel.setText("Username");

        logInPasswordLabel.setFont(new java.awt.Font("Gadugi", 0, 28)); // NOI18N
        logInPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        logInPasswordLabel.setText("Password");

        passwordField.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        passwordField.setPreferredSize(new java.awt.Dimension(524, 52));

        javax.swing.GroupLayout logInPanelLayout = new javax.swing.GroupLayout(logInPanel);
        logInPanel.setLayout(logInPanelLayout);
        logInPanelLayout.setHorizontalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                        .addComponent(haveAnAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(singUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                        .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logInUserNameLabel)
                            .addComponent(logInPasswordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))))
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logInPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(logInTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(logInPanelLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logInPanelLayout.setVerticalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(logInTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(logInUserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(logInPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(haveAnAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(577, Short.MAX_VALUE)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(521, 521, 521))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel haveAnAccountBtn;
    private javax.swing.JButton logInBtn;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JLabel logInPasswordLabel;
    private javax.swing.JLabel logInTitleLabel;
    private javax.swing.JLabel logInUserNameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton singUpBtn;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
    }
