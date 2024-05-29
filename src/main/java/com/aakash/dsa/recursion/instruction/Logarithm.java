package com.aakash.dsa.recursion.instruction;

public class Logarithm {
    public static void main(String [] args) {
        System.out.println(fun(16));
        for (int i = 1; i < 20; i++) {
            System.out.println(fun(i));
        }
    }


    public static int fun(int n) {
        if(n == 1) {
            return 0;
        }

        return 1 + fun(n / 2);

        /**
         * stack winding
         * fun(16)
         *     |
         *    1 + fun(8)
         *          |
         *          1 + fun(4)
         *               |
         *               1 + fun(2) = 1
         *                    |
         *                    1 + fun(1) = 0
         * stack un-winding
         * fun(16) = 4
         *      |
         *      1 + 3
         *         |
         *       1 + 2
         *            |
         *          1 + 1
         *              |
         *              1 + 0
         */
    }
}
