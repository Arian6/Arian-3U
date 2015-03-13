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
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
        int amountbolts;
       
        System.out.println("Enter the amount of bolts you wish to purchase:");
            
            amountbolts = input.nextInt();
            
        int amountnuts;
        
         
        System.out.println("Enter the amount of nuts you wish to purchase:");
        
            amountnuts = input.nextInt();
            
        int amountwashers;
        
            System.out.println("Enter the amount of washers you wish to purchase:");
            
           amountwashers = input.nextInt();
   //Variable     
   amountbolts = input.nextInt();
   
    System.out.println("Number of bolts:        "  +  amountbolts);
        
        
        
        
        
    }
    
}
