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
public class CorpDonateScreen extends javax.swing.JFrame {

    /**
     * Creates new form CorpDonateScreen
     */
    public CorpDonateScreen() {
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        backgroundcorp1 = new netbeanscomponents.Backgroundcorp();
        backbutton = new javax.swing.JButton();
        logobutton = new javax.swing.JButton();
        messagebutton = new javax.swing.JButton();
        profilebutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Vehicleoption = new javax.swing.JRadioButton();
        clothesoption = new javax.swing.JRadioButton();
        furnitureoption = new javax.swing.JRadioButton();
        moviebookoption = new javax.swing.JRadioButton();
        electronicoption = new javax.swing.JRadioButton();
        Vehiclebox = new javax.swing.JComboBox<>();
        clothesbox = new javax.swing.JComboBox<>();
        furniturebox = new javax.swing.JComboBox<>();
        moviebookbox = new javax.swing.JComboBox<>();
        electronicbox = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

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

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        logobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/logo.png"))); // NOI18N
        logobutton.setBorder(null);

        messagebutton.setBackground(new java.awt.Color(255, 255, 255));
        messagebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/55x37messagebutton.png"))); // NOI18N
        messagebutton.setBorder(null);

        profilebutton.setBackground(new java.awt.Color(255, 255, 255));
        profilebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extonextgroup/extonext_v2/images/37x37profilebutton.png"))); // NOI18N
        profilebutton.setBorder(null);
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 5, 0, 50));

        Vehicleoption.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(Vehicleoption);
        Vehicleoption.setForeground(new java.awt.Color(153, 51, 255));
        Vehicleoption.setSelected(true);
        Vehicleoption.setText("Vehicle");
        jPanel1.add(Vehicleoption);

        clothesoption.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(clothesoption);
        clothesoption.setForeground(new java.awt.Color(153, 51, 255));
        clothesoption.setText("Clothes");
        jPanel1.add(clothesoption);

        furnitureoption.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(furnitureoption);
        furnitureoption.setForeground(new java.awt.Color(153, 51, 255));
        furnitureoption.setText("Furniture");
        jPanel1.add(furnitureoption);

        moviebookoption.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(moviebookoption);
        moviebookoption.setForeground(new java.awt.Color(153, 51, 255));
        moviebookoption.setText("Movie/Book");
        jPanel1.add(moviebookoption);

        electronicoption.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(electronicoption);
        electronicoption.setForeground(new java.awt.Color(153, 51, 255));
        electronicoption.setText("Electronic Devices");
        jPanel1.add(electronicoption);

        Vehiclebox.setBackground(new java.awt.Color(255, 255, 153));
        Vehiclebox.setForeground(new java.awt.Color(153, 51, 255));
        Vehiclebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Motorcycle", "Cycle", "Truck" }));
        Vehiclebox.setBorder(null);
        Vehiclebox.setEnabled(Vehicleoption.isSelected());
        jPanel1.add(Vehiclebox);

        clothesbox.setBackground(new java.awt.Color(255, 255, 153));
        clothesbox.setForeground(new java.awt.Color(153, 51, 255));
        clothesbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Woman", "Man", "Kids" }));
        clothesbox.setEnabled(clothesoption.isSelected());
        jPanel1.add(clothesbox);

        furniturebox.setBackground(new java.awt.Color(255, 255, 153));
        furniturebox.setForeground(new java.awt.Color(153, 51, 255));
        furniturebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Living Room", "Bathroom", "Kitchen", "Dining Room", "Bed Room", "Study Room" }));
        furniturebox.setEnabled(furnitureoption.isSelected());
        jPanel1.add(furniturebox);

        moviebookbox.setBackground(new java.awt.Color(255, 255, 153));
        moviebookbox.setForeground(new java.awt.Color(153, 51, 255));
        moviebookbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Literature", "Education", "Kids" }));
        moviebookbox.setEnabled(moviebookoption.isSelected());
        jPanel1.add(moviebookbox);

        electronicbox.setBackground(new java.awt.Color(255, 255, 153));
        electronicbox.setForeground(new java.awt.Color(153, 51, 255));
        electronicbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Cellphone", "Television", "Camera", "Air Conditioner", "White Appliances" }));
        electronicbox.setEnabled(electronicoption.isSelected());
        jPanel1.add(electronicbox);

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Search..");
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundcorp1Layout = new javax.swing.GroupLayout(backgroundcorp1);
        backgroundcorp1.setLayout(backgroundcorp1Layout);
        backgroundcorp1Layout.setHorizontalGroup(
            backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundcorp1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 594, Short.MAX_VALUE)
                .addComponent(messagebutton)
                .addGap(0, 0, 0)
                .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundcorp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        backgroundcorp1Layout.setVerticalGroup(
            backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundcorp1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundcorp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messagebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logobutton))
                .addGap(144, 144, 144)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundcorp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundcorp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(CorpDonateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorpDonateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorpDonateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorpDonateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorpDonateScreen().setVisible(true);
            }
        });
    }
    
     public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Vehiclebox;
    private javax.swing.JRadioButton Vehicleoption;
    private javax.swing.JButton backbutton;
    private netbeanscomponents.Backgroundcorp backgroundcorp1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> clothesbox;
    private javax.swing.JRadioButton clothesoption;
    private javax.swing.JComboBox<String> electronicbox;
    private javax.swing.JRadioButton electronicoption;
    private javax.swing.JComboBox<String> furniturebox;
    private javax.swing.JRadioButton furnitureoption;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logobutton;
    private javax.swing.JMenuItem logoutmenu;
    private javax.swing.JButton messagebutton;
    private javax.swing.JComboBox<String> moviebookbox;
    private javax.swing.JRadioButton moviebookoption;
    private javax.swing.JButton profilebutton;
    private javax.swing.JMenuItem profilemenu;
    // End of variables declaration//GEN-END:variables
}
