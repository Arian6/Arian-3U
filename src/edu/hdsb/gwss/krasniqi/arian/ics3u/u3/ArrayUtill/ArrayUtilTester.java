/* Name: Array Tester
 * Version: v0.10
 * Date: May 10 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill;

public class ArrayUtilTester {

    public static void main(String[] args) {

        testingArrayGenerator();
        testingSum();
        testingAverage();
        testingMaximum();
        testingMinimum();
        testingSwap();
        testingBubbleSort();
        testingBubbleSortDescending();
        testingSelectionSort();
        testingSelectionSortDescending();
        testingLinearSearch();
        testingBinarySearch();
    }

    public static void testingArrayGenerator() {

        //Variables
        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;
        int[] data = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        //Test, pre and post conditions
        System.out.println("Test 1: Array Generator");
        System.out.println("PRE:  No Array");
        System.out.println("POST: Generated Array with numbers in between user desired amount");

        //error check
        assert (data.length == 10);

        //forloop to check error
        for (int i = 0; i < data.length - 1; i++) {

            assert (data[i] != lowestPossibleValue || data[i] != highestPossibleValue);

        }

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");
    }

    public static void testingSum() {

        //Variables
        int testNumbers[] = {3, 6, 9, 12, 2, 6, 8};
        int sum = ArrayUtil.calculatingSum(testNumbers);

        //Test, pre and post conditions
        System.out.println("Test 2: Calculating Sum");
        System.out.println("PRE:  Unsorted Array with random values");
        System.out.println("POST: Sum of all values within array calculated");

        assert (sum == 46);

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingAverage() {

        //Variables
        int testNumbers[] = {6, 8, 9, 3, 4};
        int average = ArrayUtil.calculatingAverage(testNumbers);

        //Test, pre and post conditions
        System.out.println("Test 3: Calculating Average");
        System.out.println("PRE: Unsorted Array with random values");
        System.out.println("POST: Average of all values within the array calculated");

        assert (average == 6);

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingMaximum() {

        //Variables
        int testNumbers[] = {6, 3, 5, 7, 9, 1, 10, 6, 8};
        int max = ArrayUtil.calculatingMaximum(testNumbers);

        //Test, pre and post conditions
        System.out.println("Test 4: Calculating Maximum");
        System.out.println("PRE:  Unsorted Array with random values");
        System.out.println("POST: Highest value within array found");

        assert (max == 10);

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingMinimum() {

        //Variables
        int testNumbers[] = {6, 3, 5, 7, 9, 1, 10, 6, 8};
        int min = ArrayUtil.calculatingMinimum(testNumbers);

        //Test, pre and post conditions
        System.out.println("Test 5: Calculating Minimum");
        System.out.println("PRE: Unsorted Array with random values");
        System.out.println("POST: Lowest value within array found");

        assert (min == 1);

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingSwap() {

        //Variables
        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;
        int[] data = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        //Test, pre and post conditions
        System.out.println("Test 6: Swapping");
        System.out.println("PRE:  Random, unsorted generated array with values");
        System.out.println("POST: Selected value within array swaps positons with the another value in the array");

        int i = 0;

        data[i] = 4;
        data[i + 1] = 6;

        ArrayUtil.swap(data, i, i + 1);

        assert (data[i] == 6 && data[i + 1] == 4);

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingBubbleSort() {

        //Variables
        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;
        int[] data = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        //Test, pre and post conditions
        System.out.println("Test 7: Bubble Sorting");
        System.out.println("PRE Condition: Random generated array");
        System.out.println("POST Condition: Sorted array (numbers ascending)");

        ArrayUtil.bubbleSort(data);

        for (int i = 0; i < data.length - 1; i++) {

            assert (data[i] <= data[i + 1]);

        }

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingBubbleSortDescending() {

        //Variables
        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;
        int[] data = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        //Test, pre and post conditions
        System.out.println("Test 8: Bubble Sorting (Descending)");
        System.out.println("PRE Condition: Random generated array");
        System.out.println("POST Condition: Sorted array (numbers descending)");

        ArrayUtil.bubbleSortDescending(data);

        for (int i = 0; i < data.length - 1; i++) {

            assert (data[i] >= data[i + 1]);

        }

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingSelectionSort() {

        //Variables
        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;
        int[] data = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        //Test, pre and post conditions
        System.out.println("Test 9: Selection Sorting");
        System.out.println("PRE Condition: Random generated array");
        System.out.println("POST Condition: Sorted array (numbers ascending)");

        ArrayUtil.selectionSort(data);

        for (int i = 0; i < data.length - 1; i++) {

            assert (data[i] <= data[i + 1]);
        }

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingSelectionSortDescending() {

        //Variables
        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;
        int[] data = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        //Test, pre and post conditions
        System.out.println("Test 9: Selection Sorting");
        System.out.println("PRE Condition: Random generated array");
        System.out.println("POST Condition: Sorted array (numbers ascending)");

        ArrayUtil.selectionSortDescending(data);

        for (int i = 0; i < data.length - 1; i++) {

            assert (data[i] >= data[i + 1]);
        }

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingLinearSearch() {

        //Variables
        int[] data = {1, 3, 5, 2, 7, 8, 9};

        //Test, pre and post conditions
        System.out.println("Test 10: Linear Searching");
        System.out.println("PRE:   Random array with values");
        System.out.println("POST: Every value searched for, and positon found");

        for (int i = 0; i < data.length; i++) {

            int indexLocation = ArrayUtil.linearSearchWithoutDisplay(data, data[i]);

            assert (i == indexLocation);

        }

        assert (-1 == ArrayUtil.linearSearchWithoutDisplay(data, 10));
        assert (-1 == ArrayUtil.linearSearchWithoutDisplay(data, 0));

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }

    public static void testingBinarySearch() {

        //Variables
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] dataDescending = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        //Test, pre and post conditions
        System.out.println("Test 11: Binary Searching");
        System.out.println("PRE:  Ascending / Descending ordered array");
        System.out.println("POST: Position of value searched for found");

        for (int i = 0; i < data.length; i++) {

            int indexLocation = ArrayUtil.binarySearchWithoutDisplay(data, 8);
            assert (indexLocation == 7);

        }

        for (int i = 0; i < data.length; i++) {

            int indexLocation = ArrayUtil.binarySearchWithoutDisplayDescending(dataDescending, 2);
            assert (indexLocation == 7);

        }

        //results
        System.out.println();
        System.out.println("PASSED");
        System.out.println();
        System.out.println("-----------------------");

    }
}
