package com.aakash.dsa.arrays.instruction;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 8, 6, 6, 6, 6};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElementV2(arr));
    }

    public static int majorityElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > arr.length / 2){
                return i;
            }
        }

        return -1;
        // TC : O(n^2)
        // AS : O(1)
    }

    public static int majorityElementV2(int[] arr) {
        int candidate = 0, count = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[candidate] == arr[i]){
                count++;
            }else{
                count--;
            }

            if(count == 0) {
                candidate = i; count = 1;
            }
        }

        count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[candidate] == arr[i]) {
                count++;
            }
        }

        if(count <= arr.length /2) {
            candidate = -1;
        }

        return candidate;
    }
}
