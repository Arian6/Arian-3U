/* Name: Selection sort 2
 * Version: v0.2
 * Date: May 10 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;
import java.util.Scanner;

public class SelectionSort2 {

    public static void main(String[] args) {
 

        int numbers[] = new int[10];
        int guess = 60;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 1000) + 1;

        }

        ArrayUtil.displayArray(numbers);

        System.out.println("Please enter the number you are searching for: ");
        guess = input.nextInt();

        ArrayUtil.linearSearch(numbers, guess);

        ArrayUtil.selectionSortComparisonAndSwapCounter(numbers);
        ArrayUtil.displayArray(numbers);

        System.out.println("Please enter the number you are searching for: ");
        guess = input.nextInt();

        ArrayUtil.binarySearch(numbers, guess);

    }

}
