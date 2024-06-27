package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        /*
            Arrays are saved in contiguous location
            [0]         [1]             [2]
            0x1000      0x1004          0x1008

            Cache Friendliness

            CPU -> L1, L2, L3 --> RAM --> SSD/HDD

            Arrays : GET ==> O(1)
                    UPDATE ==> O(1)
                    ADD ==> O(n)
                    DELETE ==> O(n)
         */
        int numbers1[] = new int[10];
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[2] = 13;

        System.out.println(Arrays.toString(numbers));
        int[] nums = {1, 2, 3, 4, 56, 0, 0};

        System.out.println(Arrays.toString(nums));
        remove(nums, 0);
        System.out.println(Arrays.toString(nums));
        addAtIndex(nums, 1, 12);
        System.out.println(Arrays.toString(nums));

    }

    public static void remove(int[] arr, int index){
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void addAtIndex(int[] arr, int index, int value){
        int lastIndex = 3;

        for (int i = 3; i >= index ; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = value;
    }



}
