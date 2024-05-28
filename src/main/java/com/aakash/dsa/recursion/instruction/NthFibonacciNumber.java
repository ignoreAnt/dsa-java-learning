package com.aakash.dsa.recursion.instruction;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacciNumber {

    private static final Map<Integer, Long> memoizationMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fibV2(5));
    }

    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static long fibV2(int n){
        if (memoizationMap.containsKey(n)){
            return memoizationMap.get(n);
        }

        if (n <= 1){
            return n;
        }

        long result = fibV2(n - 1) + fibV2(n - 2);
        memoizationMap.put(n, result);
        return result;

    }
}
