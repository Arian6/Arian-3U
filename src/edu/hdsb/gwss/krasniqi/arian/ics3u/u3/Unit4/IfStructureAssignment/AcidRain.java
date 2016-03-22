/*
 * Name:
 * Date:
 * ....
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.IfStructureAssignment;

import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class AcidRain {

    /**
     * Name: Body mass index Date: March 26 2015 Version: v0.2 Author: Arian
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //VARIABLES
        double phLevel;

        //INTRODUCES CODE TO USER
        System.out.println("Acid Rain");

        System.out.println("Acid rain is an environmental problem. this program"
                + "determines if the pH level in the water is safe for the fish. ");

        // CONFIRMS PH LEVEL
        System.out.println("Please enter you pH level");

        phLevel = input.nextInt();

        //DETERMINES ACIDITY
        if (phLevel < 0 || phLevel > 14) {
            System.out.println("Invalid pH Level");
        } else if (phLevel < 6.5) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (phLevel > 7.5) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        }
    }

}
