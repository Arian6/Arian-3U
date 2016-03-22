/*Project: SplashScreen
 *Date: Jubne 16 2015
 *Version: v0.1
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.summative;

public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startQuizButton = new javax.swing.JButton();
        backGroundLabelForSplashScreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(1000, 400));
        setMinimumSize(new java.awt.Dimension(1000, 400));
        setPreferredSize(new java.awt.Dimension(1000, 430));
        getContentPane().setLayout(null);

        startQuizButton.setBackground(new java.awt.Color(255, 255, 255));
        startQuizButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startQuizButton.setText("Start Quiz!");
        startQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startQuiz(evt);
            }
        });
        getContentPane().add(startQuizButton);
        startQuizButton.setBounds(270, 310, 370, 50);
        getContentPane().add(backGroundLabelForSplashScreen);
        backGroundLabelForSplashScreen.setBounds(0, 0, 985, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startQuiz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startQuiz
        new Quiz().setVisible(true);
        this.setVisible(false);
        this.dispose();


    }//GEN-LAST:event_startQuiz

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundLabelForSplashScreen;
    private javax.swing.JButton startQuizButton;
    // End of variables declaration//GEN-END:variables
}
