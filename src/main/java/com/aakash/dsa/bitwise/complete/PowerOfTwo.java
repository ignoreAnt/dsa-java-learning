package com.aakash.dsa.bitwise.complete;

public class PowerOfTwo {

    // 2^0, 2^1, 2^2, 2^3.....1, 2, 4, 8, 16
    public static void main(String[] args) {
        System.out.println(isPow2(2));
        System.out.println(isPow2(4));
        System.out.println(isPow2(8));
        System.out.println(isPow2(14));
        System.out.println(isPow2(20));
        System.out.println(isPow2V2(20));
        System.out.println(isPow2V2(32));

        for (int i = 0; i < 10; i++) {
            int result = 1<<i;
            System.out.println(result + " ; " +  Integer.toBinaryString(result));
        }

    }

    public static boolean isPow2(int n) {
        if(n == 0) {
            return false;
        }

        while(n != 1){
            if(n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
        // TC : O(logn)
        // AS : O(1)
    }

    static boolean isPow2V2(int n) {
        if(n == 0) {
            return false;
        }
        return ((n & (n - 1)) == 0);
    }
}
