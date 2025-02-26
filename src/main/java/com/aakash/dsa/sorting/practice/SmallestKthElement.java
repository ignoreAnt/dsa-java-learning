package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class SmallestKthElement {
    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 8, 100, 50};
        int k = 4;
        System.out.println(kthElement(arr, k));
        int[] arr1 = {20, 10, 5, 8, 100, 50};
        System.out.println(kthElementV2(arr1, k));


    }

    public static int kthElement(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int kthElementV2(int[] arr, int k){
        for (int i = 0; i < k ; i++) {  // O(k)
            int min = i;
            for (int j = i + 1; j < arr.length; j++) { // O(n)
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
        return arr[k - 1];
    }
}
