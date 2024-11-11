package com.aakash.dsa.sorting.complete;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

//        selectionSort(arr);
        selectionSortV2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            swap(i, minIndex, arr);
        }
    }

    private static void selectionSortV2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(i, minIndex, arr);
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
