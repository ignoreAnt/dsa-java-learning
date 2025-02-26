package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class BubbleSortP {
    public static void main(String[] args) {
//        int[] arr = {10, 5, 2, 6, 2};
        int[] arr = {2, 2, 5, 10, 6}; // {5, 4, 3, 2 ,1}
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) { // O(5)
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) { // O(n)
                if (arr[j] > arr[j + 1]){ // arr[i - 1] < a [i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped){
                break;
            }
        }


    }
}
