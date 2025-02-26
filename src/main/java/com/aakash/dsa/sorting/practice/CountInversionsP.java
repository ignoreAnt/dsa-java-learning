package com.aakash.dsa.sorting.practice;

public class CountInversionsP {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(countInversions(arr));

    }

    public static int countInversions(int[] arr){
        if (arr.length <= 1){
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {  // O(n)
            for (int j = i + 1; j < arr.length; j++) { //O(n - 1)
                if (arr[i] > arr[j]){
                    count++;
                }
            }
        }

        return count;

    }
}
