/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

/**
 *
 * @author ARIAN
 */
public class NumbersToWords {

    public static final int number = 67;
    public static final String convert = Integer.toString(number);
    public static int tens = Integer.valueOf(convert);
    public static int check = Integer.valueOf(convert.substring(0, 1));
    public static int check2 = Integer.valueOf(convert.substring(1));

    public static void main(String[] args) {
        // TODO code application logic here

        if (number >= 9 && number < 100) {
            if (Integer.valueOf(convert.substring(1)) == 0) {
                tenscheck();
            } else if (number > 10 && number < 20) {
                teens();
            } else {

                middlecheck();
            }
        } else {

            System.out.println("Invalid Number");
        }
    }

    public static void tenscheck() {

        switch (tens) {
            case 10:
                System.out.print("Ten");
                break;
            case 20:
                System.out.print("Twenty");
                break;
            case 30:
                System.out.print("Thirty");
                break;
            case 40:
                System.out.print("Four");
                break;
            case 50:
                System.out.print("Fifty");
                break;
            case 60:
                System.out.print("Sixty");
                break;
            case 70:
                System.out.print("Seventy");
                break;
            case 80:
                System.out.print("Eighty");
                break;
            case 90:
                System.out.print("Ninety");
                break;

        }
    }

    public static void teens() {

        switch (tens) {
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            case 13:
                System.out.print("Thirteen");
                break;
            case 14:
                System.out.print("Fourteen");
                break;
            case 15:
                System.out.print("Fifteen");
                break;
            case 16:
                System.out.print("Sicteen");
                break;
            case 17:
                System.out.print("Seventeen");
                break;
            case 18:
                System.out.print("Eighteen");
                break;
            case 19:
                System.out.print("Nineteen");
                break;
        }
    }

    public static void middlecheck() {

        switch (check) {
            case 2:
                System.out.print("Twenty");
                break;
            case 3:
                System.out.print("Thirty");
                break;
            case 4:
                System.out.print("Fourty");
                break;
            case 5:
                System.out.print("Fifty");
                break;
            case 6:
                System.out.print("Sixty");
                break;
            case 7:
                System.out.print("Seventy");
                break;
            case 8:
                System.out.print("Eighty");
                break;
            case 9:
                System.out.print("Ninety");
                break;

        }

        switch (check2) {
            case 1:
                System.out.print(" One");
                break;
            case 2:
                System.out.print(" Two");
                break;
            case 3:
                System.out.print(" Three");
                break;
            case 4:
                System.out.print(" Four");
                break;
            case 5:
                System.out.print(" Five");
                break;
            case 6:
                System.out.print(" Six");
                break;
            case 7:
                System.out.print(" Seven");
                break;
            case 8:
                System.out.print(" Eight");
                break;
            case 9:
                System.out.print(" Ninety");
                break;

        }
    }

}
