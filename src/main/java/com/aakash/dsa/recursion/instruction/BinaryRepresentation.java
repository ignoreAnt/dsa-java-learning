package com.aakash.dsa.recursion.instruction;



public class BinaryRepresentation {
    public static void main(String [] args) {
        fun(5);
    }

    /**
     * &,|, ^, <<, >>, ~
     * 111 ==> 1 * 2^2 + 1 * 2^1 + 1 * 2^0 => 4 + 2 + 1 = 7
     * 001 ==> 1
     * 010 ==> 0 * 2^2 + 1 * 2^1 + 0* 2^0 ==> 2
     * 101 ==> 5
     *
     * 235 ==> 2 * 10^2 + 3 * 10^1 + 5 * 10^1 => 200 + 30 + 5 = 235
     */
    public static void fun(int n) {
        if(n == 0) {
            return;
        }

        fun(n / 2); // fun(7); fun(3);

        System.out.print(n % 2);

    }

}
