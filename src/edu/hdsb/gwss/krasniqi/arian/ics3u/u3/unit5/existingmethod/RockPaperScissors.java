/* Name: Rock Paper Scissors
 * Version: v0.4
 * Date: April 24 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        userInfoAndStartGame();
    }

    public static void userInfoAndStartGame() {

        //Variables
        int userChoiceToPlay;
        int userChoice = 1;
        int tie = 0;
        int loss = 0;
        int win = 0;
        int randomComputerDraw = 0;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //USER INFO
        System.out.println("Rock Paper Scissors");
        System.out.println();
        System.out.println("This program allows you to play a game of Rock, Paper, Scissors with a computer!");
        System.out.println("You will have the option of choosing rock, paper or scissors");
        System.out.println("Your wins, losses and ties will be recorded, best 3/5 wins! Good luck!");
        System.out.println();

        //choosing to paly game or not
        System.out.println("Press 1 to Play, Press 2 to Exit");
        userChoiceToPlay = input.nextInt();

        //error check and start game
        if (userChoiceToPlay == 1) {
            userChoice = userInput();
            randomComputerDraw = computerGenerator();
            checkForWinOrLoss(randomComputerDraw, userChoice, userChoiceToPlay, tie, win, loss);
        } else {
            System.out.println("Thank you for Playing!");
        }
    }

    public static int userInput() {
        //user input
        Scanner input = new Scanner(System.in);
        int userChoice;
        System.out.println("Enter your choice: 1 for Rock, 2 for Scissors or 3 for Paper");
        userChoice = input.nextInt();

        //user variable elsewhere
        return userChoice;
    }

    public static int checkForWinOrLoss(int randomComputerDraw, int userChoice, int userChoiceToPlay, int tie, int win, int loss) {

        Scanner input = new Scanner(System.in);

        // loop to repeat game
        while (userChoiceToPlay == 1) {

            //win loss or tie checks
            if (randomComputerDraw == userChoice) {
                if (randomComputerDraw == 1) {
                    System.out.println("You and the computer have both drawn Rock");
                    System.out.println("Tie!");
                } else if (randomComputerDraw == 2) {
                    System.out.println("You and the computer have both drawn Scissors");
                    System.out.println("Tie!");
                } else if (randomComputerDraw == 3) {
                    System.out.println("You and the computer have both drawn Paper!");
                    System.out.println("Tie!");
                }
                tie++;
            } else if (randomComputerDraw == 1 && userChoice == 2) {
                System.out.println("The computers Rock breaks Your Scissors!");
                System.out.println("Loss!");
                loss++;

            } else if (randomComputerDraw == 1 && userChoice == 3) {
                System.out.println("Your Paper covers the Computer's Rock!");
                System.out.println("Win!");
                win++;

            } else if (randomComputerDraw == 2 && userChoice == 1) {
                System.out.println("Your Rock breaks the Computers Scissors!");
                System.out.println("Win!");
                win++;

            } else if (randomComputerDraw == 2 && userChoice == 3) {
                System.out.println("The computers Scissors cut through Your Paper!");
                System.out.println("Loss!");
                loss++;

            } else if (randomComputerDraw == 3 && userChoice == 1) {
                System.out.println("The computers Paper covers Your Rock!");
                System.out.println("Loss!");
                loss++;

            } else if (randomComputerDraw == 3 && userChoice == 2) {
                System.out.println("Your Scissors cut through the Computers Paper!");
                System.out.println("Win!");
                win++;

            }

            //win loss chart
            System.out.println("Wins: " + win + " | Losses: " + loss + " | Ties: " + tie);

            System.out.println();

            //restart of loop/game or exit
            System.out.println("Press 1 to play again, Press 2 to exit or Press 3 to start a new game");

            userChoiceToPlay = input.nextInt();

            //if statements to restart exit or play again
            if (userChoiceToPlay == 1) {
                userChoice = userInput();
                randomComputerDraw = computerGenerator();
            } else if (userChoiceToPlay == 3) {
                userInfoAndStartGame();
            } else {
                System.out.println("Thanks for playing!");
            }

        }

        return userChoiceToPlay;
    }

    public static int computerGenerator() {

        // computer generated move
        int randomComputerDraw = (int) (Math.random() * 3) + 1;
        return randomComputerDraw;
    }
}
