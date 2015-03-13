package edu.hdsb.gwss.krasniqi.arian.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Discount assignment
 * Version: 0.2
 * @author 1krasniqiari
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        
        //Scanner Input
        Scanner input = new Scanner( System.in );
        int amountofp;
        
            System.out.println("Enter the amount of items you have purchased:");
   //Variable     
   amountofp = input.nextInt();
   
    //Double variable
   double discountc = (amountofp * .1);
   double discounta = (amountofp - discountc);
   
   //If statement for ineligability
    if (amountofp <= 9) {
    System.out.println( "Not eligible for discount, Your total is   $" + amountofp);
    }
   //Eligiblel for discount
    else {
    System.out.println("You are eligible for our 10% discount!");
    System.out.println("Your total is");
            }
    
       // Money (localized)
NumberFormat money = NumberFormat.getCurrencyInstance();
double dollars = discounta;
System.out.println( money.format( dollars ) );
        
        
        
        
        
        
    }
    
}
