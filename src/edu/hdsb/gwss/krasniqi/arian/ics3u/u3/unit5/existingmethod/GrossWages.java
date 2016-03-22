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
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int hourly = 68;
        int hours = 15;
        int grossWage = hourly * hours;
        int extra = hourly - 40;
        
        if (hourly < 41) {
            System.out.println(grossWage);
        } else if (hourly > 40) {
            System.out.println((hours * 40) + (extra * (hours * 1.5)));
        }
        
        
    }
    
}
