package com.aakash.dsa.recursion.instruction;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(5, 0));
    }

    public static int sum(int n){
        if (n == 0){
            return 0;
        }

        return n + sum(n - 1);
    }

    public static int sum(int n, int k){
        if (n == 0){
            return k;
        }

        return sum(n - 1, k + n);
    }
}
