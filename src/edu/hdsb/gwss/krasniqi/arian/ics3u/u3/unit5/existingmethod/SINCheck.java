/* Name: SINCheck
 * Version: v0.4
 * Date: April 22 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

public class SINCheck {

    public static void main(String[] args) {

        //Variables
        int allOddNumbersAddedForCheck = 0;
        String SinNumberEntered;
        int allEvenNUmbersAddedForCheck = 0;
        double finalCheckAddition = allOddNumbersAddedForCheck + allEvenNUmbersAddedForCheck;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //User Info
        System.out.println("Social Insurance Number");
        System.out.println();

        System.out.println("In Canada, each person is uniquely identified by the Government with a Social Insurance Number (SIN).");
        System.out.println("A Social Insurance Number consists of nine digits. The first eight numbers are assigned digits and the");
        System.out.println("the last number is a digit check. This program determines if the check digit for a SIN is correct.");
        System.out.println();

        //collection of the sin number
        System.out.println("Please enter the Social Insurance Number:");
        SinNumberEntered = input.nextLine();

        //check to see if number entered is valid
        if (SinNumberEntered.length() == 9) {

            //odd number check loop
            for (int count2 = 0; count2 < SinNumberEntered.length() - 1; count2 = count2 + 2) {

                int oddDigit = Integer.parseInt(SinNumberEntered.substring(count2, count2 + 1));
                allOddNumbersAddedForCheck = allOddNumbersAddedForCheck + oddDigit;

            }
            //even number check loop
            for (int count2 = 1; count2 < SinNumberEntered.length() - 1; count2 = count2 + 2) {

                int evenDigit = Integer.parseInt(SinNumberEntered.substring(count2, count2 + 1)) * 2;
                allEvenNUmbersAddedForCheck = allEvenNUmbersAddedForCheck + (evenDigit % 10 + evenDigit / 10);

            }

            //check for last digit
            if (Integer.parseInt(SinNumberEntered.substring(8)) == (Math.ceil(finalCheckAddition / 10) * 10) - finalCheckAddition) {
                System.out.println("The check digit of this SIN number is correct");
            } //invalid check for last digit
            else {
                System.out.println("The check digit of this SIN number is incorrect");
            }
        } //invalid check for length of entered number
        else {
            System.out.println("Invalid SIN Number");
        }

    }

}
