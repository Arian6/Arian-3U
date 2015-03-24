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
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double sideone;
        double sidetwo;
        double sidethree;
        double tempa;
        double tempb;        
        
        System.out.println("Enter length of side 1:");
        
        sideone = input.nextInt();
        
        System.out.println("Enter length of side 2:");
        
        sidetwo = input.nextInt();
        
        System.out.println("Enter length of side 3:");
        
        sidethree = input.nextInt();
        
     if (sideone > sidetwo) {
        tempa = sideone;
        
     }
     if (sideone > sidethree){
        tempb = sideone;
     }
     
     
    }
    
    
}
        
        
        
        
        
        
        
        
        
        
    
    

