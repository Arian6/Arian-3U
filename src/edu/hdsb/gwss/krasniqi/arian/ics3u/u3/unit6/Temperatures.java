/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);

        String[] days
                = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};

        int[] temperature = new int[7];

        for (int count = 0; count < days.length; count++) {

            System.out.println("Please enter the temperature High on: " + days[count]);
            temperature[count] = input.nextInt();

        }

        for (int count = 0; count < temperature.length; count++) {
            System.out.println(days[count] + ":  " + temperature[count]);
        }

        int max = ArrayUtil.calculatingMaximum(temperature);
        int min = ArrayUtil.calculatingMinimum(temperature);
        double average = ArrayUtil.calculatingAverage(temperature);

        System.out.println("Your Average temperature this week was: " + decimal.format(average));
        System.out.println("Your Highest temperature this week was: " + max);
        System.out.println("Your Lowest temperature this week was: " + min);

    }

}
