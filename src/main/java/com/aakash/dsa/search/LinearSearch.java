package com.aakash.dsa.search;

public class LinearSearch {

    public static void main(String[] args) {

        System.out.println(search(new int[]{23, 45, 1, 3, 5, 16}, 1));
    }

    public static boolean search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return true;
            }
        }

        return false;
    }
}
