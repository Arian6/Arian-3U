/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1krasniqiari
 */
public class Friends extends javax.swing.JFrame {

    /**
     * Creates new form Friends
     */
    public Friends() {
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
        friendsTitleLabel = new javax.swing.JLabel();
        importDataButton = new javax.swing.JButton();
        friendsListDropDownMenu = new javax.swing.JComboBox();
        addressTitleLabel = new javax.swing.JLabel();
        phoneNumberTitleLabel = new javax.swing.JLabel();
        emailTitleLabel = new javax.swing.JLabel();
        AddressOutputLabel = new javax.swing.JLabel();
        phoneNumberOutputLabel = new javax.swing.JLabel();
        emailOutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        friendsTitleLabel.setText("My Friends");

        importDataButton.setText("Import");
        importDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importDataButtonActionPerformed(evt);
            }
        });

        friendsListDropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendsListDropDownMenuActionPerformed(evt);
            }
        });

        addressTitleLabel.setText("Address:");

        phoneNumberTitleLabel.setText("Phone Number");

        emailTitleLabel.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTitleLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addressTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneNumberTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(importDataButton)
                            .addComponent(friendsTitleLabel))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddressOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(friendsListDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(friendsTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(importDataButton)
                .addGap(18, 18, 18)
                .addComponent(friendsListDropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTitleLabel)
                    .addComponent(AddressOutputLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTitleLabel)
                    .addComponent(phoneNumberOutputLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTitleLabel)
                    .addComponent(emailOutputLabel))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importDataButtonActionPerformed
        // TODO add your handling code here:

        File file = new File("friends.xml");
        Builder builder = new Builder();
        Document friendsDocument;
        Element friendsroot;

        try {
            friendsDocument = builder.build(file);
            friendsroot = friendsDocument.getRootElement();
            Elements friends = friendsroot.getChildElements();

            DefaultComboBoxModel model = new DefaultComboBoxModel();

            for (int i = 0; i < friends.size(); i++) {
                model.addElement(friends.get(i).getFirstChildElement("name").getValue());

            }
            friendsListDropDownMenu.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_importDataButtonActionPerformed

    private void friendsListDropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendsListDropDownMenuActionPerformed

        File file = new File("friends.xml");
        Builder builder = new Builder();
        Document friendsDocument;
        Element friendsroot;

        try {
            friendsDocument = builder.build(file);
            friendsroot = friendsDocument.getRootElement();
            Elements friends = friendsroot.getChildElements();

            DefaultComboBoxModel model = new DefaultComboBoxModel();

            for (int i = 0; i < friends.size(); i++) {
                model.addElement(friends.get(i).getFirstChildElement("name").getValue());

            }

            int index = friendsListDropDownMenu.getSelectedIndex();

            if (index == 0) {
                AddressOutputLabel.setText(friends.get(0).getFirstChildElement("address").getValue());
                emailOutputLabel.setText(friends.get(0).getFirstChildElement("email").getValue());
                phoneNumberOutputLabel.setText(friends.get(0).getFirstChildElement("phone").getValue());

            }
            if (index == 1) {
                AddressOutputLabel.setText(friends.get(1).getFirstChildElement("address").getValue());
                emailOutputLabel.setText(friends.get(1).getFirstChildElement("email").getValue());
                phoneNumberOutputLabel.setText(friends.get(1).getFirstChildElement("phone").getValue());

            }
            if (index == 2) {
                AddressOutputLabel.setText(friends.get(2).getFirstChildElement("address").getValue());
                emailOutputLabel.setText(friends.get(2).getFirstChildElement("email").getValue());
                phoneNumberOutputLabel.setText(friends.get(2).getFirstChildElement("phone").getValue());

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_friendsListDropDownMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Friends().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressOutputLabel;
    private javax.swing.JLabel addressTitleLabel;
    private javax.swing.JLabel emailOutputLabel;
    private javax.swing.JLabel emailTitleLabel;
    private javax.swing.JComboBox friendsListDropDownMenu;
    private javax.swing.JLabel friendsTitleLabel;
    private javax.swing.JButton importDataButton;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel phoneNumberOutputLabel;
    private javax.swing.JLabel phoneNumberTitleLabel;
    // End of variables declaration//GEN-END:variables
}
