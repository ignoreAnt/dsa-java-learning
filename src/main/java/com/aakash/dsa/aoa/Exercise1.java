package com.aakash.dsa.aoa;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(average(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5, 6})));
        int[] ints = new int[]{1, 2, 3, 4, 5}; // {5, 4, 3, 2, 1}
        printReverse(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(reverseArrayInplace(ints)));

        System.out.println();
        printPairs(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(twoSum(new int[]{12, 34, 98}, 46)));
        System.out.println(Arrays.toString(twoSumV2(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSumV2(new int[]{2, 4, 6}, 10)));

        System.out.println(getAllPairs(new int[]{12, 34, 56}));

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
        // Auxiliary Space : O(n)

    }

    // i = 0 ; j = arr.length - 1
    // arr = {1, 2, 3, 4, 5} ==> odd number
    // i = 0; j = 4
    // swap(i, j)
    // {5, 2, 3, 4, 1}
    // i++; j-- ==> i = 1 ; j = 3
    // swap(i, j)
    // {5, 4, 2, 3, 1}
    // i++ ; j-- ==> i = 2; j = 2


    public static int[] reverseArrayInplace(int[] arr){   // arr = {1, 2, 3, 4, 5, 6}

        if (arr == null || arr.length == 0){
            return new int[]{};
        }

        int startPtr = 0;
        int endPtr = arr.length - 1;


        while (startPtr < endPtr){               // i = 2, j = 3
            swap(startPtr, endPtr , arr);        // {6, 5, 4, 3, 2, 1}
            startPtr++;                     // i --> 3
            endPtr--;                     // j --> 2
        }

        /**
         * Algorithm :
         *  1. start from zeroth index and from end index
         *  2. swap the element on those index
         *  3. increase the start index and decrease the end index
         *  3. return the array
         *
         *  Time complexity : O(n/2) ==> O(n)
         *  Auxiliary Space: O(1)
         */

        return arr;
    }


    public static void swap(int i, int j, int[] arr) {
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

    public static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static List<Pair> getAllPairs(int[] arr){
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pairs.add(new Pair(arr[i], arr[j]));
            }
        }

        return pairs;
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

        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
    }

    // i + j = target
    // target - i
    // arr = {1, 2, 3} ; target = 5
    public static int[] twoSumV2(int[] arr, int target){
        Map<Integer, Integer> unique = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {   // O(n)
            int elementToSearch = target - arr[i];
            if (unique.containsKey(elementToSearch)){
                return new int[]{unique.get(elementToSearch), i};
            }
            unique.put(arr[i], i);
        }

        return new int[]{};

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    public static void printReverse(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
