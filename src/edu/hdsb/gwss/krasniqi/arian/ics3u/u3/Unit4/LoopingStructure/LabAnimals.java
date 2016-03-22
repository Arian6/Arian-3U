/*Project: Lab Animals
 *Date: Aprile 5 2015
 *Version: v0.5
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

import java.util.Scanner;

public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //VARIABLES
        int initialAmountOfAnimals;
        int initialAmountOfFood;
        int currentHour = 1;
        int addedFoodEveryHour;

        //OBJECTS
        Scanner input = new Scanner(System.in);

        //Title
        System.out.println("Lab Animals");
        System.out.println();

        //User Info
        System.out.println("In the Lab, there are currently (X) amount of animals");
        System.out.println("and (Y) amount of food. At the end of every hour, the ");
        System.out.println("amount of animals doubles, and a certain amount of food, (X), ");
        System.out.println("is added. Every hour the animals will only consume enough food");
        System.out.println("for themselves.");
        System.out.println();

        //Program info
        System.out.println("This program will determine how long before the "
                + " amount of food cannot support the amount of animals, using"
                + " the information you have entered");

        System.out.println();

        //inputs
        //amount of animal input
        System.out.println("Enter the intial amount of animals (X) :");
        initialAmountOfAnimals = input.nextInt();

        //Invalid info for animals
        if (initialAmountOfAnimals < 1) {
            System.out.println("Invalid amount of animals entered");
        } else {

            System.out.println();

            //amount of food input
            System.out.println("Enter the initial amount of food (Y) :");
            initialAmountOfFood = input.nextInt();

            //Invalid info for food
            if (initialAmountOfFood < 1) {
                System.out.println("Invalid amount of food entered");
            } else {
                System.out.println();

                //amount of added food input
                System.out.println("Enter the amount of food that will be entered after"
                        + " every hour :");
                addedFoodEveryHour = input.nextInt();

                //Invalid info for added food
                if (addedFoodEveryHour < 1) {
                    System.out.println("Invalid amount of food to be added entered");
                } else {
                    System.out.println();

                    //HEADERS FOR TABLE
                    System.out.format("%12s %6s %12s %12s %12s", "Hour |", "Animals at Start |", "Food at Start |", "Food at End |", "Animals at End |");

                    System.out.println();

                    //CONTROLS WHETHER ANIMALS IS GREATER THAN FOOD
                    while (initialAmountOfAnimals < initialAmountOfFood) {

                        System.out.format("%9s %13s %16s ", currentHour, initialAmountOfAnimals, initialAmountOfFood);
                        initialAmountOfFood = initialAmountOfFood - initialAmountOfAnimals + addedFoodEveryHour;
                        initialAmountOfAnimals = initialAmountOfAnimals * 2;

                        System.out.format("%15.5s %15s", initialAmountOfAnimals, initialAmountOfFood);

                        currentHour++;

                        System.out.println();
                    }
                    System.out.println();
                    //final outcome
                    System.out.println("The amount of animals has surpased the amount of food.");
                    System.out.println("To maintain growth, increase amount of food");
                }
            }
        }
    }

}
