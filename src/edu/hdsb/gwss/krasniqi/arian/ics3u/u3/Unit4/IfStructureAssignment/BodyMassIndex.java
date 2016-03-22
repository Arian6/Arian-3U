/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.IfStructureAssignment;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Name: Body mass index Date: March 26 2015 Version: v0.2 Author: Arian
 * Krasniqi
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //OBJECT
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getNumberInstance(); 
        // VARIABLES
        double weight;
        double height;

        int choice;
        double bmi = -1;
        
        //decimal determiner
        decimal.setMinimumFractionDigits( 2 );
        decimal.setMaximumFractionDigits( 2 );
        
        
        //user info
        System.out.println("This program will determine your BMI (Body Mass Index) and classify"
                + "you under weight using metric or imperial units");
        
        
        // ASKS USER FOR METRIC OR IMPERIAL
        System.out.println("Type 1 for Metric (Kilograms & Metres) ");

        System.out.println("Type 2 for Imperial (Pounds & Inches)");

        choice = input.nextInt();

        //Metric
        if (choice == 1) {
            System.out.println("Please enter your weight in Kg:");
            weight = input.nextDouble();
            System.out.println("Please enter your height in metres:");
            height = input.nextDouble();

            // metric bmi calculator
            bmi = weight / (height * height);

            //imperial
           } else if (choice == 2) {
                System.out.println("Please enter your weight in Lbs:");
                weight = input.nextDouble();
                System.out.println("Please enter your height in inches:");
                height = input.nextDouble();

               // IMPERIAL CALCULATOR
                bmi = ((weight * 703) / (height * height));
           } else if (choice < 1 & choice > 2) {
                    System.out.println("Invalid option");
                }
                // DETERMINES BMI CLASS
            
            if (bmi < 0) {
                System.out.println("Invalid BMI");

                // INVALID
            } else if (bmi < 16) {
                System.out.println("Your BMI is under class: Starvation " + "BMI:" + (decimal.format(bmi)));
            } else if (bmi < 19.5) {
                System.out.println("Your BMI is under class: Underweight    " + "BMI:" + (decimal.format(bmi)));
            } else if (bmi < 25) {
                System.out.println("Your BMI is under class: Ideal  " + "BMI:" + (decimal.format(bmi)));
            } else if (bmi < 30) {
                System.out.println("Your BMI is under class: overweight " + "BMI:" + (decimal.format(bmi)));
            } else if (bmi < 40) {
                System.out.println("Your BMI is under class: obese  " + "BMI:" + (decimal.format(bmi)));
            } else if (bmi > 40) {
                System.out.println("Your BMI is under class: Morbidly Obese " + "BMI:" + (decimal.format(bmi)));
            }

        }
    }

