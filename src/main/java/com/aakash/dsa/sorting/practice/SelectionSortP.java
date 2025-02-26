package com.aakash.dsa.sorting.practice;

public class SelectionSortP {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) { // sorted
            int min = i;
            for (int j = i; j < arr.length; j++) { // unsorted
                if (arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }

    }
}
