package com.aakash.dsa.recursion.instruction;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factTailRecursive(5, 1));
    }

    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        return n * fact(n - 1);
    }

    public static int factTailRecursive(int n, int k){
        if (n == 0 || n == 1){
            return k;
        }

        return factTailRecursive(n - 1, k * n);
    }
}
