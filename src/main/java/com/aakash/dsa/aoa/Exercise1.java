package com.aakash.dsa.aoa;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(average(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5, 6})));
        int[] ints = new int[]{1, 2, 3, 4, 5}; // {5, 4, 3, 2, 1}

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(reverseArrayInplace(ints)));

        System.out.println();
        printPairs(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(twoSum(new int[]{12, 34, 98}, 46)));


    }

    public static int average(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // ==> sum = sum + arr[i]
        }

        return sum/ arr.length;

        // time complexity : O(n)
        // space complexity : O(1) ==> constant
    }

    public static int[] reverse(int[] arr){

        int[] response = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int index = arr.length - 1 - i; // expression

            response[index] = arr[i];
        }

        return response;

        // time complexity : O(n)
        // space complexity : O(n)

    }

    public static int[] reverseArrayInplace(int[] arr){   // arr = {1, 2, 3, 4, 5, 6}
        if (arr == null || arr.length == 0){
            return new int[]{};
        }

//        int i = 0;
//        int j = arr.length - 1;
        for (int i = 0, j = arr.length - 1 ;i < j ; i++, j--) {
            swap(i, j , arr);        // {6, 5, 4, 3, 2, 1}
        }

//        while (i < j){               // i = 2, j = 3
//            swap(i, j , arr);        // {6, 5, 4, 3, 2, 1}
//            i++;                     // i --> 3
//            j--;                     // j --> 2
//        }

        /**
         * Algorithm :
         *  1. start from zeroth index and from end index
         *  2. swap them
         *  3. return the array
         *
         *  Time complexity : O(n/2) ==> O(n)
         *  Space complexity : O(1)
         */

        return arr;
    }


    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void printPairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    public static int[] twoSum(int[] arr, int target){
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }

                System.out.println(arr[i] + ", " + arr[j]);
            }
        }

        return new int[]{};

        // Time Complexity :
        // Space Complexity :
    }

    public static int[] printReverse(int[] arr){

        return new int[]{};
    }
}
