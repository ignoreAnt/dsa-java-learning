package com.aakash.dsa.sorting.complete;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {1, 5, 2, 6, 3, 4, 6, 7, 2};
        int[] arr = {1, 2, 3, 2, 4, 6, 7};
//        bubbleSort(arr);
//        bubbleSortV2(arr);
        bubbleSortV3(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // doing the number of passes
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
    }

    public static void bubbleSortV2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(j, j + 1, arr);
                }
            }
        }
    }

    public static void bubbleSortV3(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(j, j+ 1, arr);
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
