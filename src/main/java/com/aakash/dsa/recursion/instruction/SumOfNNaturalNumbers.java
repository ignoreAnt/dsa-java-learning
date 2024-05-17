package com.aakash.dsa.recursion.instruction;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sumN(5));
        System.out.println(sumN(4));
    }

    public static int sumN(int n){
        if (n == 0){
            return 0;
        }

        return n + sumN(n - 1);
        // TC : O(n) ; (n + 1) function calls
        // AS : O(n) ; (n + 1) functions in call stack
    }
}
