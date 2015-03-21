/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3;

import java.text.NumberFormat;
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
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //bolt variable
        int amountbolts;

        System.out.println("Enter the amount of bolts you wish to purchase:");

        amountbolts = input.nextInt();

        //nut variable
        int amountnuts;

        System.out.println("Enter the amount of nuts you wish to purchase:");

        amountnuts = input.nextInt();

        //Nut Check
        if (amountnuts < amountbolts) {
            System.out.println("Check the order, too few nuts");
        }
        if (amountnuts == amountbolts) {

        } else {
            System.out.println("Check the order, excess amount of nuts");
        }

        //Washer variable
        int amountwashers;

        System.out.println("Enter the amount of washers you wish to purchase:");

        amountwashers = input.nextInt();
           //washer check

     if (amountwashers < amountbolts * 2) {
            System.out.println("Check the order, too few washers");
        }
        if (amountwashers == amountbolts * 2) {

        } else { 
            System.out.println("Check the order, excess amount of washers");
        }
   //Variable     
        
        double boltprice = amountbolts * .05;
        double nutprice = amountnuts * .03;
        double washerprice = amountwashers * .01;
        double total = washerprice + nutprice + boltprice;
      
        
        System.out.println("Your total is       " + money.format(total));
    }

}
