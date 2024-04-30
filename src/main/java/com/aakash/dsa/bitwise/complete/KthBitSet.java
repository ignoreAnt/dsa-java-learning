package com.aakash.dsa.bitwise.complete;

public class KthBitSet {
    public static void main(String[] args) {

    }

    public static boolean isKthBitSet(int n, int k){
        return (n & (1 << k)) != 0;
    }

    public static int setKthBit(int n, int k){
        return (n | (1 << k));
    }

    public static int clearKthBit(int n, int k){
        return (n & ~(1 << k));
    }

    public static int toggleKthBit(int n, int k){
        return (n ^ (1 << k));
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int countSetBitsV2(int n){
        int count = 0;
        while(n > 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static int countSetBitsV3(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static int countSetBitsV4(int n){
        int count = 0;
        while(n > 0){
            count += n % 2;
            n = n / 2;
        }
        return count;
    }

    public static int countSetBitsV5(int n){
        int count = 0;
        while(n > 0){
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }


}
