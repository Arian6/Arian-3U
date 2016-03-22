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
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int start;
        int end;

        System.out.println("Please enter the start value");
        start = input.nextInt();
        System.out.println("Please enter the end value");
        end = input.nextInt();

        

            for (start = start; start <= end; start++) {
                System.out.println(start);
            }

        

            for (start = start; start >= end; start = start - 1) {
                System.out.println(start);

            }
       
    }

}
