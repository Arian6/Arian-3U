/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

/**
 *
 * @author ARIAN
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        String palin = "radar";
        
        int count = palin.length();
        count = count - 1;
        while (count < palin.length()) {
        
        String wordcheck = palin.substring(count - 1);
       
        System.out.println(wordcheck);
            
        }
       
    }
    
}
