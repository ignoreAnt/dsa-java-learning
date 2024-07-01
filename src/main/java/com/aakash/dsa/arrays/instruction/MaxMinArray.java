package com.aakash.dsa.arrays.instruction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println(max(new int[]{-1, -2, -3, -56, -109, -3, -4, -5, -13}));
        System.out.println(min(new int[]{-1, -2, -3, -56, -109, -3, -4, -5, -13}));

        /*
            Find Maximum :
                Test cases :
                1) array is null.
                2) array has zero length.
                3) check for negative numbers.
                4) check for single element array.
                5) check for all the elements in the array are same.
                6) check for duplicate elements.


                Extreme Case: check for integer limits.
         */

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

    }

        /*
         Finding maximum :
         a0, a1, .....a(k-1), a(k)... a(n)
         max is maximum element encountered from a0 to a(k - 1),
         Then we can have two possible cases for a(k) :
          1) a(k) > max
             decision : max = a(k)
          2) a(K) <= max
             decision : ignore
      */
    public static int max(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("null or zero length array was passed");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;

        // TC : O(n)
        // AS : O(1)
    }


    /*
        Finding minimum :
        a0, a1, .....a(k-1), a(k)... a(n)
        min is minimum element encountered from a0 to a(k - 1),
        Then we can have two possible cases for a(k) :
          1) a(k) < min
             decision : min = a(k)
          2) a(K) >= min
             decision : ignore
    */
    public static int min(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("null or zero length array was passed");
        }

        int min = arr[0]; // Missed out
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static int secondMaxElement(int[] arr){
        // Approach 1: Sort & get the nth index; Best sorting algorithm has TC of O(n* log(n))

        return -1;
    }

    public static int secondMinElement(int[] arr){
        // Approach 1: Sort & get the nth index; Best sorting algorithm has TC of O(n* log(n))
        Arrays.sort(arr);

        return -1;
    }

    /*
       Search :
       a0, a1, .....a(k-1), a(k)... a(n)
       elementToFind is element we are looking to search from a0 to a(k - 1),
       Then we can have two possible cases for a(k) :
         1) a(k) == elementToFind
            decision : found element at index k
         2) a(K) != elementToFind
            decision : ignore
   */
    public static int search(int[] arr, int target){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("null or zero length array was passed");
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
        // TC : O(n)
        // AS : O(1)
        // TODO :
        /*
            1. Write the recursive solution for searching an element in an array.
         */

    }

    public static List<Integer> searchAllOccurances(int[] arr, int target){
        List<Integer> indices = new ArrayList<>();
        return indices;

        // TC : O(n)
        // AS : O(n)
    }
}
