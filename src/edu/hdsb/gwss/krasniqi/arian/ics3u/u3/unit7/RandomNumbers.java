/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.File;

import java.io.PrintWriter;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws Exception {

        File file = new File("ok.txt");

        PrintWriter output = new PrintWriter("the-file-name.txt");

        output.write("The first line");

        Scanner input = new Scanner(file);

        while (input.hasNext()) {

            System.out.println(input.nextLine());
        }
    }
}
