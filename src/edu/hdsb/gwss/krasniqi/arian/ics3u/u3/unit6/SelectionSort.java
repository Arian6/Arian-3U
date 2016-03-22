/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;

/**
 *
 * @author 1krasniqiari
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 1000) + 1;

        }

        ArrayUtil.displayArray(numbers);
        ArrayUtil.selectionSort(numbers);
        ArrayUtil.displayArray(numbers);

    }

}
