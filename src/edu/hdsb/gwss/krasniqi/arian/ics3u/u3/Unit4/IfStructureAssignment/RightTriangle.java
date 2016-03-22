/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.IfStructureAssignment;

import java.util.Scanner;

/**
 *Name: Body mass index Date: March 26 2015 Version: v0.2 Author: Arian
 * @author 1krasniqiari
 */
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //OBJETCS
        Scanner input = new Scanner(System.in);

        //variables
        double sideone;
        double sidetwo;
        double sidethree;
        double tempa;
        double tempb;
        
        //INFO FOR THE USER
        System.out.println("This program will use the pythagorean theorem to determine if "
                + "the side you enter can and will make a right angled triagnle");
        
        
        //CONFIRMS SIDE 1
        System.out.println("Enter length of side 1:");

        sideone = input.nextDouble();
        // CONFIRMS SIDE 2
        System.out.println("Enter length of side 2:");

        sidetwo = input.nextDouble();
        // CONFIRMS SIDE 3
        System.out.println("Enter length of side 3:");

        sidethree = input.nextDouble();

        if( sideone <= 0 || sidetwo <= 0 || sidethree <= 0 ) {
            // INVALID
        }
        else {
            // DETERMINES THE LARGEST SIDE
            if (sideone > sidetwo) {
                tempa = sidetwo;
                sidetwo = sideone;
                sideone = tempa;
            }
            if (sidetwo > sidethree) {
                tempb = sidethree;
                sidethree = sidetwo;
                sidetwo = tempb;
            }
            //DETERMINES WHETHER IT CAN MAKE A RIGHT TRIANGLE OR NOT
            if (sidethree * sidethree == sidetwo * sidetwo + sideone * sideone) {
                System.out.println("These sides WILL make a right triangle");

            } else {
                System.out.println("These sides WILL NOT make a right triangle");
            }

            }
    }
}
