package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class MergeSortP {
    public static void main(String[] args) {
        int[] arr1 = {10, 15, 20, 40};
        int[] arr2 = {5, 6, 6, 15};

        System.out.println(Arrays.toString(mergeSort(arr1, arr2)));
    }

    public static int[] mergeSort(int[] arr1, int[] arr2){
        if (arr1.length == 0){
            return arr2;
        }

        if (arr2.length == 0){
            return arr1;
        }

        int[] result = new int[arr1.length + arr2.length];

        int i = 0; // index for arr1
        int j = 0; // index for arr2
        int k = 0; // index for result

//        int[] arr1 = {10, 15, 20, 40};
//        int[] arr2 = {5, 6, 6, 15};
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length){
            result[k++] = arr1[i++];
        }

        while (j < arr2.length){
            result[k++] = arr1[j++];
        }

        return result;
    }
}
