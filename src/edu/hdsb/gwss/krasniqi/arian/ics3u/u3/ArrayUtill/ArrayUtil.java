/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill;

/**
 *
 * @author 1krasniqiari
 */
public class ArrayUtil {

    public static int[] generatingArray(int arrayLength, int highestPossibleValue, int lowestPossibleValue) {

        int data[] = new int[arrayLength];

        for (int i = 0; i < data.length; i++) {

            data[i] = (int) (Math.random() * highestPossibleValue) + lowestPossibleValue;

        }
        return data;

    }

    public static int calculatingSum(int[] data) {

        int total = 0;

        for (int counter = 0; counter < data.length; counter++) {

            total = total + data[counter];

        }

        return total;

    }

    public static int calculatingMaximum(int[] data) {

        int max = Integer.MIN_VALUE;

        for (int counter = 0; counter < data.length; counter++) {

            if (data[counter] > max) {
                max = data[counter];
            }

        }
        return max;

    }

    public static int calculatingMinimum(int[] data) {

        int min = Integer.MAX_VALUE;
        for (int counter = 0; counter < data.length; counter++) {

            if (data[counter] < min) {
                min = data[counter];
            }

        }
        return min;

    }

    public static int calculatingAverage(int[] data) {

        int average = 0;

        for (int counter = 0; counter < data.length; counter++) {

            average = average + data[counter];

        }

        average = average / data.length;

        return average;

    }

    public static void displayArray(int[] data) {

        System.out.print("The array order is currently: ");
        for (int counter = 0; counter < data.length; counter++) {

            System.out.print(data[counter] + " ");

        }
        System.out.println();

    }

    public static void swap(int[] data, int i, int j) {
        int temporary;

        temporary = data[j];
        data[j] = data[i];
        data[i] = temporary;

    }

    public static void swapForDouble(double[] data, int i, int j) {
        double temporary;

        temporary = data[j];
        data[j] = data[i];
        data[i] = temporary;

    }

    public static void bubbleSort(int[] data) {

        for (int j = 0; j < data.length; j++) {

            for (int i = 0; i < data.length - j - 1; i++) {

                if (data[i] > data[i + 1]) {
                    ArrayUtil.swap(data, i, i + 1);

                }

            }

        }

    }

    public static void bubbleSortDescending(int[] data) {

        for (int j = 0; j < data.length; j++) {

            for (int i = 0; i < data.length - j - 1; i++) {

                if (data[i] < data[i + 1]) {
                    ArrayUtil.swap(data, i, i + 1);

                }

            }

        }

    }

    public static void bubbleSortComparisonAndSwapCounter(int[] data) {

        int swapCount = 0;
        int comparisonCount = 0;

        for (int j = 0; j < data.length; j++) {

            for (int i = 0; i < data.length - j - 1; i++) {

                if (data[i] > data[i + 1]) {
                    swapCount++;
                    ArrayUtil.swap(data, i, i + 1);

                }

                comparisonCount++;
            }

            comparisonCount++;
        }

        System.out.println("The number of swaps made: " + swapCount);
        System.out.println("The number of comparisons is: " + comparisonCount);

    }

    public static void selectionSort(int[] data) {

        int maxIndex = 0;

        for (int j = 0; j < data.length; j++) {
            maxIndex = 0;
            for (int i = 1; i < data.length - j; i++) {

                if (data[i] > data[maxIndex]) {
                    maxIndex = i;
                }

            }
            ArrayUtil.swap(data, maxIndex, data.length - 1 - j);

        }

    }

    public static void selectionSortForDouble(double[] data) {

        int maxIndex = 0;

        for (int j = 0; j < data.length; j++) {
            maxIndex = 0;
            for (int i = 1; i < data.length - j; i++) {

                if (data[i] > data[maxIndex]) {
                    maxIndex = i;
                }

            }
            ArrayUtil.swapForDouble(data, maxIndex, data.length - 1 - j);

        }
    }

    public static void selectionSortDescending(int[] data) {
        int maxIndex = 0;

        for (int j = 0; j < data.length; j++) {
            maxIndex = 0;
            for (int i = 1; i < data.length - j; i++) {

                if (data[i] < data[maxIndex]) {
                    maxIndex = i;
                }

            }
            ArrayUtil.swap(data, maxIndex, data.length - 1 - j);

        }

    }

    public static void selectionSortComparisonAndSwapCounter(int[] data) {

        int maxIndex = 0;
        int swapCount = 0;
        int comparisonCount = 0;

        for (int j = 0; j < data.length; j++) {
            maxIndex = 0;
            for (int i = 1; i < data.length - j; i++) {

                if (data[i] > data[maxIndex]) {
                    maxIndex = i;
                }
                comparisonCount++;
            }
            ArrayUtil.swap(data, maxIndex, data.length - 1 - j);
            swapCount++;
            comparisonCount++;
        }
        System.out.println("The number of Swaps made: " + swapCount);
        System.out.println("The number of Comparisons made: " + comparisonCount);

    }

    public static int linearSearchWithoutDisplay(int[] data, int guess) {

        int check = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == guess) {
                check = i;
                i = data.length;
            }
        }

        return check;
    }

    public static int linearSearch(int[] data, int guess) {

        int check = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] == guess) {

                System.out.println("Your required digit is in position " + i);
                System.out.println("Number of comparisons to find value: " + (i + 1));
                check = guess;

            }

        }
        if (check != guess) {
            System.out.println("The value you are searching for does not exist within this array");
        }

        return guess;
    }

    public static int linearSearchOrderedArray(int[] data, int guess) {

        int check = 0;
        for (int i = 0; i < data.length; i++) {

            while (data[i] < guess) {
                if (data[i] == guess) {
                    System.out.println("Your required digit is in position " + i);
                    check = guess;
                    i = data.length;
                }
            }

        }
        if (check != guess) {
            System.out.println("The value you are searching for does not exist within this array");
        }

        return guess;
    }

    public static int binarySearch(int[] data, int guess) {

        boolean found = false;

        int left = 0;
        int right = data.length - 1;
        int comparison = 0;
        int check = 0;

        while (found != true && right > left) {

            int mid = (left + right) / 2;

            if (data[mid] > guess) {
                right = mid - 1;

            } else if (data[mid] < guess) {
                left = mid + 1;

            } else {
                System.out.println("index of guess: " + mid);
                check = guess;
                found = true;

            }
            comparison++;

        }
        if (check == guess) {
            System.out.println("Number of Comparisons: " + comparison);
        }
        if (check != guess) {
            System.out.println("The value you are searching for does not exist within this array");
        }
        return guess;

    }

    public static int binarySearchWithoutDisplay(int[] data, int guess) {

        boolean found = false;

        int left = 0;
        int right = data.length - 1;
        int check = -1;

        while (found != true && right > left) {

            int mid = (left + right) / 2;

            if (data[mid] > guess) {
                right = mid - 1;

            } else if (data[mid] < guess) {
                left = mid + 1;

            } else if (data[mid] == guess) {
                check = mid;
                found = true;

            }

        }

        return check;
    }

    public static int binarySearchWithoutDisplayDescending(int[] data, int guess) {

        boolean found = false;

        int left = 0;
        int right = data.length - 1;
        int check = -1;

        while (found != true && right > left) {

            int mid = (left + right) / 2;

            if (data[mid] < guess) {
                right = mid - 1;

            } else if (data[mid] > guess) {
                left = mid + 1;

            } else if (data[mid] == guess) {
                check = mid;
                found = true;

            }

        }

        return check;

    }

    public static int[] selectionSortIndirectSorting(int[] data) {

        int maxIndex = 0;

        for (int j = 0; j < data.length; j++) {
            maxIndex = 0;
            for (int i = 1; i < data.length - j; i++) {

                if (data[i] > data[maxIndex]) {
                    maxIndex = i;
                }

            }
            ArrayUtil.swap(data, maxIndex, data.length - 1 - j);

        }

        return data;
    }

}
