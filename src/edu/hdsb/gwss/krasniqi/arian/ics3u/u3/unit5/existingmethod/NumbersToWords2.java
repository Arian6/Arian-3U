/* Name: NumbersToWords
 * Version: v0.3
 * Date: April 24 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

public class NumbersToWords2 {

    public static String number;

    public static void main(String[] args) {

        userInfo();
        inputNumberBetween1And999();

    }

    public static void userInfo() {
        //user info
        System.out.println("Number To Words");
        System.out.println();
        System.out.println("this program will convert any number from 1 to 999 to its word representation.");
        System.out.println();
    }

    public static void inputNumberBetween1And999() {

        //gather number
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number:");
        number = input.nextLine();

        //valid checks
        int checkForTeens = Integer.parseInt(number.substring(number.length() - 1));
        int integerVersionOfNumber = Integer.parseInt(number);

        if (integerVersionOfNumber > 0 && integerVersionOfNumber < 1000) {
            determineOutput(integerVersionOfNumber, checkForTeens);
        } else {
            System.out.println("Invalid Number. Be sure to enter in a number between 1 and 999.");
        }

    }

    public static void determineOutput(int integerVersionOfNumber, int checkForTeens) {

        //number values checks for tens, ones, hundreds
        if (integerVersionOfNumber > 0 && integerVersionOfNumber < 10) {
            ones();
        } else if (integerVersionOfNumber > 9 && integerVersionOfNumber < 20) {
            System.out.print("Your number is:");
            specialCaseTeens();

        } else if (integerVersionOfNumber > 19 && integerVersionOfNumber < 100) {
            System.out.print("Your number is:");
            tens();
            ones();
        } else if (integerVersionOfNumber > 99 && integerVersionOfNumber < 1000) {

            if (checkForTeens > 9 && checkForTeens < 20) {
                System.out.print("Your number is:");
                hundreds();
                specialCaseTeens();
            } else if (checkForTeens < 10 || checkForTeens > 19) {
                System.out.print("Your number is:");
                hundreds();
                tens();
                ones();
            }
        }
    }

    public static void ones() {

        //variable
        String numberValuePosition = number.substring(number.length() - 1);

        //ones switch case
        switch (numberValuePosition) {
            case "1":
                System.out.print(" One");
                break;
            case "2":
                System.out.print(" Two");
                break;
            case "3":
                System.out.print(" Three");
                break;
            case "4":
                System.out.print(" Four");
                break;
            case "5":
                System.out.print(" Five");
                break;
            case "6":
                System.out.print(" Six");
                break;
            case "7":
                System.out.print(" Seven");
                break;
            case "8":
                System.out.print(" Eight");
                break;
            case "9":
                System.out.print(" Nine");
                break;
        }

    }

    public static void tens() {

        //tens switch case
        //variable
        String numberValuePosition = number.substring(number.length() - 2, number.length() - 1);

        switch (numberValuePosition) {

            case "2":
                System.out.print(" Twenty");
                break;
            case "3":
                System.out.print(" Thirty");
                break;
            case "4":
                System.out.print(" Fourty");
                break;
            case "5":
                System.out.print(" Fifty");
                break;
            case "6":
                System.out.print(" Sixty");
                break;
            case "7":
                System.out.print(" Seventy");
                break;
            case "8":
                System.out.print(" Eighty");
                break;
            case "9":
                System.out.print(" Ninety");
                break;
        }
    }

    public static void hundreds() {

        //variable
        String numberValuePosition = number.substring(number.length() - 3, number.length() - 2);

        switch (numberValuePosition) {
            case "1":
                System.out.print(" One Hundred");
                break;
            case "2":
                System.out.print(" Two Hundred");
                break;
            case "3":
                System.out.print(" Three Hundred");
                break;
            case "4":
                System.out.print(" Four Hundred");
                break;
            case "5":
                System.out.print(" Five Hundred");
                break;
            case "6":
                System.out.print(" Six Hundred");
                break;
            case "7":
                System.out.print(" Seven Hundred");
                break;
            case "8":
                System.out.print(" Eight Hundred");
                break;
            case "9":
                System.out.print(" Nine Hundred");
                break;
        }
    }

    public static void specialCaseTeens() {

        String numberValuePosition = number.substring(number.length() - 2);

        switch (numberValuePosition) {
            case "10":
                System.out.print(" Ten");
                break;
            case "11":
                System.out.print(" Eleven");
                break;
            case "12":
                System.out.print(" Twelve");
                break;
            case "13":
                System.out.print(" Thirteen");
                break;
            case "14":
                System.out.print(" Fourteen");
                break;
            case "15":
                System.out.print(" Fifteen");
                break;
            case "16":
                System.out.print(" Sixteen");
                break;
            case "17":
                System.out.print(" Seventeen");
                break;
            case "18":
                System.out.print(" Eighteen");
                break;
            case "19":
                System.out.print(" Nineteen");
                break;

        }

    }
}
