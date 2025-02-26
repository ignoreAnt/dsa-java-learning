package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class NaivePartitionP {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 12, 7};

        System.out.println(Arrays.toString(naivePartition(arr, 0, (arr.length - 1))));

    }

    public static int[] naivePartition(int[] arr, int low, int high){
        int pivot = arr[high];

        int[] temp = new int[high - low + 1];
        int index = 0;

        for (int i = low; i <= high; i++) {
            if (arr[i] <= pivot){
                temp[index++] = arr[i];
            }
        }

        for (int i = low; i <= high ; i++) {
            if (arr[i] > pivot){
               temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}
