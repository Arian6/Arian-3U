/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4;

import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class Length30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        String wordone = "";
        String wordtwo = "";
        int thirty = 30;
        
        
        System.out.println("Please enter a word");
        
        wordone = input.next();
        
        System.out.println("Please enter another word");
        
        wordtwo = input.next();
        int dots = 30 - (wordone.length() + wordtwo.length());
        
        System.out.print(wordone);
       for( int dot = 1; dot <= dots; dot++) {
           System.out.print(".");
       }
        System.out.print(wordtwo);
    }
    
}
