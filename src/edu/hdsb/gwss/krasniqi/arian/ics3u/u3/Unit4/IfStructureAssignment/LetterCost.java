/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.IfStructureAssignment;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *Name: Body mass index Date: March 26 2015 Version: v0.2 Author: Arian
 * @author ARIAN
 */
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //VARIABLES
        int mailclass;
        double mass = 1;
        double cost = 0;

        //Info for the user
        System.out.println("Cost of Mailing a Letter");

        System.out.println("This program will calculate the cost of mailing"
                + "a first or second class letter, depending on the mass"
                + "of the letter");

        //Mail class selection
        System.out.println("Enter Mailing Class (1 for First class, 2 for Second class)");

        mailclass = input.nextInt();

        //determines class
        switch (mailclass) {
            case 1:
            case 2:
                //mail class
                System.out.println("Enter the mass of the letter (in grams)");
                mass = input.nextDouble();
                break;
            default:
                System.out.println("Invalid Mail Class");

        }

// FIRST CLASS OPTION
        if (mailclass == 1) {

            // DETERMINES PRICES DEPENDING ON MASS
            if (mass <= 30) {
                cost = 0.4;

            } else if (mass <= 50) {
                cost = 0.6;

            } else if (mass <= 100) {
                cost = 0.8;

            } else if (mass > 100) {
                cost = (((mass - 100) / 50) * .29) + .80;

            } 
            // invalid comment
            else {
                System.out.println("Invalid mass");
            }
            //print cost
            System.out.println("The cost of sending your letter is  " + money.format(cost));

        }
// SECOND CLASS MAIL
        if (mailclass == 2) {

            // DETERMINES PRICES DEPENDING ON MASS
            if (mass <= 30) {
                cost = .3;

            } else if (mass <= 50) {
                cost = .5;

            } else if (mass <= 100) {
                cost = .6;

            } else if (mass > 100) {
                cost = (((mass - 100) / 50) * .19) + .60;

            }
            //invalid mass
            else {
                System.out.println("Invalid mass");
            }
            //prints cost
            System.out.println("The cost of sending your letter is  " + money.format(cost));
        }

    }
}
