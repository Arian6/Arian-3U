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
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double numerator = 36;
        double denominator = 154;

        int counter = 2;
        int counter2 = 2;
        
        double check1 = denominator / counter;
        double check3 = Math.floor(denominator / counter);
        double check4 = numerator / counter;
        double check5 = Math.floor(numerator / counter);

        while (check1 != check3) {
            
            
            
           counter++;
           
           check1 = denominator / counter;
           check3 = Math.floor(denominator / counter);
           
            System.out.println(counter);
        }
        
         while (check4 != check5) {
            
            
            
           counter2++;
           check4 = numerator / counter2;
           check5 = Math.floor(numerator / counter2);
           System.out.println(counter);
           
        }
        System.out.println(numerator / counter + "  " + denominator / counter);
         
    }

}
