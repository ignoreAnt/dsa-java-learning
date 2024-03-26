package com.aakash.dsa.maths.complete;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(gcd(3, 3));
    }

    public static int gcd(int a, int b){
        int result = Math.min(a, b);
        while (result > 0){
            if (a % result == 0 && b % result == 0){
                break;
            }
            result--;
        }

        return result;
    }
}
