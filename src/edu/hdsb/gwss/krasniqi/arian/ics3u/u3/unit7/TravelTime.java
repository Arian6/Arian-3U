/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1krasniqiari
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(new File("data1.txt"));

        int flightTime;

        while (input.hasNext()) {
            StringTokenizer lineOfData = new StringTokenizer(input.nextLine(), " ");

            while (lineOfData.hasMoreTokens()) {

            }

        }
    }
}
