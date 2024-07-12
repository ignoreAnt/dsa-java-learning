package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

public class LeftRotateArrayByD {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(nums));
//        leftRotateArrayByD(nums, 3);
//        System.out.println(Arrays.toString(nums));
//        leftRotateArrayByDv2(nums, 3);
        System.out.println(Arrays.toString(nums));
        leftRotateArrayByDv3(nums, 3);
        System.out.println(Arrays.toString(nums));

    }

    public static void leftRotateArrayByD(int[] arr, int d){
        for (int i = 0; i < d; i++) {
            leftRotateArrayByOne(arr);
        }
    }

    public static void leftRotateArrayByOne(int[] arr){
        if (arr.length == 0){
            return;
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }

    public static void leftRotateArrayByDv2(int[] arr, int d){
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
           temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < temp.length; i++){
            arr[arr.length - d + i] = temp[i];
        }
    }

    public static void leftRotateArrayByDv3(int[] arr, int d){
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int low, int high){
        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
