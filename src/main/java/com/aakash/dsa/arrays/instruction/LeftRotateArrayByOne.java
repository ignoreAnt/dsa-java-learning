package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        leftRotateByOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void leftRotateByOne(int[] arr){
        if (arr.length == 0){
            return;
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}
