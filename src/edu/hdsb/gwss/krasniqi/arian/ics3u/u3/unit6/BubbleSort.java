package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;

public class BubbleSort {

    public static void main(String[] args) {
        // TODO code application logic here

        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 1000) + 1;

        }

        ArrayUtil.displayArray(numbers);

        ArrayUtil.bubbleSortDescending(numbers);
        ArrayUtil.displayArray(numbers);

    }

}
