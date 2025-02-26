package com.aakash.dsa.sorting.complete;

import java.util.Arrays;

public class IntersectionSortedArrays {
    public static void main(String[] args) {
//        int[] empty = new int[]{};
        int[] empty = new int[0];
        System.out.println(Arrays.toString(empty));
    }

    public static int[] intersection(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null){
            return null;
        }
        if (arr1.length == 0 || arr2.length == 0){
            return new int[]{};
        }
        int resultArrayLength = Math.min(arr1.length, arr2.length);
        int[] result = new int[resultArrayLength];

        int i = 0; // index to traverse arr1
        int j = 0; // index to traverse arr2
        int k = 0; // index to traverse result

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                if (k == 0 || result[k - 1] != arr1[i]){
                    result[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        return result;
    }

}
