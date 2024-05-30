package com.aakash.dsa.recursion.instruction;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 4, 5, 9, 2};
        System.out.println(findMax(array, array.length));
    }

    public static int findMax(int[] arr, int length){

        // For array with one element the maximum is first element
        if (length == 1){
            return arr[0];
        }

        return Math.max(arr[length - 1], findMax(arr, length - 1));
    }
}
