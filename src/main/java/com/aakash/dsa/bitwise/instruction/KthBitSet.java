package com.aakash.dsa.bitwise.instruction;

public class KthBitSet {
    public static void main(String[] args) {
        System.out.println(kthBitSet(5, 1));
        System.out.println(kthBitSet(5, 2));
        System.out.println(kthBitSet(5, 3));
        System.out.println(kthBitSet(8, 4));
    }

    public static boolean kthBitSet(int n, int k){
        while (k > 1){
            n = n / 2;
            k--;
        }
        int rightMostBit = n % 2;
        return rightMostBit == 1;
    }
}
