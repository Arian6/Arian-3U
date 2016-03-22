/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Objects
        Scanner input = new Scanner(System.in);

        int birthyear;
        System.out.println("Please enter your birth year");

        birthyear = input.nextInt();

        int currentyear;

        System.out.println("Please enter the current year");

        currentyear = input.nextInt();

        if (birthyear > currentyear) {

            int bigbirth = 100 - birthyear;

            int finalbigbirth = bigbirth + currentyear;

            System.out.println("You are " + finalbigbirth + " years old");

        } else {
            int userage = currentyear - birthyear;
            System.out.println("You are " + userage + " years old");
        }

    }

}
