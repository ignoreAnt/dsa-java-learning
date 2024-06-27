package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

public class DynamicArray {

    private int capacity;
    private int length;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 56, 0, 0};
//        capacity = 7;
//        length = 5;
//
//        System.out.println(Arrays.toString(nums));
//        nums = addElementAtLast(nums, 13, capacity, length);
//        nums = addElementAtLast(nums, 23, capacity, length + 1);
//        nums = addElementAtLast(nums, 63, capacity, length + 2);
        System.out.println(Arrays.toString(nums));

        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.addElementAtLast(1);
        dynamicArray.addElementAtLast(2);
        dynamicArray.addElementAtLast(3);
        System.out.println(Arrays.toString(dynamicArray.arr));
        dynamicArray.addElementAtLast(4);
        System.out.println(Arrays.toString(dynamicArray.arr));
        System.out.println(dynamicArray.length);
        System.out.println(dynamicArray.capacity);
        dynamicArray.addElementAtIndex(5, 0);
        System.out.println(Arrays.toString(dynamicArray.arr));
        dynamicArray.addElementAtIndex(6, 1);
        System.out.println(Arrays.toString(dynamicArray.arr));
        dynamicArray.addElementAtIndex(7, 0);

    }

    public void addElementAtLast(int element){
        if(length != capacity){
            arr[length] = element;
            length++;
        } else {
            // Case : where length == capacity
           int[] newArray = new int[2 * capacity];
           int i = 0;
           for (; i < arr.length; i++) {
                newArray[i] = arr[i];
           }

           newArray[i] = element;
           capacity = capacity * 2;
           length++;
           arr = newArray;
        }
    }

    public void addElementAtIndex(int element, int index){
        if(length < capacity){
            for (int i = length; i >= index ; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = element;
            length++;
        } else {
            // Case : where length == capacity
            int[] newArray = new int[2 * capacity];

            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            for (int j = length; j >= index ; j--) {
                arr[j + 1] = arr[j];
            }

            newArray[index] = element;
            this.capacity = capacity * 2;
            this.length++;
            arr = newArray;
        }
    }

    public void removeElementAtLast(){
        // TODO
    }

    public void removeElementAtIndex(int index){
        // TODO
    }

    public int getValueAtIndex(int index){
        // TODO
        return 0;
    }

    public void updateValueAtIndex(int index, int element){
        // TODO
    }
}
