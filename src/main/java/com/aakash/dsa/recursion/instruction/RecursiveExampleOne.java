package com.aakash.dsa.recursion.instruction;

public class RecursiveExampleOne {
    public static void main(String[] args) {
//        fun(3);
//        fun1(3);
//        fun2(3);
        fun3(3);
    }


    public static void fun(int n)
    {
        if(n == 0) {
            return;
        }

        fun(n - 1); // fun(3),

        System.out.println(n);

//        fun(n - 1);
    }

    public static void fun1(int n)
    {
        if(n == 0) {
            return;
        }

        System.out.println(n);

        fun1(n - 1); // Tail Recursion

    }

    public static void fun2(int n)
    {
        if(n == 0) {
            return;
        }

        System.out.println(n);

        fun2(n - 1);

        System.out.println(n);

    }

    public static void fun3(int n)
    {
        if(n == 0) {
            return;
        }

        fun3(n - 1);

        System.out.println(n);

        fun3(n - 1);


    }
}
