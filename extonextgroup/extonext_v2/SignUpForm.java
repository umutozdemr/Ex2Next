/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extonextgroup.extonext_v2;

import java.awt.Color;

/**
 *
 * @author DELL
 */
public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        signUpBackground1 = new netbeanscomponents.SignUpBackground();
        jPanel1 = new javax.swing.JPanel();
        corporationname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        emailagain = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        passwordagain = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        cardno = new javax.swing.JTextField();
        cardname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        duedate = new javax.swing.JTextField();
        cvc = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        signupbutton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(6, 1, 0, 45));

        corporationname.setBackground(new java.awt.Color(255, 255, 255));
        corporationname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        corporationname.setForeground(new java.awt.Color(204, 204, 204));
        corporationname.setText("If Corporation please enter Corporation Name:");
        corporationname.setBorder(null);
        corporationname.setOpaque(false);
        corporationname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corporationnameMouseClicked(evt);
            }
        });
        jPanel1.add(corporationname);

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("User Name:");
        username.setBorder(null);
        username.setOpaque(false);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel1.add(username);

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("Email:");
        email.setBorder(null);
        email.setOpaque(false);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        jPanel1.add(email);

        emailagain.setBackground(new java.awt.Color(255, 255, 255));
        emailagain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emailagain.setForeground(new java.awt.Color(204, 204, 204));
        emailagain.setText("Email Again:");
        emailagain.setBorder(null);
        emailagain.setOpaque(false);
        emailagain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailagainMouseClicked(evt);
            }
        });
        jPanel1.add(emailagain);

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("Password:");
        password.setBorder(null);
        password.setOpaque(false);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password);

        passwordagain.setBackground(new java.awt.Color(255, 255, 255));
        passwordagain.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordagain.setForeground(new java.awt.Color(204, 204, 204));
        passwordagain.setText("Password Again:");
        passwordagain.setBorder(null);
        passwordagain.setOpaque(false);
        passwordagain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordagainMouseClicked(evt);
            }
        });
        jPanel1.add(passwordagain);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(6, 1, 0, 45));

        jPanel4.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add Photo:");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Browse files");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);

        cardno.setBackground(new java.awt.Color(255, 255, 255));
        cardno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cardno.setForeground(new java.awt.Color(204, 204, 204));
        cardno.setText("Card no:");
        cardno.setBorder(null);
        cardno.setOpaque(false);
        cardno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardnoMouseClicked(evt);
            }
        });

        cardname.setBackground(new java.awt.Color(255, 255, 255));
        cardname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cardname.setForeground(new java.awt.Color(204, 204, 204));
        cardname.setText("Name on the Card:");
        cardname.setBorder(null);
        cardname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardnameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        duedate.setBackground(new java.awt.Color(255, 255, 255));
        duedate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        duedate.setForeground(new java.awt.Color(204, 204, 204));
        duedate.setText("Due Date:");
        duedate.setBorder(null);
        duedate.setOpaque(false);
        duedate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duedateMouseClicked(evt);
            }
        });

        cvc.setBackground(new java.awt.Color(255, 255, 255));
        cvc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cvc.setForeground(new java.awt.Color(204, 204, 204));
        cvc.setText("CVC:");
        cvc.setBorder(null);
        cvc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cvcMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(cvc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(204, 204, 204));
        address.setText("Address:");
        address.setBorder(null);
        address.setOpaque(false);
        address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressMouseClicked(evt);
            }
        });
        jPanel2.add(address);

        phonenumber.setBackground(new java.awt.Color(255, 255, 255));
        phonenumber.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phonenumber.setForeground(new java.awt.Color(204, 204, 204));
        phonenumber.setText("Phone Number:");
        phonenumber.setBorder(null);
        phonenumber.setOpaque(false);
        phonenumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonenumberMouseClicked(evt);
            }
        });
        jPanel2.add(phonenumber);

        location.setBackground(new java.awt.Color(255, 255, 255));
        location.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        location.setForeground(new java.awt.Color(204, 204, 204));
        location.setText("Location:");
        location.setBorder(null);
        location.setOpaque(false);
        location.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationMouseClicked(evt);
            }
        });
        jPanel2.add(location);

        signupbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/signupbutton1.png"))); // NOI18N
        signupbutton.setBorder(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Personal");
        jRadioButton1.setBorder(null);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(73, 73, 73))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout signUpBackground1Layout = new javax.swing.GroupLayout(signUpBackground1);
        signUpBackground1.setLayout(signUpBackground1Layout);
        signUpBackground1Layout.setHorizontalGroup(
            signUpBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpBackground1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(signUpBackground1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpBackground1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signupbutton)
                .addGap(257, 257, 257))
        );
        signUpBackground1Layout.setVerticalGroup(
            signUpBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpBackground1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(signUpBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(signupbutton)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void corporationnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corporationnameMouseClicked
        // TODO add your handling code here:
        corporationname.setText("");
        corporationname.setForeground(Color.BLACK);
    }//GEN-LAST:event_corporationnameMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        // TODO add your handling code here:
        username.setText("");
        username.setForeground(Color.BLACK);
    }//GEN-LAST:event_usernameMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        // TODO add your handling code here:
        email.setText("");
        email.setForeground(Color.BLACK);
    }//GEN-LAST:event_emailMouseClicked

    private void emailagainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailagainMouseClicked
        // TODO add your handling code here:
        emailagain.setText("");
        emailagain.setForeground(Color.BLACK);
    }//GEN-LAST:event_emailagainMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        // TODO add your handling code here:
        password.setText("");
        password.setForeground(Color.BLACK);
    }//GEN-LAST:event_passwordMouseClicked

    private void passwordagainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordagainMouseClicked
        // TODO add your handling code here:
        passwordagain.setText("");
        passwordagain.setForeground(Color.BLACK);
    }//GEN-LAST:event_passwordagainMouseClicked

    private void addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressMouseClicked
        // TODO add your handling code here:
        address.setText("");
        address.setForeground(Color.BLACK);
    }//GEN-LAST:event_addressMouseClicked

    private void phonenumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonenumberMouseClicked
        // TODO add your handling code here:
        phonenumber.setText("");
        phonenumber.setForeground(Color.BLACK);
    }//GEN-LAST:event_phonenumberMouseClicked

    private void locationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationMouseClicked
        // TODO add your handling code here:
        location.setText("");
        location.setForeground(Color.BLACK);
    }//GEN-LAST:event_locationMouseClicked

    private void duedateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duedateMouseClicked
        // TODO add your handling code here:
        duedate.setText("");
        duedate.setForeground(Color.BLACK);
    }//GEN-LAST:event_duedateMouseClicked

    private void cvcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvcMouseClicked
        // TODO add your handling code here:
        cvc.setText("");
        cvc.setForeground(Color.BLACK);
    }//GEN-LAST:event_cvcMouseClicked

    private void cardnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardnoMouseClicked
        // TODO add your handling code here:
        cardno.setText("");
        cardno.setForeground(Color.BLACK);
    }//GEN-LAST:event_cardnoMouseClicked

    private void cardnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardnameMouseClicked
        // TODO add your handling code here:
        cardname.setText("");
        cardname.setForeground(Color.BLACK);
    }//GEN-LAST:event_cardnameMouseClicked

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cardname;
    private javax.swing.JTextField cardno;
    private javax.swing.JTextField corporationname;
    private javax.swing.JTextField cvc;
    private javax.swing.JTextField duedate;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailagain;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField location;
    private javax.swing.JTextField password;
    private javax.swing.JTextField passwordagain;
    private javax.swing.JTextField phonenumber;
    private netbeanscomponents.SignUpBackground signUpBackground1;
    private javax.swing.JButton signupbutton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}