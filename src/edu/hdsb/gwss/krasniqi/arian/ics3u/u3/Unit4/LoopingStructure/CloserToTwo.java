/*Project: closer to two
 *Date: Aprile 5 2015
 *Version: v0.3
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

import java.text.NumberFormat;

public class CloserToTwo {

    public static void main(String[] args) {
        // TODO code application logic here

        //VARIABLES
        double denominator = 2;
        double count = 1;
        double denom = 1;
        double first = 1;

        //OBJECTS
        NumberFormat decimal = NumberFormat.getNumberInstance();

        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(0);

        //program title
        System.out.println("Closer to Two");
        System.out.println();

        //USER INFO
        System.out.println("This program demonstrates that the result of adding numbers 1"
                + ", 1/2, 1/4, 1/8, 1/16... and so on will get closer to the number 2"
                + " without becoming 2. ");

        System.out.println();

        //WHILE STATEMENT
        while (count < 2) {

            System.out.println(count - first + " + 1/" + decimal.format(denom) + "   =  " + (count));
            first = first / 2;
            count = count + (count / denominator);
            denominator = denominator + denominator + 2;
            denom = denom + denom;

        }

        System.out.println("Your calculations have reached the number 2");
    }

}
