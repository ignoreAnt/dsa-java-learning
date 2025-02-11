package com.aakash.dsa.sorting.practise.set;

import java.util.Arrays;

public class SetDifference {
    public static void main(String[] args) {
        int[] arr1= new int[]{1,2,3,4,5,6};
        int[] arr2= new int[]{1,2,3,4};
        System.out.println("A Minus B is "+ Arrays.toString(findDifference(arr1,arr2)));
    }
    private static int[] findDifference(int[] arr1, int[] arr2){
        int len =  findLengthOfArray(arr1, arr2);
        int[] intersectionResult = new int[len];
        //get the element from arr1 excluding common element
        //1. find the intersection of array.
        //2. remove the intersection from first array.
        setIntersectionV1(arr1,arr2, intersectionResult);
        return arrayDifference(arr1, intersectionResult);
    }

    private static int[] arrayDifference(int[] arr1, int[] intersectionResult) {
        int len = findLengthOfArray(arr1, intersectionResult);
        int[] result = new int[len+1];

        for (int i = 0, j=0,k=0; i < arr1.length; i++,j++) {
            if (arr1[i] != intersectionResult[j]) {
                result[k++] = arr1[i];
            }
        }
        return  result;
    }

    private static int findLengthOfArray(int[] arr1, int[] arr2) {
        int len ;
        if(arr1!=null && arr2!= null)
        {
            if (arr1.length > arr2.length) {
                len = arr1.length;
            } else if (arr1.length < arr2.length) {
                len = arr2.length;
            } else {
                len = arr1.length;
            }
        }
        else
            throw new IllegalArgumentException("Invalid Array");

        if (len == 0) throw new IllegalArgumentException("Array is empty");

        return len;
    }

    private static void setIntersectionV1(int[] arr1, int[] arr2, int[] result) {
        for (int i = 0, j = 0,k = 0; i < arr1.length && j<arr2.length; ) {
            if (arr1[i] == arr2[j]) {
                result[k++] = arr1[i++];
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }else{
                j++;
            }
        }
    }
}
