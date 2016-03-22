/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class Mastermind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String computerGeneratedColourCode;
        String userGeneratedColourCode;

        //generate and recieve colours
        computerGeneratedColourCode = colourPatternCreator();
        userGeneratedColourCode = userColourCodeGuess();

        //error check
        if (userGeneratedColourCode.length() == 3) {

            checkColoursCorrect(computerGeneratedColourCode, userGeneratedColourCode);
            positioncheck(computerGeneratedColourCode, userGeneratedColourCode);
        } else {
            System.out.println("Invalid Guess");
        }
    }

    public static String userColourCodeGuess() {
        //Variables
        String userGeneratedColourCode;
        //Objects
        Scanner input = new Scanner(System.in);

        //user info
        System.out.println("Welcome to MasterMind!");
        System.out.println();
        System.out.println("This program will randomly select 3 differect colours");
        System.out.println("It can choose from 4 colours, R for red, B for blue, Y for yellow and G for green");
        System.out.println("You will get to guess what colours are chosen and the position they are in.");
        System.out.println("Are you up for the challenge?");
        System.out.println();

        //userGeneratedColourCode selection
        System.out.println("Enter The colours (R,G,B or Y) in the order you think is correct:");
        userGeneratedColourCode = input.nextLine();

        userGeneratedColourCode = userGeneratedColourCode.toUpperCase();

        return userGeneratedColourCode;
    }

    public static void checkColoursCorrect(String computerGeneratedColourCode, String userGeneratedColourCode) {

        //variables
        int correctionCheck = 0;

        //loops for colours
        for (int counterCheck = 0; counterCheck < computerGeneratedColourCode.length(); counterCheck++) {

            if (userGeneratedColourCode.charAt(counterCheck) == computerGeneratedColourCode.charAt(0)) {
                correctionCheck++;
            } else if (userGeneratedColourCode.charAt(counterCheck) == (computerGeneratedColourCode.charAt(1))) {
                correctionCheck++;
            } else if (userGeneratedColourCode.charAt(counterCheck) == (computerGeneratedColourCode.charAt(2))) {
                correctionCheck++;
            }
        }
        //error checks and restarts
        if (correctionCheck != 3) {
            System.out.println("Number of colours correct: " + correctionCheck);
        } else if (correctionCheck == 3) {
            System.out.println("Congradulations! you have the right colours!");
        }

    }

    public static void positioncheck(String computerGeneratedColourCode, String userGeneratedColourCode) {

        //variables
        int correctionCheck = 0;
        int userChoice;

        //objects
        Scanner input = new Scanner(System.in);

        //loop for positional check
        for (int counterCheck = 0; counterCheck < computerGeneratedColourCode.length(); counterCheck++) {

            if (userGeneratedColourCode.charAt(counterCheck) == computerGeneratedColourCode.charAt(counterCheck)) {
                correctionCheck++;
            }

        }
        //error and restart game checks
        if (correctionCheck != 3) {
            System.out.println("Number of colours in the correct position: " + correctionCheck);
            System.out.println();
            System.out.println("To take another guess press 1, to start a new game press 2 and to exit press 3");
            userChoice = input.nextInt();
            if (userChoice == 1) {
                userGeneratedColourCode = userColourCodeGuess();
                checkColoursCorrect(computerGeneratedColourCode, userGeneratedColourCode);
                positioncheck(computerGeneratedColourCode, userGeneratedColourCode);

            } else if (userChoice == 2) {
                computerGeneratedColourCode = colourPatternCreator();
                userGeneratedColourCode = userColourCodeGuess();

                checkColoursCorrect(computerGeneratedColourCode, userGeneratedColourCode);
                positioncheck(computerGeneratedColourCode, userGeneratedColourCode);
            } else if (userChoice == 3) {
                System.out.println("Thanks for Playing!");
            } else {
                System.out.println("Invalid Option");
            }
        } else if (correctionCheck == 3) {
            System.out.println("Congradulations! you have the right colour positions!");
        }

    }

    public static String colourPatternCreator() {
        //Variables
        String temp = "";
        String computerGeneratedColourCode = "";
        String temp2;

        //Generating computerGeneratedColourCodes
        for (int counterCheck = 0; counterCheck < 3; counterCheck++) {
            int number = (int) (Math.random() * 4) + 1;

            switch (number) {
                case 1:
                    temp = "R";
                    break;
                case 2:
                    temp = "G";
                    break;
                case 3:
                    temp = "B";
                    break;
                case 4:
                    temp = "Y";
                    break;

            }
            temp2 = temp;
            computerGeneratedColourCode = computerGeneratedColourCode + temp2;

        }

        return computerGeneratedColourCode;
    }
}
