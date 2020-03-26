/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.*;
import javax.swing.event.DocumentEvent;
import utils.SimpleDocumentListener;

/**
 *
 * @author Binh
 */
public class RegistrationPanel extends javax.swing.JPanel {
    private List<ActionListener> createAccActionListeners;
    /**
     * Creates new form RegistrationPanel
     */
    public RegistrationPanel() {
        initComponents();
        
        this.createAccActionListeners = new ArrayList<>();
        this.createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (ActionListener listener : createAccActionListeners) {
                    listener.actionPerformed(e);
                }
            }
        });
        
        this.firstNameText.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void update(DocumentEvent e) {
                if ((firstNameText.getText().length() >= 1) && (lastNameText.getText().length() >= 1)) {
                    emailPanel.setVisible(true);
                }
            }
        });
        
        this.lastNameText.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void update(DocumentEvent e) {
                if ((firstNameText.getText().length() >= 1) && (lastNameText.getText().length() >= 1)) {
                    emailPanel.setVisible(true);
                }
            }
        });
        
        this.emailText.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void update(DocumentEvent e) {
                if (emailText.getText().length() >= 1) {
                    passwordPanel.setVisible(true);
                }
            }
        });
        
        this.passwordPWText.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void update(DocumentEvent e) {
                if (Arrays.toString(passwordPWText.getPassword()).length() >= 1) {
                    confirmPasswordPanel.setVisible(true);
                }
            }
        });
        
        this.confirmPasswordPWText.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void update(DocumentEvent e) {
                if (Arrays.toString(confirmPasswordPWText.getPassword()).length() >= 1
                        && Arrays.toString(confirmPasswordPWText.getPassword())
                                .equals(Arrays.toString(passwordPWText.getPassword()))) {
                    robotPanel.setVisible(true);
                }
            }
        });      
     
    }
    
    public void addCreateAccBtnActionListener(ActionListener a) {
        if (!this.createAccActionListeners.contains(a)) {
            this.createAccActionListeners.add(a);
        }
    }
    
    public boolean isStudent() {
        return this.studentRadioButton.isSelected();
    }
    
    public String getEmail() {
        return this.emailText.getText();
    }
    
    public String getPwd() {
        return String.valueOf(this.passwordPWText.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iAmAButtonGroup = new javax.swing.ButtonGroup();
        accountCreationPanel = new javax.swing.JPanel();
        iAmAPanel = new javax.swing.JPanel();
        iAmALabel = new javax.swing.JLabel();
        studentRadioButton = new javax.swing.JRadioButton();
        professorRadioButton = new javax.swing.JRadioButton();
        namePanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        emailPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordPWText = new javax.swing.JPasswordField();
        confirmPasswordPanel = new javax.swing.JPanel();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordPWText = new javax.swing.JPasswordField();
        robotPanel = new javax.swing.JPanel();
        notARobotCheckbox = new javax.swing.JCheckBox();
        createAccountPanel = new javax.swing.JPanel();
        createAccountButton = new javax.swing.JButton();
        accountCreationLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 51));
        setPreferredSize(new java.awt.Dimension(900, 600));

        iAmALabel.setText("I Am A:");

        iAmAButtonGroup.add(studentRadioButton);
        studentRadioButton.setText("Student");
        studentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioButtonActionPerformed(evt);
            }
        });

        iAmAButtonGroup.add(professorRadioButton);
        professorRadioButton.setText("Professor");
        professorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iAmAPanelLayout = new javax.swing.GroupLayout(iAmAPanel);
        iAmAPanel.setLayout(iAmAPanelLayout);
        iAmAPanelLayout.setHorizontalGroup(
            iAmAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iAmAPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iAmALabel)
                .addGap(18, 18, 18)
                .addComponent(studentRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(professorRadioButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        iAmAPanelLayout.setVerticalGroup(
            iAmAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iAmAPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(iAmAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iAmALabel)
                    .addComponent(studentRadioButton)
                    .addComponent(professorRadioButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        namePanel.setVisible(false);

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lastNameLabel)
                .addGap(100, 100, 100))
            .addGroup(namePanelLayout.createSequentialGroup()
                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        emailPanel.setVisible(false);

        emailLabel.setText("Email");

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(emailText)
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        passwordPanel.setVisible(false);

        passwordLabel.setText("Password");

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel)
                .addContainerGap(285, Short.MAX_VALUE))
            .addComponent(passwordPWText)
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPWText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        confirmPasswordPanel.setVisible(false);

        confirmPasswordLabel.setText("Confirm Password");

        javax.swing.GroupLayout confirmPasswordPanelLayout = new javax.swing.GroupLayout(confirmPasswordPanel);
        confirmPasswordPanel.setLayout(confirmPasswordPanelLayout);
        confirmPasswordPanelLayout.setHorizontalGroup(
            confirmPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmPasswordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(confirmPasswordPanelLayout.createSequentialGroup()
                .addComponent(confirmPasswordPWText, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        confirmPasswordPanelLayout.setVerticalGroup(
            confirmPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPasswordPanelLayout.createSequentialGroup()
                .addComponent(confirmPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordPWText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        robotPanel.setVisible(false);

        notARobotCheckbox.setText("I Am Not A Robot");
        notARobotCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notARobotCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout robotPanelLayout = new javax.swing.GroupLayout(robotPanel);
        robotPanel.setLayout(robotPanelLayout);
        robotPanelLayout.setHorizontalGroup(
            robotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, robotPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(notARobotCheckbox)
                .addContainerGap())
        );
        robotPanelLayout.setVerticalGroup(
            robotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, robotPanelLayout.createSequentialGroup()
                .addComponent(notARobotCheckbox)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        createAccountPanel.setVisible(false);

        createAccountButton.setText("Create My Account");

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(createAccountButton)
                .addContainerGap())
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(createAccountButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        accountCreationLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        accountCreationLabel.setText("Account Creation");

        javax.swing.GroupLayout accountCreationPanelLayout = new javax.swing.GroupLayout(accountCreationPanel);
        accountCreationPanel.setLayout(accountCreationPanelLayout);
        accountCreationPanelLayout.setHorizontalGroup(
            accountCreationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountCreationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountCreationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iAmAPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(accountCreationPanelLayout.createSequentialGroup()
                        .addGroup(accountCreationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accountCreationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confirmPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(accountCreationPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accountCreationPanelLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(robotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
            .addGroup(accountCreationPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(accountCreationLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accountCreationPanelLayout.setVerticalGroup(
            accountCreationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountCreationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountCreationLabel)
                .addGap(18, 18, 18)
                .addComponent(iAmAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(accountCreationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(accountCreationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void notARobotCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notARobotCheckboxActionPerformed
        // TODO add your handling code here:
        createAccountPanel.setVisible(true);
    }//GEN-LAST:event_notARobotCheckboxActionPerformed

    private void professorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorRadioButtonActionPerformed
        // TODO add your handling code here:
        namePanel.setVisible(true);
    }//GEN-LAST:event_professorRadioButtonActionPerformed

    private void studentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRadioButtonActionPerformed
        // TODO add your handling code here:
        namePanel.setVisible(true);
    }//GEN-LAST:event_studentRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountCreationLabel;
    private javax.swing.JPanel accountCreationPanel;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordPWText;
    private javax.swing.JPanel confirmPasswordPanel;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JPanel createAccountPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.ButtonGroup iAmAButtonGroup;
    private javax.swing.JLabel iAmALabel;
    private javax.swing.JPanel iAmAPanel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JPanel namePanel;
    private javax.swing.JCheckBox notARobotCheckbox;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPWText;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JRadioButton professorRadioButton;
    private javax.swing.JPanel robotPanel;
    private javax.swing.JRadioButton studentRadioButton;
    // End of variables declaration//GEN-END:variables
}