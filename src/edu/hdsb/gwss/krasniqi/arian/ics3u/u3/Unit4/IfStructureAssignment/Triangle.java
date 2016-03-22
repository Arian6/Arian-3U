/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.IfStructureAssignment;

import java.util.Scanner;

/**Name: Body mass index Date: March 26 2015 Version: v0.2 Author: Arian
 *
 * @author ARIAN
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OBJECTS
        Scanner input = new Scanner(System.in);

        //VARIABLES
        double sideone;
        double sidetwo;
        double sidethree;
        double tempa;
        double tempb;

        //introduces the program
        
        System.out.println("This program will determine if the side you enter will form a triangle");
        
        //COLLECTS SIDE 1
        System.out.println("Enter length of side 1:");

        sideone = input.nextDouble();

        //COLLECTS SIDE 2
        System.out.println("Enter length of side 2:");

        sidetwo = input.nextDouble();

        //COLLECTS SIDE 3
        System.out.println("Enter length of side 3:");

        sidethree = input.nextDouble();

        // DETERMINES WHICH SIDE IS LARGEST
        if (sideone > sidetwo) {
            tempa = sidetwo;
            sidetwo = sideone;
            sideone = tempa;
        }
        else if (sidetwo > sidethree) {
            tempb = sidethree;
            sidethree = sidetwo;
            sidetwo = tempb;
        }
        
        // determines whether the sides will form a triangle
        if (sidethree > (sidetwo + sideone)) {
            System.out.println("These sides will not make a right triangle");
        } else if (sidethree <= (sidetwo + sideone)) {
            System.out.println("These sides WILL make a right triangle");
        }

    }
}
