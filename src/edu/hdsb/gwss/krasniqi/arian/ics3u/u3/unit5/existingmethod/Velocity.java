/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class Velocity {

    public static double velocity;
    public static double distance;
    public static double time;
    public static int choice;
    String km = "Km/h";
    
   
        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 for Kilometre calculation, Press 2 for Mile calculation");
        choice = input.nextInt();

        if (choice == 1) {
        kilometres();    
        
        } else if (choice == 2) {
            miles();
        } else {
            System.out.println("Invalid Option");
        }
    }

    public static void kilometres() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the total distance traveled in kilometres");
        distance = input.nextDouble();

        System.out.println("Please enter the total time it took to travel in hours");
        time = input.nextDouble();
        
        System.out.println();

        calculatingVelocity();
       

    }

    public static void miles() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the total distance traveled in Miles");
        distance = input.nextDouble();

        System.out.println("Please enter the total time it took to travel in hours");
        time = input.nextDouble();

        calculatingVelocity();
    }

    public static void calculatingVelocity() {
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(0);
    
        
        
        velocity = distance / time;

        System.out.println(decimal.format(velocity)+ "/h");

    }

}
