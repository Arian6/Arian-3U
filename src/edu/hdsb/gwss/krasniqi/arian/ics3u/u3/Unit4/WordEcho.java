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
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        String hello;
        int counter = 0;

        System.out.println("Enter a word:");

        hello = input.next();

        while (counter < hello.length()) {
            System.out.print(hello + "\t");
            counter++;
        }

    }

}
