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
public class Compass {

    public static void main(String[] args) {
        // TODO code application logic here
        String compass;

        Scanner input = new Scanner(System.in);

        System.out.println("Compass Directions");
        System.out.println();

        System.out.println("Compass directions are written in the following form: S45W.");
        System.out.println("This indicates that the direction is determined by facing SOUTH and then turning 45 degrees towards the WEST.");
        System.out.println("This program has the user enter a compass direction and then prints a message.");

        System.out.println("Enter Direction:");
        compass = input.nextLine();
        String start = compass.substring(0, 1);
        String degree = compass.substring(1, 3);
        int degrees = Integer.valueOf(degree);
        String end = compass.substring(3);

        switch (start.toUpperCase()) {
            case "S":
                System.out.print("Start facing South ");
                break;
            case "E":
                System.out.print("Start facing East ");
                break;
            case "W":
                System.out.print("Start facing West ");
                break;
            case "N":
                System.out.print("Start facing North ");
                break;
        }

        System.out.print("Turn " + degrees + " degrees towards ");

        switch (end.toUpperCase()) {
            case "S":
                System.out.print("South");
                break;
            case "E":
                System.out.print("East");
                break;
            case "W":
                System.out.print("West");
                break;
            case "N":
                System.out.print("North");
                break;
        }

    }
}
