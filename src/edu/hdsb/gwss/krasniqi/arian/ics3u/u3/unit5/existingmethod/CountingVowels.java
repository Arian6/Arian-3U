/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String sentence;
        int vowels = 0;
        char vowelSearch;
        
        System.out.println("Vowel Counter");
        System.out.println("This program will deermine the number of vowels in a sentence");
        
        System.out.print("Enter a sentence:");
        System.out.println();
        sentence = input.nextLine();
        sentence = sentence.toUpperCase();
        
        for (int counter = 0; counter < sentence.length(); counter++) {

            vowelSearch = sentence.charAt(counter);
            
            
            switch (vowelSearch) {
                case 'A':

                case 'E':

                case 'I':

                case 'O':

                case 'U':
                    vowels++;
                    break;
            }

        }

        System.out.println("The sentence entered has " + vowels + " vowels.");

    }
}
