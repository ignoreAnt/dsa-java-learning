package com.aakash.dsa.arrays.instruction;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leaders(arr);
        System.out.println();
        leadersV2(arr);
    }

    // Algorithm : Fix an element and check if all the elements on the right are less than it,
    // if yes : print it
    // if no : move to next element
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

        // TC : O(n^2)
        // AS : O(1)
    }

    // Algorithm :
    /*
        1. Start traversing the array from left
        2. Assign right most element as  current leader, as rightmost element is always leader
        3. Traverse from n - 2 to index 0
            check if the current element is greater than current leader
            if yes : update current leader and print it.
            if no : ignore and continue
     */
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
