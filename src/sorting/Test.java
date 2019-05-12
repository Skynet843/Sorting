/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author skynet
 */
public class Test {
    public static void main(String[] args) {
        int[] souvik={7,8,9,4,5,6,1,2,3};
       souvik=SortingAlgo.insertionSort(souvik, true);
        System.out.println(Arrays.toString(souvik));
    }
}
