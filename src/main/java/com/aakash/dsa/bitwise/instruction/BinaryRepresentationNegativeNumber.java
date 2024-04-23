package com.aakash.dsa.bitwise.instruction;

public class BinaryRepresentationNegativeNumber {
    public static void main(String[] args) {
        twosComplement(3, 8);
    }

    /**
     * Negative numbers are represented by 2's complement
     * For n as number of bits we get the range of numbers as [-2^(n - 1) to 2^(n - 1)]
     * The idea is subtracted from zero (0 - x)
     *
     * Steps to get 2's complement
     *  1. Invert all bits
     *  2. Add 1
     *
     *  Direct Formula :
     *  2^n - x
     */
    public static void twosComplement(int x, int bitLength){
        System.out.println(Integer.toBinaryString((int) (Math.pow(2, bitLength) - x)));
    }
}
