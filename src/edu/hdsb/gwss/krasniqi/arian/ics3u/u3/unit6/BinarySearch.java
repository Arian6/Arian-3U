/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.krasniqi.arian.ics3u.u3.unit6;

import edu.hdsb.gwss.krasniqi.arian.ics3u.u3.ArrayUtill.ArrayUtil;
import java.util.Scanner;

/**
 *
 * @author 1krasniqiari
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int guess;

        System.out.println("Enter the number you are trying to find");
        guess = input.nextInt();

        int numbers[]
                = {1,2,3,4,5,6,7};

        int guess2 = ArrayUtil.binarySearchWithoutDisplay(numbers, guess);
        
         System.out.println(guess2);
    }

}
