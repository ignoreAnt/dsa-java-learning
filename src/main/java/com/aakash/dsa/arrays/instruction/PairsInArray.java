package com.aakash.dsa.arrays.instruction;

public class PairsInArray {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        printPairs(nums);
        System.out.println(maxDifference(nums));
    }

    public static void printPairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", "+ arr[j] + ")");
            }
        }
    }

    public static int maxDifference(int[] arr){
        int maxDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currentDiff = arr[j] - arr[i];
                if (currentDiff > maxDiff){
                    maxDiff = currentDiff;
                }
            }
        }
        return maxDiff;
    }
}
