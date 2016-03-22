/*Project: investing
 *Date: Aprile 5 2015
 *Version: v0.2
 *Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.Unit4.LoopingStructure;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class CompoundInvesting {

    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        int yearCounter;
        double annualInvestment;
        double initialInterestRate;
        double interestOfInvestment;
        double InvestmentPlusInterest = 1;
        int amountOfYears;

        //objects
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        //program title
        System.out.println("Compound Investing");

        System.out.println();
        //user info
        System.out.println("This program will print out a title table that will display the amount of"
                + " yearly investment over a period of up to 15 years");

        System.out.println();

        //input
        System.out.println("Enter the yearly investment :");
        annualInvestment = input.nextDouble();
        if (annualInvestment < 1) {
            System.out.println("Inavlid initial investment");
        } else {
            //temporary
            double temp = annualInvestment;

            System.out.println("Enter the interest rate (%) :");
            initialInterestRate = input.nextDouble();

            //invalid check
            if (initialInterestRate <= 100 & initialInterestRate >= 1) {
                System.out.println("Enter the number of years (up to 15) :");

                amountOfYears = input.nextInt();

                // invalid check
                if (amountOfYears >= 1 & amountOfYears <= 15) {
        // Output Table

                    //headers
                    System.out.format(" %-15s %15s %15s %15s", "Year", "Amount in Account", "Interest", "Total");

                    System.out.println();

                    //Number of years for loop
                    for (yearCounter = 1; yearCounter <= amountOfYears; yearCounter++) {
                        interestOfInvestment = ((initialInterestRate / 100) * annualInvestment);
                        InvestmentPlusInterest = annualInvestment + interestOfInvestment;
                        System.out.format(" %-15s %15s %15s %15s", yearCounter, money.format(annualInvestment), money.format(interestOfInvestment), money.format(InvestmentPlusInterest));
                        annualInvestment = InvestmentPlusInterest + temp;

                        //skips line between loops
                        System.out.println();

                    }
                    //conlusion
                    System.out.println();

                    System.out.println("You have reached the end of your investment plan.");
                    System.out.println("After " + (yearCounter - 1) + " years, you will have saved " + money.format(InvestmentPlusInterest));

                    // invalid entries
                } else {
                    System.out.println("Invalid amount of years");
                }
            } else {
                System.out.println("Invalid interest rate");
            }
        }
    }
}
