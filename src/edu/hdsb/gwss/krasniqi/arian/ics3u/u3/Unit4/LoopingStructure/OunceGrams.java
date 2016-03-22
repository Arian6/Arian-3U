/*Project: Ounce and Grams
 *Date: Aprile 5 2015
 *Version: v0.3
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

import java.text.NumberFormat;

/*Project: Ounce and Grams
 *Date: Aprile 5 2015
 *Version: v0.3
 *Author: Arian Krasniqi
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application  logic here

        //VARIABLES
        int ounce;

        //OBJECTS
        NumberFormat decimal = NumberFormat.getNumberInstance();

        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);

        //USER INFO
        System.out.println("Ounce to Grams Conversion Chart");
        System.out.println();

        System.out.println("This program will print out table used");
        System.out.println("to convert ounces to grams, for up to 15 ounces");
        System.out.println("1 ounce = 28.35 grams)");

        System.out.println();

        //HEADERS
        System.out.format(" %-10s %10s", "Ounce", "Grams");

        //FOR LOOP
        for (ounce = 1; ounce <= 15; ounce++) {

            System.out.println();

            System.out.format(" %-10s %10s", ounce, decimal.format(ounce * 28.35));

        }
        System.out.println();

    }

}
