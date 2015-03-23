package edu.hdsb.gwss.krasniqi.arian.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Discount assignment Version: 0.2
 *
 * @author 1krasniqiari
 */
public class Discount {

    public static void main(String[] args) {

        // CONSTANTS
        // VARIABLES
        int purchaseAmount;
        double discount;

        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // GET COST
        System.out.println("Enter the amount of items you have purchased:");
        purchaseAmount = input.nextInt();

        //Double variable
//        double discountc = (purchaseAmount * .1);
//        double discounta = (purchaseAmount - discountc);
        //If statement for ineligability
        if (purchaseAmount <= 10) {
            System.out.println("Not eligible for discount, Your total is    $" + purchaseAmount);
        } //Eligibal for discount
        else {
            discount = (purchaseAmount * .1);
            System.out.println("You are eligible for our 10% discount!");
            System.out.println("Your total is   " + money.format(purchaseAmount - discount));
        }

    }

}
