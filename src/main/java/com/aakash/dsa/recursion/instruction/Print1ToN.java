package com.aakash.dsa.recursion.instruction;

public class Print1ToN {
    public static void main(String[] args) {
        print(5);
        System.out.println();
        print(4);
        System.out.println();
        print(4, 1);
    }

    public static void print(int n){
        if (n == 0){
            return;
        }

        print(n - 1);
        System.out.print(n + ", ");
    }

    public static void print(int n, int k){
        if (n == 0){
            return;
        }
        System.out.print(k + ", ");
        print(n - 1, k + 1);
    }
}
