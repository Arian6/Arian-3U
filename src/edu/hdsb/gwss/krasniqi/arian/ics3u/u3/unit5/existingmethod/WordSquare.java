/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word;
        Scanner input = new Scanner(System.in);

        System.out.println("Word Square");
        System.out.println();
        System.out.println("This program prints out a square using the letters of a word");
        
        System.out.println("Enter your word:");
        word = input.nextLine();

        for (int counter = 0; counter <= (word.length() - 1); counter++) {

            System.out.println(word.substring(1) + word.substring(0, 1));

            word = word.substring(1) + word.substring(0, 1);

        }

    }

}
