package com.aakash.dsa.arrays.instruction;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 5};
        System.out.println(maxTrappedWater(arr));
        System.out.println(maxTrappedWaterV2(arr));
    }

    public static int maxTrappedWater(int[] arr){
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }

            int rMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rMax = Math.max(rMax, arr[j]);
            }

            result = result + (Math.min(lMax, rMax) - arr[i]);
        }

        return result;

        // TC : O(n^2)
        // AS : O(1)
    }

    public static int maxTrappedWaterV2(int[] arr){
        int result = 0;
        int[] lMaxPreComputed = new int[arr.length];
        int[] rMaxPreComputed = new int[arr.length];

        lMaxPreComputed[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lMaxPreComputed[i] = Math.max(arr[i], lMaxPreComputed[i - 1]);
        }

        rMaxPreComputed[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rMaxPreComputed[i] = Math.max(arr[i], rMaxPreComputed[i + 1]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            result = result + (Math.min(lMaxPreComputed[i], rMaxPreComputed[i]) - arr[i]);
        }

        return  result;
    }
}
