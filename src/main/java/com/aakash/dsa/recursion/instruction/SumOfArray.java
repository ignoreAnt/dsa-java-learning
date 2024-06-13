package com.aakash.dsa.recursion.instruction;

public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(recursiveSum(array, array.length));
    }

    private static int recursiveSum(int[] arr, int length){
        // For array with no elements the sum is zero
        if (length == 1){
            return arr[0];
        }

        return arr[length -1] + recursiveSum(arr, length -1);
    }
}
