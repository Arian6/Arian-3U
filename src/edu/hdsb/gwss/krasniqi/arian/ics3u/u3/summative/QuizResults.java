/*Project: Results
 *Date: Jubne 16 2015
 *Version: v0.3
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.summative;

public class QuizResults extends javax.swing.JFrame {

    public QuizResults(int score) {
        initComponents();

        totalScoreLabel.setText(score + " / 10");

        if (score < 5) {
            messageForUserAtEndDisplay.setText("You Failed! Study next time!");
        } else if (score < 9 && score > 4) {
            messageForUserAtEndDisplay.setText("Congradulations! You Passed!");
        } else {
            messageForUserAtEndDisplay.setText("WOW! Fantastic!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endQuizButton = new javax.swing.JButton();
        totalScoreLabel = new javax.swing.JLabel();
        messageForUserAtEndDisplay = new javax.swing.JLabel();
        backgroundLabelForResults = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 550));
        setMinimumSize(new java.awt.Dimension(400, 550));
        setPreferredSize(new java.awt.Dimension(400, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        endQuizButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        endQuizButton.setText("End Quiz");
        endQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endQuizButtonActionPerformed(evt);
            }
        });
        getContentPane().add(endQuizButton);
        endQuizButton.setBounds(50, 420, 290, 60);

        totalScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalScoreLabel.setText("Your Total Score is: 6/15!");
        getContentPane().add(totalScoreLabel);
        totalScoreLabel.setBounds(290, 120, 60, 30);

        messageForUserAtEndDisplay.setText("Too Bad! Better Luck Next Time!");
        getContentPane().add(messageForUserAtEndDisplay);
        messageForUserAtEndDisplay.setBounds(120, 280, 200, 80);
        getContentPane().add(backgroundLabelForResults);
        backgroundLabelForResults.setBounds(0, 0, 370, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void endQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endQuizButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_endQuizButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QuizResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizResults(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabelForResults;
    private javax.swing.JButton endQuizButton;
    private javax.swing.JLabel messageForUserAtEndDisplay;
    private javax.swing.JLabel totalScoreLabel;
    // End of variables declaration//GEN-END:variables
}
