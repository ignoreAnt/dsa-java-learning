package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class InsertionSortP {
    public static void main(String[] args) {
        int[] arr = {20, 5, 40, 40, 60, 10, 30};
        insertionSort(arr);
//        insertionSortV2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // save the current element to insert later
            int j = i - 1; // because the sorted region ends here.
            while (j >= 0 && temp < arr[j]){
                arr[j + 1]  = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void insertionSortV2(int[] arr){

        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i]; // save the current element to insert later
            int j = i; // because the sorted region ends here.
            while (j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j -1];
                arr[j - 1] = temp;
                j--;
            }
//            arr[j + 1] = temp;
        }
    }
}
