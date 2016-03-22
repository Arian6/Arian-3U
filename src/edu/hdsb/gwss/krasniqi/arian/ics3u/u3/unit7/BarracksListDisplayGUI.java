/* Name: BarracksListDisplayGUI
 * Version: v0.3
 * Date:June 5 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.File;
import java.text.NumberFormat;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

public class BarracksListDisplayGUI extends javax.swing.JFrame {

    BarracksListGUI opener;

    public BarracksListDisplayGUI(BarracksListGUI opener) {
        initComponents();

        this.opener = opener;

    }

    public BarracksListDisplayGUI() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        switchToMainDisplay = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        assualtRifleListDisplayText = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        subMachineGunDisplayText = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        sniperRifleDisplayText = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        pistolDisplayText = new javax.swing.JTextArea();
        valueOfInventoryTitleLabel = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        valueOfInventoryPriceLabel = new javax.swing.JLabel();
        displayInventoryButton = new javax.swing.JButton();
        assaultRifleLabel = new javax.swing.JLabel();
        subMachineGunLabel = new javax.swing.JLabel();
        sniperRifleLabel = new javax.swing.JLabel();
        pistolLabel = new javax.swing.JLabel();
        valueOfInventoryPriceDisplay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(750, 600));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 400));
        getContentPane().setLayout(null);

        switchToMainDisplay.setText("Main Menu");
        switchToMainDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToMainDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(switchToMainDisplay);
        switchToMainDisplay.setBounds(290, 510, 160, 23);

        assualtRifleListDisplayText.setColumns(20);
        assualtRifleListDisplayText.setRows(5);
        jScrollPane4.setViewportView(assualtRifleListDisplayText);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 192, 166, 229);

        subMachineGunDisplayText.setColumns(20);
        subMachineGunDisplayText.setRows(5);
        jScrollPane5.setViewportView(subMachineGunDisplayText);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(194, 192, 166, 229);

        sniperRifleDisplayText.setColumns(20);
        sniperRifleDisplayText.setRows(5);
        jScrollPane6.setViewportView(sniperRifleDisplayText);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(378, 192, 166, 229);

        pistolDisplayText.setColumns(20);
        pistolDisplayText.setRows(5);
        jScrollPane7.setViewportView(pistolDisplayText);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(562, 192, 166, 229);

        valueOfInventoryTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueOfInventoryTitleLabel.setText("Total Value of Inventory:");
        getContentPane().add(valueOfInventoryTitleLabel);
        valueOfInventoryTitleLabel.setBounds(160, 450, 200, 30);
        getContentPane().add(value);
        value.setBounds(396, 463, 0, 0);
        getContentPane().add(valueOfInventoryPriceLabel);
        valueOfInventoryPriceLabel.setBounds(378, 463, 70, 0);

        displayInventoryButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayInventoryButton.setText("Display Inventory");
        displayInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInventoryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(displayInventoryButton);
        displayInventoryButton.setBounds(290, 140, 180, 23);

        assaultRifleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assaultRifleLabel.setText("Assault Rifle");
        getContentPane().add(assaultRifleLabel);
        assaultRifleLabel.setBounds(50, 160, 110, 17);

        subMachineGunLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subMachineGunLabel.setText("Sub-Machine Guns");
        getContentPane().add(subMachineGunLabel);
        subMachineGunLabel.setBounds(210, 160, 130, 20);

        sniperRifleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sniperRifleLabel.setText("Sniper Rifle");
        getContentPane().add(sniperRifleLabel);
        sniperRifleLabel.setBounds(420, 160, 100, 20);

        pistolLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pistolLabel.setText("Pistol");
        getContentPane().add(pistolLabel);
        pistolLabel.setBounds(620, 160, 70, 20);
        getContentPane().add(valueOfInventoryPriceDisplay);
        valueOfInventoryPriceDisplay.setBounds(380, 450, 170, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/krasniqi/arian/ics3u/u3/unit7/bgforgui.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchToMainDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToMainDisplayActionPerformed
        // TODO add your handling code here:
        opener.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_switchToMainDisplayActionPerformed

    private void displayInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInventoryButtonActionPerformed

        //starting string variables for the list of inputs
        printAssaultRifleList = "";
        printSubMachineGunList = "";
        printSniperRifleList = "";
        printPistolList = "";
        totalCost = 0;

        //currency formatter
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        File file = new File("BarrackInventory.xml");
        Builder builder = new Builder();

        try {
            Document doc = builder.build(file);
            Element inventory = doc.getRootElement();
            Elements guns = inventory.getChildElements();

            //reads all information on assault rifles, saves it to alist
            for (int i = 0; i < guns.size(); i++) {
                if (guns.get(i).getFirstChildElement("type").getValue().equals("Assault Rifle")) {

                    printAssaultRifleList = printAssaultRifleList + guns.get(i).getFirstChildElement("name").getValue() + " x " + guns.get(i).getFirstChildElement("quantity").getValue() + "\n";

                    assualtRifleListDisplayText.setText(printAssaultRifleList);
                }
                //reads all information on sub machine guns, saves it to alist
                if (guns.get(i).getFirstChildElement("type").getValue().equals("Sub-Machine Gun")) {

                    printSubMachineGunList = printSubMachineGunList + guns.get(i).getFirstChildElement("name").getValue() + " x " + guns.get(i).getFirstChildElement("quantity").getValue() + "\n";

                    subMachineGunDisplayText.setText(printSubMachineGunList);
                }
                //reads all information on sniper rifles, saves it to alist
                if (guns.get(i).getFirstChildElement("type").getValue().equals("Sniper Rifle")) {

                    printSniperRifleList = printSniperRifleList + guns.get(i).getFirstChildElement("name").getValue() + " x " + guns.get(i).getFirstChildElement("quantity").getValue() + "\n";

                    sniperRifleDisplayText.setText(printSniperRifleList);
                }
                //reads all information on pistols, saves it to alist
                if (guns.get(i).getFirstChildElement("type").getValue().equals("Pistol")) {

                    printPistolList = printPistolList + guns.get(i).getFirstChildElement("name").getValue() + " x " + guns.get(i).getFirstChildElement("quantity").getValue() + "\n";

                    pistolDisplayText.setText(printPistolList);
                }

                //determines total price by multiplying guns worth, to the amount of guns
                double pricePerGun = Double.parseDouble(guns.get(i).getFirstChildElement("cost").getValue()) * Double.parseDouble(guns.get(i).getFirstChildElement("quantity").getValue());

                totalCost = totalCost + pricePerGun;

                valueOfInventoryPriceDisplay.setText("" + currencyFormatter.format(totalCost));

            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_displayInventoryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BarracksListDisplayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarracksListDisplayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarracksListDisplayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarracksListDisplayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarracksListDisplayGUI().setVisible(true);
            }
        });
    }

    //variable declaration
    String printAssaultRifleList = "";
    String printSubMachineGunList = "";
    String printSniperRifleList = "";
    String printPistolList = "";
    double totalCost = 0;
    double priceAndQuantity = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assaultRifleLabel;
    private javax.swing.JTextArea assualtRifleListDisplayText;
    private javax.swing.JButton displayInventoryButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea pistolDisplayText;
    private javax.swing.JLabel pistolLabel;
    private javax.swing.JTextArea sniperRifleDisplayText;
    private javax.swing.JLabel sniperRifleLabel;
    private javax.swing.JTextArea subMachineGunDisplayText;
    private javax.swing.JLabel subMachineGunLabel;
    private javax.swing.JButton switchToMainDisplay;
    private javax.swing.JLabel value;
    private javax.swing.JTextField valueOfInventoryPriceDisplay;
    private javax.swing.JLabel valueOfInventoryPriceLabel;
    private javax.swing.JLabel valueOfInventoryTitleLabel;
    // End of variables declaration//GEN-END:variables

}
