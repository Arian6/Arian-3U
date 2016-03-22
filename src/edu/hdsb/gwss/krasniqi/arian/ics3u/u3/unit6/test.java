/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;

/**
 *
 * @author ARIAN
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int arrayLength = 10;
        int highestPossibleValue = 10;
        int lowestPossibleValue = 1;

        int[] test = ArrayUtil.generatingArray(arrayLength, highestPossibleValue, lowestPossibleValue);

        int guess = 2;
        ArrayUtil.displayArray(test);

        ArrayUtil.linearSearch(test, guess);

    }

}
