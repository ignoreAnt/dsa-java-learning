package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
}
