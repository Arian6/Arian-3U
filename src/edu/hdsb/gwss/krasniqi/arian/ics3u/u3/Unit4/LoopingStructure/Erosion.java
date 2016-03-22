/*Project: Erosion
 *Date: April 5 2015
 *Version: v0.2
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

import java.text.NumberFormat;

public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variables
        double currentTopsoilLevel = 30;
        double amountOfPassingYears = 0;
        double naturalSoilAddition = ((currentTopsoilLevel / 500) + 2.5);
        //objects
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(0);

        //program title
        System.out.println("Topsoil Erosion");
        System.out.println();

        System.out.println("Careless land management causes approximately 1 percent");
        System.out.println("of the topsoil to erode each year. It is then lost forever,");
        System.out.println("since it takes nature approximately 500 years to produce 2.5 cm of topsoil. ");
        System.out.println("At 9 cm the topsoil is so shallow that crops cannot be grown on a large scale. ");
        System.out.println("If Canada has about 30 cm of topsoil, how many years will it take for the depth ");
        System.out.println("to be reduced to 9 cm?");
        System.out.println();

        while (currentTopsoilLevel >= 9) {

            currentTopsoilLevel = currentTopsoilLevel - (currentTopsoilLevel * 0.01);

            amountOfPassingYears++;
            
            

            if (amountOfPassingYears >= 500) {
                currentTopsoilLevel = currentTopsoilLevel + naturalSoilAddition;
            }

        }
        System.out.println("It will take " + decimal.format(amountOfPassingYears) + " years for the topsoil in canada"
                + " to erode to a depth so low that crops will not grow");

    }

}
