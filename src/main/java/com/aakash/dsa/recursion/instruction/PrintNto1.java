package com.aakash.dsa.recursion.instruction;

public class PrintNto1 {
    public static void main(String[] args) {
        print(5);
        print(2);
    }

    public static void print(int n){
        // label: start
        if (n == 0){
            return;
        }


        System.out.print(n);
        if (n > 1){
            System.out.print(", ");
        }else {
            System.out.println();
        }
        print(n - 1); // Tail call elimination : n = n - 1; goto start
    }
}
