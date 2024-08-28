package com.aakash.dsa.arrays.instruction;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 0};
        minConsecutiveFlips(arr);
        minConsecutiveFlipsV2(arr);
    }


    public static void minConsecutiveFlipsV2(int[] arr) {
        int zeroGroupCount = arr[0] == 0 ? 1 : 0;
        int oneGroupCount = arr[0] == 1 ? 1 : 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == 0) {
                    zeroGroupCount++;
                } else {
                    oneGroupCount++;
                }
            }
        }

        System.out.println(Math.min(zeroGroupCount, oneGroupCount));
    }

    public static void minConsecutiveFlips(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                if(arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                }
                else {
                    System.out.println(i - 1);
                }
            }
        }

        if(arr[arr.length - 1] != arr[0]) {
            System.out.println(arr.length - 1);
        }
    }
}



