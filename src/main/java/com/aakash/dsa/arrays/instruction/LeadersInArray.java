package com.aakash.dsa.arrays.instruction;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leaders(arr);
        System.out.println();
        leadersV2(arr);
    }

    public static void leaders(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void leadersV2(int[] arr){
        int currentLeader = arr[arr.length - 1];
        System.out.print(currentLeader + " ");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (currentLeader < arr[i]){
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }
}
