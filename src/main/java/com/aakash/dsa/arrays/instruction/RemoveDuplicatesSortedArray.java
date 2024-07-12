package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        /*
            i/p : {10, 20, 20, 30, 30, 30}
            o/p : {10, 20, 30, -, -, -} ; size = 3

            i/p : {10, 10, 10, 10}
            o/p : {10, -, -} ; size = 1

            i/p : {10, 20, 30}
            o/p : {10, 20, 30}; size = 3
         */

        int[] nums = {10, 20, 20, 30, 30, 30};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicatesV3(nums));
    }

    public static DuplicatesRemoved removeDuplicates(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int j = 0;
        for (Integer i: set) {
            arr[j] = i;
            j++;
        }

        return new DuplicatesRemoved(arr, j);

        // TC : O(n)
        // AS : O(n)

    }


    public static DuplicatesRemoved removeDuplicatesV2(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int j = 0;
        for (Integer i: set) {
            arr[j] = i;
            j++;
        }

        return new DuplicatesRemoved(arr, j);

        // TC : O(n)
        // AS : O(n)

    }



    public static class DuplicatesRemoved{
        private int[] arr;
        private int size;

        public DuplicatesRemoved(int[] arr, int size) {
            this.arr = arr;
            this.size = size;
        }

        @Override
        public String toString() {
            return "DuplicatesRemoved{" +
                    "arr=" + Arrays.toString(arr) +
                    ", size=" + size +
                    '}';
        }
    }


    /*
        arr = {10, 10, 20, 20, 20, 30, 30, 30}
        arr = {10, 20, 20, 20, 20, 30, 30, 30}
        arr = {10, 20, 30, 20, 20, 30, 30, 30}






        Follow the steps mentioned below to implement the idea:

        Traverse input array from i = 0 to length:
        Keep track of the count of unique elements. Let this count be j.
                 Swap arr[j] with arr[i].
        At last, return j.
     */

    public static DuplicatesRemoved removeDuplicatesV3(int[] arr)
    {
        if (arr == null){
            throw new IllegalArgumentException("Array is null");
        }

        if (arr.length == 0 || arr.length == 1) {
            return new DuplicatesRemoved(arr, arr.length);
        }

        // To store index of next unique element
        int count = 0;

        // If current element is not equal to next
        // element then store that current element
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != arr[i + 1]) {
                arr[count++] = arr[i];
            }

        arr[count++] = arr[arr.length - 1];

        return new DuplicatesRemoved(arr, count);
    }
}
