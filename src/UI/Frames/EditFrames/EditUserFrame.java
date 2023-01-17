/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Frames.EditFrames;

import Users.Person;
import Users.User;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Moni
 */
public class EditUserFrame extends EditFrame {
    private User _user;
    private String _firstName;
    private String _secondName;
    private String _lastName;
    private String _username;
    private char[] _password;
    private String _email;
    private String _phoneNumber;
    private boolean _isPasswordChanged;
    
    /**
     * Creates new form EditUserFrame
     */
    public EditUserFrame(User user) {
        initComponents();
        _user = user;
        Person person = user.getPerson();
        
        _firstName = person.getFirstName();
        firstNameTextField.setText(_firstName);
      
        _secondName = person.getSecondName();
        secondNameTextField.setText(_secondName);
        
        _lastName = person.getLastName();
        lastNameTextField.setText(_lastName);
        
        _username = user.getUsername();
        usernameTextField.setText(_username);
        
        _email = user.getEmail();
        emailTextField.setText(_email);
        
        _phoneNumber = user.getPhoneNumber();
        phoneNumberTextField.setText(_phoneNumber);
        
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

        firstNameTextField = new javax.swing.JTextField();
        secondNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        changePasswordCheckBox = new javax.swing.JCheckBox();
        passwordTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        firstNameLabel1 = new javax.swing.JLabel();
        secondNameLabel1 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        phoneNumberLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(201, 201, 201));
        setPreferredSize(new java.awt.Dimension(822, 890));

        firstNameTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        firstNameTextField.setPreferredSize(new java.awt.Dimension(310, 45));

        secondNameTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        secondNameTextField.setPreferredSize(new java.awt.Dimension(310, 45));

        emailTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        lastNameTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        usernameTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        phoneNumberTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N

        changePasswordCheckBox.setText("Change Password");
        changePasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordCheckBoxActionPerformed(evt);
            }
        });

        passwordTextField.setEditable(false);
        passwordTextField.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        passwordTextField.setText("password");

        saveBtn.setBackground(new java.awt.Color(255, 115, 115));
        saveBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(163, 77, 77)));
        saveBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setFont(new java.awt.Font("Gadugi", 1, 22)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(156, 156, 156), 1, true));
        cancelBtn.setPreferredSize(new java.awt.Dimension(213, 84));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("Email:");

        firstNameLabel1.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        firstNameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        firstNameLabel1.setText("First Name:");

        secondNameLabel1.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        secondNameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        secondNameLabel1.setText("Second Name:");

        lastNameLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Last Name:");

        usernameLabel.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText(" Username:");

        passwordLabel1.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel1.setText("Password:");

        phoneNumberLabel1.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        phoneNumberLabel1.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabel1.setText("Phone number:");

        titleLabel.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("Edit user information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameLabel1)
                            .addComponent(secondNameLabel1)
                            .addComponent(lastNameLabel)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel1)
                            .addComponent(phoneNumberLabel1)
                            .addComponent(emailLabel))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePasswordCheckBox)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(titleLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(titleLabel)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel))
                        .addGap(27, 27, 27)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePasswordCheckBox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(phoneNumberLabel1))
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailLabel))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        passwordTextField.setEditable(changePasswordCheckBox.isSelected());
        _isPasswordChanged = changePasswordCheckBox.isSelected();
    }//GEN-LAST:event_changePasswordCheckBoxActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        _firstName = firstNameTextField.getText();
        _secondName = secondNameTextField.getText();
        _lastName = lastNameTextField.getText();
        _username = usernameTextField.getText();
        if(_isPasswordChanged) {
            _password = passwordTextField.getText().toCharArray();
        }
        _email = emailTextField.getText();
        _phoneNumber = phoneNumberTextField.getText();
        
        List<String> errors = validateInput();
        
        if(errors.size() == 0) {
            Person person = new Person(_firstName, _secondName, _lastName);
            _user.setPerson(person);
            if(_isPasswordChanged) {
                _user.getPassword().changePassword(_password);
            }
            _user.setUsername(_username);
            _user.setEmail(_email);
            _user.setPhoneNumber(_phoneNumber);
            getDataChangedEvent().fireDataChangedEvent();

            dispose();
        }
        else {
            String errorMessage = "";
            
            for(String error : errors) {
                errorMessage = errorMessage.concat(error + '\n');
            }
            
            JOptionPane.showMessageDialog(this, errorMessage, "Error", 0);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private List<String> validateInput() {
        List<String> errors = new LinkedList<>();
        
        if(_firstName.isBlank()) {
            errors.add("First name field cannot be empty");
        }
        if(_secondName.isBlank()) {
            errors.add("Second name field cannot be empty");
        }
        if(_lastName.isBlank()) {
            errors.add("Last name field cannot be empty");
        }
        if(_username.isBlank()) {
            errors.add("Username field cannot be empty");
        }
        if(_isPasswordChanged) {
            if(_password.length == 0) {
            errors.add("Password field cannot be empty");
            }
        }
        if(!_email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            errors.add("Invalid email");
        }
        if(!_phoneNumber.matches("^[0-9]+$")) {
            errors.add("Phone field should cantain only numbers");
        }
        
        return errors;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox changePasswordCheckBox;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel phoneNumberLabel1;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel secondNameLabel1;
    private javax.swing.JTextField secondNameTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
