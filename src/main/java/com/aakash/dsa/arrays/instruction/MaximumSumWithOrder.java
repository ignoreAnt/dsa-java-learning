package com.aakash.dsa.arrays.instruction;

public class MaximumSumWithOrder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxValue(arr));
        System.out.println(maxValueV2(arr));
    }

    public static int maxValue(int[] arr){
        int result = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result = Math.max(result, arr[j] - arr[i]);
            }
        }

        return result;
    }

    public static int maxValueV2(int[] arr){
        int result = arr[1] - arr[0];
        int minimumValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = Math.max(result, arr[i] - minimumValue);
            minimumValue = Math.min(minimumValue, arr[i]);
        }

        return result;
    }
}
