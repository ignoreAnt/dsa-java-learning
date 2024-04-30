package com.aakash.dsa.bitwise.instruction;

public class KthBitSet {
    public static void main(String[] args) {
        System.out.println(kthBitSet(5, 1));
    }

    public static boolean kthBitSet(int n, int k){
        while (k > 0){
            n = n / 2;
            k--;
        }
        int rightMostBit = n % 2;
        return rightMostBit == 1;
    }
}
