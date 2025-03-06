package com.aakash.dsa.sorting.practise.set;

import java.util.Arrays;

public class SetIntersection {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 2, 4, 5};
        int[] arr2 = new int[]{1, 2, 4, 5};

        System.out.println("Intersection of array" + Arrays.toString(SetIntersection.getIntersectionFomArray(arr1, arr2)));

    }

    public static int[] getIntersectionFomArray(int[] arr1, int[] arr2) {
        int len = findLengthOfArray(arr1, arr2);
        if (len == -1) throw new IllegalArgumentException("Invalid Array");
        else if (len == 0) throw new IllegalArgumentException("Array is empty");

        int[] result = new int[len+1];
        intersectionV1(arr1, arr2, result);
        return result;
    }
    private static int findLengthOfArray(int[] arr1, int[] arr2) {
        int len ;
        if(arr1!=null && arr2!= null) {
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
    private static void intersectionV1(int[] arr1, int[] arr2, int[] result) {
        int k = 0;
        for (int i = 0, j = 0; i < arr1.length && j<arr2.length; ) {
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

