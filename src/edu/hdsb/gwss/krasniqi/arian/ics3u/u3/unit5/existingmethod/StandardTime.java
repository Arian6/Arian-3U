/* Name: Time Converter
 * Version: v0.7
 * Date: April 24 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit5.existingmethod;

import java.util.Scanner;

public class StandardTime {

    public static void main(String[] args) {
        userInfoAndCollectTime();

    }

    public static void userInfoAndCollectTime() {

        //Variables
        String time;
        int choice;

        //ONBJECTS
        Scanner input = new Scanner(System.in);

        //user INfo
        System.out.println("Time Converter");
        System.out.println();
        System.out.println("This Program will convert times between Standard format and Traditional format.");
        System.out.println("You can choose whether to convert a Traditional time (hh:mm xx) into a Standard time (hh:mm)");
        System.out.println("or to convert a Standard time (hh:mm) into a Traditional time (hh:mm xx)");
        System.out.println();

        //user option for which conversion
        System.out.println("Please press 1 for Traditional to Standard conversion or press 2 for Standard to Traditional");
        choice = input.nextInt();

        //error check, conversion type check
        if (choice == 1) {
            time = getTime(choice);
            convertToStandardFromTraditional(time);
        } else if (choice == 2) {

            time = getTime(choice);
            convertToTraditionalFromStandard(time);
        } else {
            System.out.println("Invalid Option");
        }

    }

    public static String getTime(int choice) {

        //variables
        String time = "";

        //Objects
        Scanner input = new Scanner(System.in);

        //Traditional or standard enter
        if (choice == 1) {
            System.out.println("Please Enter a time (hh:mm xx):");
            time = input.nextLine();
            return time;
        }
        if (choice == 2) {
            System.out.println("Please Enter a time (hh:mm):");
            time = input.nextLine();
            return time;
        }
        return time;
    }

    //standard time to traditional
    public static void convertToTraditionalFromStandard(String time) {
        //Variables
        int hourSection = Integer.parseInt(time.substring(0, time.indexOf(":")));
        int minuteSection = Integer.parseInt(time.substring(time.indexOf(":") + 1));

        //error and output checks
        if (minuteSection >= 0 && minuteSection < 60) {
            if (hourSection >= 1 && hourSection < 12) {
                System.out.println("Traditional Time: " + hourSection + ":" + minuteSection + " am");
            } else if (hourSection > 12 && hourSection < 24) {
                System.out.println("Traditional Time: " + (hourSection - 12) + ":" + minuteSection + " pm");
            } else if (hourSection == 12) {
                System.out.println("Traditional Time: " + time + " am");
            } else if (hourSection == 0) {
                if (minuteSection >= 0 && minuteSection < 10) {
                    System.out.println("Traditional Time: " + (hourSection + 12) + ":0" + minuteSection + " am");
                } else if (minuteSection > 9 && minuteSection < 60) {
                    System.out.println("Traditional Time: " + (hourSection + 12) + ":" + minuteSection + " am");
                }
            }
            if (hourSection == 24) {
                System.out.println("Invalid time");
            }
        } else {
            System.out.println("Invalid Time");
        }

    }

    //traditional to standard
    public static void convertToStandardFromTraditional(String time) {

        //Variables
        int hourSection = Integer.parseInt(time.substring(0, time.indexOf(":")));
        int minuteSection = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.indexOf(" ")));

        String timeOfDay = time.substring(time.indexOf(" ") + 1);
        timeOfDay = timeOfDay.toLowerCase();

        //error and output checks
        if (hourSection < 13 && hourSection > 0 && minuteSection >= 0 && minuteSection < 60 && (timeOfDay.equals("pm") || timeOfDay.equals("am")) && (time.length() == 8 || time.length() == 7)) {
            if (minuteSection >= 00 && minuteSection < 60 && hourSection < 10 && hourSection > 0) {
                switch (timeOfDay) {
                    case "am":
                        System.out.println("0" + hourSection + ":" + minuteSection);
                        break;
                    case "pm":
                        System.out.println(hourSection + 12 + ":" + minuteSection);
                        break;
                }
            }
            if (hourSection < 12 && hourSection > 9 && timeOfDay.equals("am")) {
                System.out.println(hourSection + ":" + minuteSection);
            } else if (hourSection < 12 && hourSection > 9 && timeOfDay.equals("pm")) {
                System.out.println(hourSection + 12 + ":" + minuteSection);
            } else if (hourSection == 12 && timeOfDay.equals("am")) {
                if (minuteSection < 10 && minuteSection >= 0) {
                    System.out.println("00:0" + minuteSection);
                } else {
                    System.out.println("00:" + minuteSection);
                }
            } else if (hourSection == 12 && timeOfDay.equals("pm")) {
                if (minuteSection < 10 && minuteSection >= 0) {
                    System.out.println(hourSection + ":0" + minuteSection);
                } else {
                    System.out.println(hourSection + ":" + minuteSection);
                }
            }
        } else {
            System.out.println("Invalid Time");
        }
    }
}
