package com.aakash.dsa.bitwise.instruction;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(100));
        long a = decimalToBinary(3);
        long b = decimalToBinary(6);
        System.out.println(a + "; " + b + " = " + (a & b));
        System.out.println(a + "; " + b + " = " + (a | b));
        System.out.println(a + "; " + b + " = " + (a ^ b));

    }

    public static long decimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder;
        long currentPlace = 1; // Tracks the current place value in binary

        while (n > 0) {
            remainder = n % 2; // Get the remainder (0 or 1)
            n = n / 2; // Divide the number by 2

            // Construct the binary number
            binaryNumber += remainder * currentPlace;
            currentPlace *= 10; // Move to the next place value
        }

        return binaryNumber;
    }
}
