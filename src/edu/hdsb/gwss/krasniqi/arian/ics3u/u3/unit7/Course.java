/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author 1krasniqiari
 */
public class Course extends javax.swing.JFrame {

    Element student = new Element(STUDENT_ELEMENT);

    Document studentProfile = new Document(student);

    public Course() {
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

        coursesTitleLabel = new javax.swing.JLabel();
        CourseInputTitleLabel = new javax.swing.JLabel();
        TeacherInputTitleLabel = new javax.swing.JLabel();
        DescriptionTitleLabel = new javax.swing.JLabel();
        schoolBoardInputLabel = new javax.swing.JLabel();
        courseDataInput = new javax.swing.JTextField();
        courseDescriptionDataInput = new javax.swing.JTextField();
        TeacherDataInput = new javax.swing.JTextField();
        schoolBoardDataInput = new javax.swing.JTextField();
        saveDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coursesTitleLabel.setFont(new java.awt.Font("Vineta BT", 0, 36)); // NOI18N
        coursesTitleLabel.setText("Courses");

        CourseInputTitleLabel.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        CourseInputTitleLabel.setText("Course");

        TeacherInputTitleLabel.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        TeacherInputTitleLabel.setText("Teacher");

        DescriptionTitleLabel.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        DescriptionTitleLabel.setText("Course Description");

        schoolBoardInputLabel.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        schoolBoardInputLabel.setText("School Board");

        saveDataButton.setText("Enter");
        saveDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(coursesTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CourseInputTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescriptionTitleLabel)
                            .addComponent(TeacherInputTitleLabel)
                            .addComponent(schoolBoardInputLabel))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TeacherDataInput)
                            .addComponent(schoolBoardDataInput, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(courseDataInput)
                            .addComponent(courseDescriptionDataInput))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveDataButton)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(coursesTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseInputTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionTitleLabel)
                    .addComponent(courseDescriptionDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeacherInputTitleLabel)
                    .addComponent(TeacherDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schoolBoardInputLabel)
                    .addComponent(schoolBoardDataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveDataButton)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataButtonActionPerformed
        // TODO add your handling code here:

        Element courses = new Element(COURSE_ELEMENT);

        Element courseCode = new Element(COURSECODE_ELEMENT);
        courseCode.appendChild(courseDataInput.getText());
        courses.appendChild(courseCode);

        Element description = new Element(DESCRIPTION_ELEMENT);
        description.appendChild(courseDataInput.getText());
        courses.appendChild(description);

        Element teacher = new Element(TEACHER_ELEMENT);
        teacher.appendChild(TeacherDataInput.getText());
        courses.appendChild(teacher);

        Element schoolBoard = new Element(SCHOOLBOARD_ELEMENT);
        schoolBoard.appendChild(schoolBoardDataInput.getText());
        courses.appendChild(schoolBoard);

        student.appendChild(courses);
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(studentProfile);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("CourseSelection.xml"));

            output.write(studentProfile.toXML());

            output.close();

        } catch (IOException ex) {
            System.err.println(ex);
        }


    }//GEN-LAST:event_saveDataButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    static final String STUDENT_ELEMENT = "studentProfile";
    static final String COURSE_ELEMENT = "course";
    static final String COURSECODE_ELEMENT = "courseCode";
    static final String DESCRIPTION_ELEMENT = "description";
    static final String TEACHER_ELEMENT = "teacher";
    static final String SCHOOLBOARD_ELEMENT = "schoolBoard";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseInputTitleLabel;
    private javax.swing.JLabel DescriptionTitleLabel;
    private javax.swing.JTextField TeacherDataInput;
    private javax.swing.JLabel TeacherInputTitleLabel;
    private javax.swing.JTextField courseDataInput;
    private javax.swing.JTextField courseDescriptionDataInput;
    private javax.swing.JLabel coursesTitleLabel;
    private javax.swing.JButton saveDataButton;
    private javax.swing.JTextField schoolBoardDataInput;
    private javax.swing.JLabel schoolBoardInputLabel;
    // End of variables declaration//GEN-END:variables
}
