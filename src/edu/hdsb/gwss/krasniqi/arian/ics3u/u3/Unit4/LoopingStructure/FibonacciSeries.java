/*Project: fibonacci
 *Date: Aprile 5 2015
 *Version: v0.3
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

/**
 *
 * @author ARIAN
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        int previousNumber = 1;
        int currentNumber = 0;
        int temporaryHolder = previousNumber + currentNumber;
        int sequenceCounter = 1;
        
        //User Info
        System.out.println("Fibonacci Series");
        System.out.println();

        System.out.println("This program will print the first twenty terms of the Fibonacci Series.");

        System.out.println();
      
        //while loop for sequence
        while (sequenceCounter <= 20) {
            sequenceCounter++;
            System.out.print(temporaryHolder + ", ");
            //switches values
            previousNumber = currentNumber;
            currentNumber = temporaryHolder;
            temporaryHolder = previousNumber + currentNumber;

        }
        //ending statement
        if (temporaryHolder == 6765) {
            System.out.print(temporaryHolder + ". ");
        }
        System.out.println();

        //conclusion
        System.out.println();

        System.out.println("Here are the first 20 terms of the Fibonacci Sequence.");
    }
}
