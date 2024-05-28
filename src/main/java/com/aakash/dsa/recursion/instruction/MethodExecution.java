package com.aakash.dsa.recursion.instruction;


public class MethodExecution {


    // 1. Passing of the control from one function to other
    // 2. Waiting for the function to complete
    // All the above is happening in Java runtime.

    // To achieve above the JVM internally uses Function call stack, which is made of stack frames
    public static void main(String[] args) {
        int k = 3;
        func3(k);
        k = func4(k);
        System.out.println(k);

        System.out.println("Before fun2");

        fun2(); // <---

        System.out.println("After fun2");

    }


    public static void fun1() {
        System.out.println("fun1");
    }

    public static void fun2() {
        System.out.println("Before fun1");

        fun1(); // <--

        System.out.println("After fun1");
    }

    public static void func3(int k){
        if (k == 0){
            return;
        }
        func3(k - 1);
        System.out.println("Hello");
    }

    public static int func4(int k){
        System.out.println(k);
        k = 5;
        System.out.println(k);
        return k;
    }
    

}
