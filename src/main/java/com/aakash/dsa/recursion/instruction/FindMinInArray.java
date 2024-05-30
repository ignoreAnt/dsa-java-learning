package com.aakash.dsa.recursion.instruction;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 87, 12, 46, 89, 90};
        System.out.println(min(arr, arr.length));
    }

    public static int min(int[] arr, int length){
        if (length == 1){
            return arr[0];
        }

        return Math.min(arr[length - 1], min(arr, length - 1));
    }
}
