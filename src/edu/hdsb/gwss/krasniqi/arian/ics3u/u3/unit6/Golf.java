/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        int amount;

        //objects
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many holes you played");
        amount = input.nextInt();

        //variables
        String[] hole = new String[amount];
        int[] score = new int[amount];

        //Score Inputs
        for (int count = 0; count < hole.length; count++) {

            System.out.println("Please enter the score you got for hole: " + (count + 1));
            score[count] = input.nextInt();

        }
        // variables
        int max = ArrayUtil.calculatingMaximum(score);
        int min = ArrayUtil.calculatingMinimum(score);
        int total = ArrayUtil.calculatingSum(score);

        //display
        for (int count2 = 0; count2 < score.length; count2++) {

            System.out.println("On Hole " + (count2 + 1) + ":  You scored " + score[count2] + " points");

        }

        //Lowest, Total and maximum
        System.out.println("Your Total Score was: " + total);
        System.out.println("Your Highest Score was: " + max);
        System.out.println("Your Lowest Score was: " + min);
        
        

    }
}
