/* Name: BarracksListGUI
 * Version: v0.5
 * Date: June 5 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import static edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7.Course.COURSE_ELEMENT;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;

public class BarracksListGUI extends javax.swing.JFrame {

    BarracksListDisplayGUI childWindow;

    Element inventory; // = new Element(INVENTORY_ELEMENT);

    Document barracks; // = new Document(inventory);

    public BarracksListGUI(BarracksListDisplayGUI opener) {
        initComponents();

        this.childWindow = opener;

    }

    public BarracksListGUI() {
        initComponents();

        //checks if file exists, determines whether to write to or create new file
        try {

            File file = new File("BarrackInventory.xml");
            if (file.length() == 0) {
                inventory = new Element(INVENTORY_ELEMENT);
                barracks = new Document(inventory);
            } else {
                Builder builder = new Builder();
                barracks = builder.build(file);
                inventory = barracks.getRootElement();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weaponNameLabel = new javax.swing.JLabel();
        weaponNameInput = new javax.swing.JTextField();
        weaponTypeLabel = new javax.swing.JLabel();
        weaponTypeComboBoxInput = new javax.swing.JComboBox();
        weaponAmountSlider = new javax.swing.JSlider();
        weaponAmountLabel = new javax.swing.JLabel();
        addToListButton = new javax.swing.JButton();
        weaponCostLabel = new javax.swing.JLabel();
        weaponCostInput = new javax.swing.JTextField();
        switchToDisplayButton = new javax.swing.JButton();
        resetFilebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setMinimumSize(new java.awt.Dimension(580, 430));
        getContentPane().setLayout(null);

        weaponNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        weaponNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        weaponNameLabel.setText("Weapon Name:");
        getContentPane().add(weaponNameLabel);
        weaponNameLabel.setBounds(110, 100, 120, 20);
        getContentPane().add(weaponNameInput);
        weaponNameInput.setBounds(290, 100, 136, 20);

        weaponTypeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        weaponTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        weaponTypeLabel.setText("Weapon Type:");
        getContentPane().add(weaponTypeLabel);
        weaponTypeLabel.setBounds(110, 140, 110, 28);

        weaponTypeComboBoxInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assault Rifle", "Sub-Machine Gun", "Sniper Rifle", "Pistol" }));
        weaponTypeComboBoxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weaponTypeComboBoxInputActionPerformed(evt);
            }
        });
        getContentPane().add(weaponTypeComboBoxInput);
        weaponTypeComboBoxInput.setBounds(290, 150, 136, 20);

        weaponAmountSlider.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        weaponAmountSlider.setMajorTickSpacing(1);
        weaponAmountSlider.setMaximum(10);
        weaponAmountSlider.setMinimum(1);
        weaponAmountSlider.setPaintLabels(true);
        weaponAmountSlider.setPaintTicks(true);
        weaponAmountSlider.setValue(1);
        weaponAmountSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        weaponAmountSlider.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                weaponAmountSliderAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(weaponAmountSlider);
        weaponAmountSlider.setBounds(290, 240, 170, 48);

        weaponAmountLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        weaponAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        weaponAmountLabel.setText("Amount:");
        getContentPane().add(weaponAmountLabel);
        weaponAmountLabel.setBounds(150, 240, 70, 14);

        addToListButton.setText("Add To Inventory");
        addToListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addToListButton);
        addToListButton.setBounds(90, 320, 160, 23);

        weaponCostLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        weaponCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        weaponCostLabel.setText("Weapon Cost ($):");
        getContentPane().add(weaponCostLabel);
        weaponCostLabel.setBounds(90, 190, 130, 14);
        getContentPane().add(weaponCostInput);
        weaponCostInput.setBounds(290, 190, 119, 20);

        switchToDisplayButton.setText("Display Inventory");
        switchToDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToDisplayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(switchToDisplayButton);
        switchToDisplayButton.setBounds(290, 320, 170, 23);

        resetFilebutton.setText("Reset");
        resetFilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFilebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetFilebutton);
        resetFilebutton.setBounds(200, 360, 140, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/krasniqi/arian/ics3u/u3/unit7/gui bg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void weaponTypeComboBoxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weaponTypeComboBoxInputActionPerformed

    }//GEN-LAST:event_weaponTypeComboBoxInputActionPerformed

    private void addToListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToListButtonActionPerformed

        //declare string, int and double inputs
        String weaponTypeComboBoxSelection = (String) weaponTypeComboBoxInput.getSelectedItem();
        String weaponAmountSliderValue = Integer.toString(weaponAmountSlider.getValue());
        double weaponCostDouble = Double.parseDouble(weaponCostInput.getText());
        String weaponCostString = Double.toString(weaponCostDouble);

        //parent root
        Element guns = new Element(COURSE_ELEMENT);

        //create child elements and append them to parent
        Element weaponName = new Element(WEAPONNAME_ELEMENT);
        weaponName.appendChild(weaponNameInput.getText());
        guns.appendChild(weaponName);

        Element weaponType = new Element(WEAPONTYPE_ELEMENT);
        weaponType.appendChild(weaponTypeComboBoxSelection);
        guns.appendChild(weaponType);

        Element weaponQuantity = new Element(WEAPONQUANTITY_ELEMENT);
        weaponQuantity.appendChild(weaponAmountSliderValue);
        guns.appendChild(weaponQuantity);

        Element weaponCost = new Element(WEAPONCOST_ELEMENT);
        weaponCost.appendChild(weaponCostString);
        guns.appendChild(weaponCost);

        //append parent to root element
        inventory.appendChild(guns);

        //write information to xml file
        try {

            BufferedWriter output = new BufferedWriter(new FileWriter("BarrackInventory.xml"));

            output.write(barracks.toXML());

            output.close();

        } catch (IOException e) {

            e.printStackTrace();
        }


    }//GEN-LAST:event_addToListButtonActionPerformed

    private void weaponAmountSliderAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_weaponAmountSliderAncestorAdded

    }//GEN-LAST:event_weaponAmountSliderAncestorAdded

    private void switchToDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToDisplayButtonActionPerformed

        childWindow = new BarracksListDisplayGUI(this);
        childWindow.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_switchToDisplayButtonActionPerformed

    private void resetFilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFilebuttonActionPerformed

        //creates new file if data is to be cleared
        inventory = new Element(INVENTORY_ELEMENT);
        barracks = new Document(inventory);

        inventory = new Element("Inventory");
        barracks = new Document(inventory);

        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("BarrackInventory.xml"));
            output.write(barracks.toXML());
            output.close();

        } catch (IOException ex) {
            System.err.println(ex);
        }

    }//GEN-LAST:event_resetFilebuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarracksListGUI().setVisible(true);
            }
        });
    }
    //constant final variables for elements declared
    static final String INVENTORY_ELEMENT = "barracksInventory";
    static final String WEAPONNAME_ELEMENT = "name";
    static final String WEAPONTYPE_ELEMENT = "type";
    static final String WEAPONQUANTITY_ELEMENT = "quantity";
    static final String WEAPONCOST_ELEMENT = "cost";


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToListButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton resetFilebutton;
    private javax.swing.JButton switchToDisplayButton;
    private javax.swing.JLabel weaponAmountLabel;
    private javax.swing.JSlider weaponAmountSlider;
    private javax.swing.JTextField weaponCostInput;
    private javax.swing.JLabel weaponCostLabel;
    private javax.swing.JTextField weaponNameInput;
    private javax.swing.JLabel weaponNameLabel;
    private javax.swing.JComboBox weaponTypeComboBoxInput;
    private javax.swing.JLabel weaponTypeLabel;
    // End of variables declaration//GEN-END:variables
}
