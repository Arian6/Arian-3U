/*Project: Quiz Page
 *Date: Jubne 16 2015
 *Version: v0.5
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.summative;

import java.awt.Color;
import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

public class Quiz extends javax.swing.JFrame {

    //variable Declaration
    private int score = 0;
    int[] questionArray = new int[10];
    int[] answerArray = new int[4];
    int rightAnswer;
    int questionCounter = 0;
    int answerGeneratorKeeper;
    int counterToTenQuestions = 0;

    //document, file, element and builder
    Document quizDocument;
    Element quizQuestions;

    File file = new File("computerScienceQuiz.xml");
    Builder builder = new Builder();

    public Quiz() {
        initComponents();

        // auto set buttons and score
        displayResultsButton.setEnabled(false);

        scoreDisplayLabel.setText("0 / 0");

        // generating randomised answer and question order
        try {
            quizDocument = builder.build(file);
            quizQuestions = quizDocument.getRootElement();
            Elements questions = quizQuestions.getChildElements();

            boolean isPlaced = false;

            for (int i = 0; i < questionArray.length; i++) {

                isPlaced = false;

                while (!isPlaced) {
                    int questionGenerator = (int) (Math.random() * 15);
                    boolean exists = false;
                    for (int j = 0; j < questionArray.length; j++) {
                        if (questionArray[j] == questionGenerator) {
                            exists = true;
                            j = questionArray.length;
                        }
                    }
                    if (exists == false) {
                        isPlaced = true;
                        questionArray[i] = questionGenerator;
                    }
                }
            }

            randomizedQuestionDisplay.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("question").getValue());

            int answerGenerator = (int) (Math.random() * 4);

            answerGeneratorKeeper = answerGenerator;

            //set answer order
            switch (answerGenerator) {

                case 0:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    break;
                case 1:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    break;
                case 2:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    break;
                case 3:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());

            }

            nextQuestionButton.setEnabled(false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupingAnswerButtons = new javax.swing.ButtonGroup();
        questionNumberLabel = new javax.swing.JLabel();
        displayResultsButton = new javax.swing.JButton();
        randomizedQuestionDisplay = new javax.swing.JLabel();
        nextQuestionButton = new javax.swing.JButton();
        submitAnswerConfirmationButton = new javax.swing.JButton();
        scoreDisplayLabel = new javax.swing.JLabel();
        firstAnswerButtonSelection = new javax.swing.JRadioButton();
        secondAnswerButtonSelection = new javax.swing.JRadioButton();
        thirdAnswerButtonSelection = new javax.swing.JRadioButton();
        fourthAnswerButtonSelection = new javax.swing.JRadioButton();
        correctOrIncorrectDisplay = new javax.swing.JLabel();
        labelForBackgroundQuiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        questionNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        questionNumberLabel.setText("Question #1");
        getContentPane().add(questionNumberLabel);
        questionNumberLabel.setBounds(130, 30, 220, 47);

        displayResultsButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        displayResultsButton.setText("See your Results!");
        displayResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayQuizResults(evt);
            }
        });
        getContentPane().add(displayResultsButton);
        displayResultsButton.setBounds(350, 350, 130, 30);

        randomizedQuestionDisplay.setForeground(new java.awt.Color(255, 255, 255));
        randomizedQuestionDisplay.setText("set text to a question with code");
        getContentPane().add(randomizedQuestionDisplay);
        randomizedQuestionDisplay.setBounds(50, 90, 420, 23);

        nextQuestionButton.setText("Next Question");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextQuestionButton);
        nextQuestionButton.setBounds(190, 300, 140, 23);

        submitAnswerConfirmationButton.setText("Submit");
        submitAnswerConfirmationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAnswerConfirmationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitAnswerConfirmationButton);
        submitAnswerConfirmationButton.setBounds(300, 130, 73, 23);

        scoreDisplayLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(scoreDisplayLabel);
        scoreDisplayLabel.setBounds(50, 300, 100, 50);

        firstAnswerButtonSelection.setBackground(new java.awt.Color(255, 255, 255));
        groupingAnswerButtons.add(firstAnswerButtonSelection);
        firstAnswerButtonSelection.setText("answer 1");
        getContentPane().add(firstAnswerButtonSelection);
        firstAnswerButtonSelection.setBounds(20, 130, 260, 23);

        groupingAnswerButtons.add(secondAnswerButtonSelection);
        secondAnswerButtonSelection.setText("answer 2");
        getContentPane().add(secondAnswerButtonSelection);
        secondAnswerButtonSelection.setBounds(20, 160, 260, 23);

        groupingAnswerButtons.add(thirdAnswerButtonSelection);
        thirdAnswerButtonSelection.setText("answer 3");
        getContentPane().add(thirdAnswerButtonSelection);
        thirdAnswerButtonSelection.setBounds(20, 190, 260, 23);

        groupingAnswerButtons.add(fourthAnswerButtonSelection);
        fourthAnswerButtonSelection.setText("Answer 4");
        getContentPane().add(fourthAnswerButtonSelection);
        fourthAnswerButtonSelection.setBounds(20, 220, 260, 23);

        correctOrIncorrectDisplay.setText("???");
        getContentPane().add(correctOrIncorrectDisplay);
        correctOrIncorrectDisplay.setBounds(230, 270, 70, 20);

        labelForBackgroundQuiz.setIcon(new javax.swing.ImageIcon("G:\\MyPortfolio\\ICS3U\\ICS3U-Arian\\src\\edu\\hdsb\\gwss\\krasniqi\\arian\\ics3u\\u3\\summative\\summativequizbg.jpg")); // NOI18N
        getContentPane().add(labelForBackgroundQuiz);
        labelForBackgroundQuiz.setBounds(0, 0, 510, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayQuizResults(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayQuizResults

        new QuizResults(score).setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_displayQuizResults

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed
        // TODO add your handling code here:

        //auto set buttons and labels
        correctOrIncorrectDisplay.setText("???");
        nextQuestionButton.setEnabled(false);

        groupingAnswerButtons.clearSelection();

        // generating answer orders
        try {

            firstAnswerButtonSelection.setForeground(Color.black);
            secondAnswerButtonSelection.setForeground(Color.black);
            thirdAnswerButtonSelection.setForeground(Color.black);
            fourthAnswerButtonSelection.setForeground(Color.black);

            quizDocument = builder.build(file);
            quizQuestions = quizDocument.getRootElement();
            Elements questions = quizQuestions.getChildElements();

            randomizedQuestionDisplay.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("question").getValue());

            int answerGenerator = (int) (Math.random() * 4);

            answerGeneratorKeeper = answerGenerator;

            switch (answerGenerator) {

                case 0:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    break;
                case 1:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    break;
                case 2:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    break;
                case 3:
                    firstAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer2").getValue());
                    secondAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer3").getValue());
                    thirdAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("answer4").getValue());
                    fourthAnswerButtonSelection.setText(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue());
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    private void submitAnswerConfirmationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAnswerConfirmationButtonActionPerformed
        // TODO add your handling code here:

        try {

            //auto set labels
            counterToTenQuestions = counterToTenQuestions + 1;
            scoreDisplayLabel.setText((score + 1) + "/" + (questionCounter + 1));

            quizDocument = builder.build(file);
            quizQuestions = quizDocument.getRootElement();
            Elements questions = quizQuestions.getChildElements();

            //set results for user after submit
            if (firstAnswerButtonSelection.isSelected() && firstAnswerButtonSelection.getText().equals(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue())) {
                score++;
                correctOrIncorrectDisplay.setText("Correct!");
                scoreDisplayLabel.setText(score + "/" + (questionCounter + 1));
            } else if (secondAnswerButtonSelection.isSelected() && secondAnswerButtonSelection.getText().equals(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue())) {
                score++;
                correctOrIncorrectDisplay.setText("Correct!");
                scoreDisplayLabel.setText(score + "/" + (questionCounter + 1));
            } else if (thirdAnswerButtonSelection.isSelected() && thirdAnswerButtonSelection.getText().equals(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue())) {
                score++;
                correctOrIncorrectDisplay.setText("Correct!");
                scoreDisplayLabel.setText(score + "/" + (questionCounter + 1));
            } else if (fourthAnswerButtonSelection.isSelected() && fourthAnswerButtonSelection.getText().equals(questions.get(questionArray[questionCounter]).getFirstChildElement("correctAnswer").getValue())) {
                score++;
                correctOrIncorrectDisplay.setText("Correct!");
                scoreDisplayLabel.setText(score + "/" + (questionCounter + 1));
            } else {
                correctOrIncorrectDisplay.setText("Incorrect!");
                scoreDisplayLabel.setText(score + "/" + (questionCounter + 1));
            }

            nextQuestionButton.setEnabled(true);

            //change colours to show incorrect or correct
            switch (answerGeneratorKeeper) {

                case 0:
                    firstAnswerButtonSelection.setForeground(Color.green);
                    secondAnswerButtonSelection.setForeground(Color.red);
                    thirdAnswerButtonSelection.setForeground(Color.red);
                    fourthAnswerButtonSelection.setForeground(Color.red);
                    break;
                case 1:
                    firstAnswerButtonSelection.setForeground(Color.red);
                    secondAnswerButtonSelection.setForeground(Color.green);
                    thirdAnswerButtonSelection.setForeground(Color.red);
                    fourthAnswerButtonSelection.setForeground(Color.red);
                    break;
                case 2:
                    firstAnswerButtonSelection.setForeground(Color.red);
                    secondAnswerButtonSelection.setForeground(Color.red);
                    thirdAnswerButtonSelection.setForeground(Color.green);
                    fourthAnswerButtonSelection.setForeground(Color.red);
                    break;
                case 3:
                    firstAnswerButtonSelection.setForeground(Color.red);
                    secondAnswerButtonSelection.setForeground(Color.red);
                    thirdAnswerButtonSelection.setForeground(Color.red);
                    fourthAnswerButtonSelection.setForeground(Color.green);
                    break;
            }

            if (counterToTenQuestions < 10) {

            } else {
                nextQuestionButton.setEnabled(false);
                submitAnswerConfirmationButton.setEnabled(false);
                displayResultsButton.setEnabled(true);

            }

            questionCounter = questionCounter + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_submitAnswerConfirmationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctOrIncorrectDisplay;
    private javax.swing.JButton displayResultsButton;
    private javax.swing.JRadioButton firstAnswerButtonSelection;
    private javax.swing.JRadioButton fourthAnswerButtonSelection;
    private javax.swing.ButtonGroup groupingAnswerButtons;
    private javax.swing.JLabel labelForBackgroundQuiz;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel questionNumberLabel;
    private javax.swing.JLabel randomizedQuestionDisplay;
    private javax.swing.JLabel scoreDisplayLabel;
    private javax.swing.JRadioButton secondAnswerButtonSelection;
    private javax.swing.JButton submitAnswerConfirmationButton;
    private javax.swing.JRadioButton thirdAnswerButtonSelection;
    // End of variables declaration//GEN-END:variables
}
