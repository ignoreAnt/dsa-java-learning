package com.aakash.dsa.strings.practice;

public class CountSetBits {
    public static void main(String[] args) {
        int number = 42;  // Binary: 101010

        // Count set bits using i & (1 << j) approach
        int count = countSetBits(number);
        System.out.println("Number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("Set bits count: " + count);

        // Test with another number
        int number2 = 123;  // Binary: 1111011
        int count2 = countSetBits(number2);
        System.out.println("\nNumber: " + number2 + " (Binary: " + Integer.toBinaryString(number2) + ")");
        System.out.println("Set bits count: " + count2);

        // n = n & (n -1)
    }

    public static int countSetBits(int num) {
        int count = 0;

        // Check each bit position
        for (int j = 0; j < 32; j++) {
            // If A bit at position j is set, increment count
            if ((num & (1 << j)) != 0) {
                count++;
            }
        }

        return count;
    }
}
