package edu.hdsb.gwss.krasniqi.arian.ics3u.u3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1krasniqiari
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
        int amountofp;
        
            System.out.println("Enter the amount");
        
   amountofp = input.nextInt();
   
   double discountc = (amountofp * .1);
   double discounta = (amountofp - discountc);
    if (amountofp <= 9) {
    System.out.println( "Not eligible for discount, Your total is   $" + amountofp);
    }
    
    else {
    System.out.println("You are eligible for our 10% discount!");
    System.out.println("Your total is   $" + discounta);
            }
        
        
        
        
        
        
    }
    
}
