package com.aakash.dsa.arrays;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println(sum(nums));
    }

    public static int sum(int[] ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];

        }
        return sum;
    }


    public static int sumv2(int[] array){
        int sum = 0;
        if(array.length % 2 == 0){
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return sum;
    }
}
