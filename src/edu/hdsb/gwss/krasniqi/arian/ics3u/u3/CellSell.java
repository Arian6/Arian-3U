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
 * @author ARIAN
 */
public class CellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //variables
        int daytime;
        int evening;
        int weekend;

        //double variables
        double daycost;
        double evecost;
        double weekendcost;

        //plan b costs
        double daycostb;
        double evecostb;
        double weekendcostb;

        //final doubles
        double plana;
        double planb;

        //Code
        System.out.println("Number of daytime minutes?");

        daytime = input.nextInt();

        System.out.println("Number of evening minutes?");

        evening = input.nextInt();

        System.out.println("Number of weekend minutes?");

        weekend = input.nextInt();

        // Double
        //plan a
        daycost = (daytime * .25);
        evecost = evening * .15;
        weekendcost = weekend * .20;

        plana = daycost + evecost + weekendcost;
        
        if (daytime >= 100) {
            System.out.println("Plan A costs    " + money.format(plana - 25));
        }
        else {
        System.out.println("Plan A costs    " + money.format(plana - daycost));
        }
        // plan b
        daycostb = (daytime * .45);
        evecostb = evening * .35;
        weekendcostb = weekend * .25;

        planb = daycostb + evecostb + weekendcostb;

        if (daytime >= 250) {
            System.out.println("Plan B costs    " + money.format(planb - 112.5));
        } else  {
            System.out.println("Plan B costs    " + money.format(planb - daycostb));
        }

        //if statements
        if (plana < planb) {
            System.out.println("Plan A is the cheapest");
        }
        else if (plana > planb) {
            System.out.println("Plan B is the cheapest");
        } else if (plana == planb) {
            System.out.println("Both plans will cost the same");
        }

    }

}
