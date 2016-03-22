/* Name: bubble sort 2
 * Version: v0.1
 * Date: May 10 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;
import java.util.Scanner;

public class BubbleSort2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int guess;

        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 1000) + 1;

        }
        ArrayUtil.displayArray(numbers);

        System.out.println("Please enter the number you are searching for: ");
        guess = input.nextInt();

        ArrayUtil.linearSearch(numbers, guess);

        ArrayUtil.bubbleSortComparisonAndSwapCounter(numbers);

        ArrayUtil.displayArray(numbers);

        System.out.println("Please enter the number you are searching for: ");
        guess = input.nextInt();

        ArrayUtil.binarySearch(numbers, guess);

    }

}
