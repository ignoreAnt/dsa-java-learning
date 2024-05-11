package com.aakash.dsa.bitwise.complete;

public class TwoOddOccurringElements {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};

        oddAppearing(arr);
        oddAppearingV2(arr);
    }

    public static void oddAppearing(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int count = 0;

            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count % 2 != 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }

    static void oddAppearingV2(int[] arr)
    {
        int xor = 0, res1 = 0, res2 = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        int sn = xor & (~(xor - 1));

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] & sn) != 0) {
                res1 = res1 ^ arr[i];
            }
            else {
                res2 = res2 ^ arr[i];
            }
        }

        System.out.println( res1 + " " + res2);

    }
}
