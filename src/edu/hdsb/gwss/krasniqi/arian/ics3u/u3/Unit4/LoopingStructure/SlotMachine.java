/*Project: Slot Machine
 *Date: Aprile 5 2015
 *Version: v0.8
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        int amountOfTokens = 2;
        int firstRoll;
        int secondRoll;
        int thirdRoll;
        String choiceToExitOrSpin = "";

        //Objects
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(0);
        Scanner input = new Scanner(System.in);

        //User info
        System.out.println("Welcome To Slot Mania!");
        System.out.println();

        System.out.println("Win by scoring three of a kind!");
        System.out.println();

        //collects amount of tokens user has
        System.out.println("3 tokens for 1 spin! Enter your amount of Tokens!");
        amountOfTokens = input.nextInt();
        int amountOfTurns = amountOfTokens / 3;

        // determines amount of turns user is given, 3 tokens per turn
        if (amountOfTokens < 3) {
            System.out.println("Not enough tokens to play! Enter three tokens to play");
            System.out.println("or visit the main desk to purchase more tokens");
        } else {

            System.out.println("You have enough tokens for " + amountOfTurns + " turns to spin!");
            System.out.println();

            //First spin
            System.out.println("Press S to spin the wheel, if you do not want to play, press E to exit");
            choiceToExitOrSpin = input.next();
            System.out.println();

            //decides to spin or exit
            if (choiceToExitOrSpin.equals("S") || choiceToExitOrSpin.equals("s")) {

                //WHILE USER CHOOSES TO SPIN AND HAS TURNS
                while (amountOfTurns > 0 & (choiceToExitOrSpin.equals("S") || choiceToExitOrSpin.equals("s"))) {

                    firstRoll = (int) (Math.random() * 4 + 1);
                    secondRoll = (int) (Math.random() * 4 + 1);
                    thirdRoll = (int) (Math.random() * 4 + 1);
                    System.out.println(decimal.format(firstRoll) + " " + decimal.format(secondRoll) + " " + decimal.format(thirdRoll));

                    System.out.println();

                    if (firstRoll != secondRoll || firstRoll != thirdRoll || secondRoll != thirdRoll) {

                        System.out.println("You did not win, don't worry, you are about to win big, I can feel it");
                    } else {

                        if (firstRoll == 1) {
                            amountOfTokens = amountOfTokens + 4;
                            System.out.println("YOU WON! PRIZE: 4 Tokens! Would you like to test your luck?");
                            System.out.println("You now have " + (amountOfTokens - 3) + " tokens to cash out");

                        } else if (firstRoll == 2) {
                            amountOfTokens = amountOfTokens + 6;
                            System.out.println("YOU WON! PRIZE: 6 Tokens! Would you like to test your luck?");
                            System.out.println("You now have " + (amountOfTokens - 3) + " tokens to cash out");
                        } else if (firstRoll == 3) {
                            amountOfTokens = amountOfTokens + 8;
                            System.out.println("YOU WON! PRIZE: 8 Tokens! Would you like to test your luck?");
                            System.out.println("You now have " + (amountOfTokens - 3) + " tokens to cash out");
                        } else if (firstRoll == 4) {
                            amountOfTokens = amountOfTokens + 10;
                            System.out.println("YOU WON! PRIZE: 10 Tokens! Would you like to test your luck?");
                            System.out.println("You now have " + (amountOfTokens - 3) + " tokens to cash out");

                        }

                    }
                    amountOfTurns = amountOfTokens / 3;
                    amountOfTurns = amountOfTurns - 1;

                    System.out.println("Would you like to play again? you have " + amountOfTurns + " turns left");
                    System.out.println();
                    System.out.println("Press S to spin the wheel, if you do not want to play, press E to exit");
                    choiceToExitOrSpin = input.next();
                    amountOfTokens = amountOfTokens - 3;
                    amountOfTurns = amountOfTurns - 1;
                    System.out.println();
                    if (choiceToExitOrSpin.equals("e") || choiceToExitOrSpin.equals("E")) {
                        System.out.println("Thanks for playing! Please come again!");
                        System.out.println("You have cashed out with " + (amountOfTurns * 3) + " tokens");
                    }

                    System.out.println();

                    System.out.println();

                    System.out.println();

                }
            } else if (choiceToExitOrSpin.equals("e") || choiceToExitOrSpin.equals("E")) {
                System.out.println("Thanks for playing! Please come again!");
                System.out.println("You have cashed out with " + (amountOfTurns * 3) + " tokens");
            } else {
                System.out.println("Invalid Option");
            }
        }
    }
}
