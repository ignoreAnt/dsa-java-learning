package com.aakash.dsa.recursion.instruction;

public class RecursiveFunction {
    public static void main(String[] args) {
         fun(3);
    }

    public static void fun(int n)
    {
        if(n == 0) {
            return;
        }

        System.out.println("Hello");

        fun(n - 1);
    }
}
