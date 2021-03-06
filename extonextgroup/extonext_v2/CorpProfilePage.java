/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extonextgroup.extonext_v2;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class CorpProfilePage extends javax.swing.JFrame {

    /**
     * Creates new form CorpProfilePage
     */
    public CorpProfilePage() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        profilemenu = new javax.swing.JMenuItem();
        logoutmenu = new javax.swing.JMenuItem();
        corpProfileBackground1 = new netbeanscomponents.CorpProfileBackground();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        corpname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        cardinfo = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        evaaverage = new javax.swing.JLabel();
        evacount = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        logobutton = new javax.swing.JButton();
        messagebutton = new javax.swing.JButton();
        profilebutton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        mydonationspic1 = new javax.swing.JLabel();
        mydonationspic2 = new javax.swing.JLabel();
        mydonationspic3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        donationsigetpic1 = new javax.swing.JLabel();
        donationsigetpic2 = new javax.swing.JLabel();
        donationsigetpic3 = new javax.swing.JLabel();
        profilepic = new javax.swing.JLabel();

        jPopupMenu1.setBackground(new java.awt.Color(204, 0, 255));
        jPopupMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jPopupMenu1.setAlignmentX(10.0F);

        profilemenu.setBackground(new java.awt.Color(204, 0, 255));
        profilemenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        profilemenu.setForeground(new java.awt.Color(255, 255, 255));
        profilemenu.setText("Go Profile");
        profilemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilemenuMouseClicked(evt);
            }
        });
        profilemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilemenuActionPerformed(evt);
            }
        });
        jPopupMenu1.add(profilemenu);

        logoutmenu.setBackground(new java.awt.Color(204, 0, 255));
        logoutmenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        logoutmenu.setForeground(new java.awt.Color(255, 255, 255));
        logoutmenu.setText("Logout");
        logoutmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutmenuActionPerformed(evt);
            }
        });
        jPopupMenu1.add(logoutmenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(6, 1, 0, 10));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setText("Username:");
        jPanel1.add(username);

        corpname.setBackground(new java.awt.Color(255, 255, 255));
        corpname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        corpname.setForeground(new java.awt.Color(0, 0, 0));
        corpname.setText("Corp. Name:");
        jPanel1.add(corpname);

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email:");
        jPanel1.add(email);

        phonenumber.setBackground(new java.awt.Color(255, 255, 255));
        phonenumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        phonenumber.setForeground(new java.awt.Color(0, 0, 0));
        phonenumber.setText("Phone Num:");
        jPanel1.add(phonenumber);

        cardinfo.setBackground(new java.awt.Color(255, 255, 255));
        cardinfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cardinfo.setForeground(new java.awt.Color(0, 0, 0));
        cardinfo.setText("Card Info:");
        jPanel1.add(cardinfo);

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setText("Address:");
        jPanel1.add(address);

        evaaverage.setBackground(new java.awt.Color(255, 255, 255));
        evaaverage.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        evaaverage.setForeground(new java.awt.Color(0, 0, 0));
        evaaverage.setText("Evaluation Average:");

        evacount.setBackground(new java.awt.Color(255, 255, 255));
        evacount.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        evacount.setForeground(new java.awt.Color(0, 0, 0));
        evacount.setText("Evaluation Count:");

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        logobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/logo.png"))); // NOI18N
        logobutton.setBorder(null);
        logobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logobuttonActionPerformed(evt);
            }
        });

        messagebutton.setBackground(new java.awt.Color(255, 255, 255));
        messagebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/55x37messagebutton.png"))); // NOI18N
        messagebutton.setBorder(null);
        messagebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagebuttonActionPerformed(evt);
            }
        });

        profilebutton.setBackground(new java.awt.Color(255, 255, 255));
        profilebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/37x37profilebutton.png"))); // NOI18N
        profilebutton.setBorder(null);
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        mydonationspic1.setBackground(new java.awt.Color(153, 153, 255));
        mydonationspic1.setOpaque(true);
        jPanel10.add(mydonationspic1);

        mydonationspic2.setBackground(new java.awt.Color(204, 102, 255));
        mydonationspic2.setOpaque(true);
        jPanel10.add(mydonationspic2);

        mydonationspic3.setBackground(new java.awt.Color(204, 153, 255));
        mydonationspic3.setOpaque(true);
        jPanel10.add(mydonationspic3);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        donationsigetpic1.setBackground(new java.awt.Color(153, 153, 255));
        donationsigetpic1.setOpaque(true);
        jPanel11.add(donationsigetpic1);

        donationsigetpic2.setBackground(new java.awt.Color(204, 102, 255));
        donationsigetpic2.setOpaque(true);
        jPanel11.add(donationsigetpic2);

        donationsigetpic3.setBackground(new java.awt.Color(204, 153, 255));
        donationsigetpic3.setOpaque(true);
        jPanel11.add(donationsigetpic3);

        javax.swing.GroupLayout corpProfileBackground1Layout = new javax.swing.GroupLayout(corpProfileBackground1);
        corpProfileBackground1.setLayout(corpProfileBackground1Layout);
        corpProfileBackground1Layout.setHorizontalGroup(
            corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                        .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(evaaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evacount, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(474, 474, 474)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(profilepic, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                .addGap(111, 111, 111))
            .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messagebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        corpProfileBackground1Layout.setVerticalGroup(
            corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logobutton)
                    .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(messagebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpProfileBackground1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                        .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(corpProfileBackground1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(profilepic, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addGroup(corpProfileBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(evacount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(evaaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(corpProfileBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(corpProfileBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

    private void logobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logobuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logobuttonActionPerformed

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.show(this,989,117);
    }//GEN-LAST:event_profilebuttonActionPerformed

    private void messagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagebuttonActionPerformed

    private void profilemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilemenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemenuMouseClicked

    private void profilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilemenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemenuActionPerformed

    private void logoutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuActionPerformed
        // TODO add your handling code here:
        infoBox("Successfully logged out" , "logout" );
    }//GEN-LAST:event_logoutmenuActionPerformed

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
            java.util.logging.Logger.getLogger(CorpProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorpProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorpProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorpProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorpProfilePage().setVisible(true);
            }
        });
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel cardinfo;
    private netbeanscomponents.CorpProfileBackground corpProfileBackground1;
    private javax.swing.JLabel corpname;
    private javax.swing.JLabel donationsigetpic1;
    private javax.swing.JLabel donationsigetpic2;
    private javax.swing.JLabel donationsigetpic3;
    private javax.swing.JLabel email;
    private javax.swing.JLabel evaaverage;
    private javax.swing.JLabel evacount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JLabel mydonationspic1;
    private javax.swing.JLabel mydonationspic2;
    private javax.swing.JLabel mydonationspic3;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    private javax.swing.JLabel profilepic;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
