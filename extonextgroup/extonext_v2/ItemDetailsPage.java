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
public class ItemDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form ItemDetailsPage
     */
    public ItemDetailsPage() {
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
        itemDetailBackground1 = new netbeanscomponents.ItemDetailBackground();
        profilebutton = new javax.swing.JButton();
        messagebutton = new javax.swing.JButton();
        additembutton = new javax.swing.JButton();
        logobutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        itempic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemdetails = new javax.swing.JTextArea();
        itemlabel = new javax.swing.JLabel();
        itempricelabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        userpic = new javax.swing.JLabel();
        averageevaluation = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

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

        profilebutton.setBackground(new java.awt.Color(255, 255, 255));
        profilebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/37x37profilebutton.png"))); // NOI18N
        profilebutton.setBorder(null);
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });

        messagebutton.setBackground(new java.awt.Color(255, 255, 255));
        messagebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/55x37messagebutton.png"))); // NOI18N
        messagebutton.setBorder(null);

        additembutton.setBackground(new java.awt.Color(255, 255, 255));
        additembutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/37x37uploadbutton.png"))); // NOI18N
        additembutton.setBorder(null);
        additembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additembuttonActionPerformed(evt);
            }
        });

        logobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/logo.png"))); // NOI18N
        logobutton.setBorder(null);

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setOpaque(false);

        itemdetails.setBackground(new java.awt.Color(255, 255, 255));
        itemdetails.setColumns(20);
        itemdetails.setForeground(new java.awt.Color(0, 0, 0));
        itemdetails.setRows(5);
        itemdetails.setText("dsasadsa\ndsfafdsafdsa");
        itemdetails.setOpaque(false);
        jScrollPane1.setViewportView(itemdetails);

        itemlabel.setBackground(new java.awt.Color(255, 255, 255));
        itemlabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        itemlabel.setForeground(new java.awt.Color(0, 0, 0));
        itemlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemlabel.setText("labellabel");

        itempricelabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itempricelabel.setForeground(new java.awt.Color(0, 0, 0));
        itempricelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itempricelabel.setText("$$");

        jButton1.setText("Buy Now!");

        jButton2.setText("Add to Fav!");

        username.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("username");

        userpic.setBackground(new java.awt.Color(255, 51, 204));
        userpic.setOpaque(true);

        averageevaluation.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        averageevaluation.setForeground(new java.awt.Color(0, 0, 0));
        averageevaluation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        averageevaluation.setText("Av. Evaluation:");

        jButton3.setText("jButton2");

        javax.swing.GroupLayout itemDetailBackground1Layout = new javax.swing.GroupLayout(itemDetailBackground1);
        itemDetailBackground1.setLayout(itemDetailBackground1Layout);
        itemDetailBackground1Layout.setHorizontalGroup(
            itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(additembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(messagebutton)
                        .addGap(0, 0, 0)
                        .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                                .addComponent(itempic, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemDetailBackground1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(itemlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114))
                                    .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                                        .addGap(287, 287, 287)
                                        .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(averageevaluation, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(itempricelabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap(180, Short.MAX_VALUE))))
                            .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userpic, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214))))))
        );
        itemDetailBackground1Layout.setVerticalGroup(
            itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(backbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(additembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messagebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(itempic, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(itemlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itempricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114)
                .addGroup(itemDetailBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemDetailBackground1Layout.createSequentialGroup()
                        .addComponent(username)
                        .addGap(18, 18, 18)
                        .addComponent(userpic, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(averageevaluation)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemDetailBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemDetailBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonActionPerformed

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.show(this,989,117);
    }//GEN-LAST:event_profilebuttonActionPerformed

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

    private void additembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additembuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_additembuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemDetailsPage().setVisible(true);
            }
        });
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additembutton;
    private javax.swing.JLabel averageevaluation;
    private javax.swing.JButton backbutton;
    private netbeanscomponents.ItemDetailBackground itemDetailBackground1;
    private javax.swing.JTextArea itemdetails;
    private javax.swing.JLabel itemlabel;
    private javax.swing.JLabel itempic;
    private javax.swing.JLabel itempricelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    private javax.swing.JLabel username;
    private javax.swing.JLabel userpic;
    // End of variables declaration//GEN-END:variables
}
