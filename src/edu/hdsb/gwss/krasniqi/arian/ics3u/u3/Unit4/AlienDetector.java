/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class AlienDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //objects
        Scanner input = new Scanner(System.in);

        //Variables
        int antenna;
        int eyes;

        //Code
        System.out.println("How many antennas did the alien have?");

        antenna = input.nextInt();

        System.out.println("How many eyes did the alien have?");

        eyes = input.nextInt();

          // If statements
        if (antenna >= 3 & eyes <= 4) {
            System.out.println("The alien you saw could be the TroyMartian");
        }

        if (antenna <= 6 & eyes >= 2) {
            System.out.println("The alien you saw could be the VladSaturnian");
        }
        if (antenna >= 2 & eyes <= 3) {
            System.out.println("The alien you saw could be the GraemeMercurian");
        } else {
            System.out.println("Unidentified species");
        }

    }

}
