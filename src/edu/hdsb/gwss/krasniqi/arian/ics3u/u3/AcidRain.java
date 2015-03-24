/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Acid Rain");

        System.out.println("Acid rain is an environmental problem. this program"
                + "determines if the pH level in the water is safe for the fish. ");
        double phlevel;
        System.out.println("Please enter you pH level");

        phlevel = input.nextInt();

        if (phlevel <= 6.5) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (phlevel >= 7.5) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (phlevel <= 7.4 && phlevel >= 6.4){
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");

        }

    }

}
