package com.aakash.dsa.maths.complete;

public class GCDorHCF {
    public static void main(String[] args) {
        int num1 = 4, num2 = 6;
////        for (int i = 0; i < 15; i++) {
////            System.out.print(i % 5 + ", ");
////        }
        System.out.println(gcd(4, 6));
        System.out.println(gcdV2(4, 6));
        System.out.println(gcdV3(105, 258));
        System.out.println("GCD(" + num1 + "," + num2 + ") :: " + gcdV1_1(num1, num2));
        System.out.println("GCD(" + num1 + "," + num2 + ") :: " + gcdV2_1(num1, num2));
    }

    public static int gcd(int a, int b) {

        int result = Math.min(a, b);

        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        return result;
        // TC : O(min(a,b))
        // AS : O(1)
    }

    public static int gcdV1_1(int x, int y) {
        int gcd = Math.min(x, y);
        do {
            if (x % gcd == 0 && y % gcd == 0) {
                break;
            } else {
                gcd--;
            }
        } while (gcd > 0);
        return gcd;
    }

    /**
     * Euclid Algorithm :
     * Basic Idea :
     * Let b is smaller than a
     * gcd(a, b) = gcd(a-b, b)
     * Why ?
     * Let g be the GCD of a and b
     * a = g * x; b = g * y and GCD(x, y) = 1
     * ==> (a - b) = g(x - y)
     */

    public static int gcdV2(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
        // TC : O()
        // AS : O(1)
    }

    public static int gcdV2_1(int x, int y) {

        int gcdResult = 1;
        // step 1 lets consider y as smaller
        // step 2 x = x - y
        // step 3 else y = x - y
        // perform step 1 to step 3 till x !=y
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return gcdResult = x;
    }

    /**
     * The Euclidean algorithm is an efficient method for computing the greatest common divisor (GCD) of two integers.
     * The GCD of two numbers is the largest number that divides both of them without leaving a remainder.
     * The algorithm is based on the following principle:
     * <p>
     * Given two positive integers, a and b, where a > b, the GCD of a and b is the same as the GCD of b and a % b,
     * where % denotes the modulus operator, which gives the remainder of the division of a by b.
     *
     * @param a int first number
     * @param b int second number
     * @return return the gcd of the two number a, b
     */
    public static int gcdV3(int a, int b) {
        if (b == 0) {
            return a;
        }

        System.out.println("a " + a + "mod" + " b: " + b + ":: " + a % b);
        return gcdV3(b, a % b);
    }
    // x < y ==> x % y = x
    // 5 < 10 ==> 5 % 10 =
}
