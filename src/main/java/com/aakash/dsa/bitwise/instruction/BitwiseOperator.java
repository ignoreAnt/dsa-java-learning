package com.aakash.dsa.bitwise.instruction;

public class BitwiseOperator {
    public static void main(String[] args) {
//        bitwiseAnd(3, 6);
//        bitwiseOr(3, 6);
//        bitwiseXor(3, 6);
//        bitwiseNot(5);
//        bitwiseLeftShift(3, 1);
//        bitwiseLeftShift(3, 2);
//        bitwiseLeftShift(3, 4);
//        bitwiseLeftShift(-1, 1);
//        bitwiseLeftShift(-1, 2);
        bitwiseRightShift(33, 1);
        bitwiseRightShift(33, 4);
//        bitwiseRightShift(-2, 1);
//        bitwiseRightShift(-2, 4);
//        System.out.println(33/2);
//        System.out.println(Math.ceil(4.9));
//        System.out.println(Math.floor(4.9));
        System.out.println(Integer.toBinaryString(33));
    }

    /**
     * 3 : 00000011 = 2^1 * 1 + 2^0 * 1 = 2 + 1 = 3
     * 6 : 00000110
     *-------------
     * 2 : 00000010
     */
    public static void bitwiseAnd(int x, int y){
        System.out.println(x & y);
    }

    /**
     * 3 : 00000011
     * 6 : 00000110
     *-------------
     * 7 : 00000111
     */
    public static void bitwiseOr(int x, int y){
        System.out.println(x | y);
    }

    /**
     * 3 : 00000011
     * 6 : 00000110
     *-------------
     * 5 : 00000101
     */
    public static void bitwiseXor(int x, int y){
        System.out.println(x ^ y);
    }

    /**
     *  x = 00000001
     * ~x = 11111110 (2^32 - 1 - 1)
     * For negative number the leading bit is set bit
     *  2's complement -x = 2^32 - x
     * 3 : 00000011
     * 6 : 00000110
     *-------------
     * 5 : 00000101
     */
    public static void bitwiseNot(int x){
        System.out.println(~x);
    }

    /**
     * x = 3  :==> 00000011
     * x << 1 :==> 00000110 ==> 6
     * x << 2 :==> 00001100 ==> 12
     * x << 4 :==> 00110000 ==> 48
     *
     *
     * if there are no overflow
     * x << y <==> x * 2^y
     */
    public static void bitwiseLeftShift(int x, int y){
        System.out.println(x << y);
    }

    /**
     * x = 33 :==> 000...100001
     * x >> 1 :==> 000...010000 ==> 16
     * x >> 4 :==> 000...000010 ==> 2
     *
     * Signed Right Shift
     * x = -2 :==> 111...11110 (2^32 -2)
     * x >> 1 :==> 111...11111 ==> -1
     * x >> 4 :==> 111...11111 ==> -1
     *
     * if there are no overflow
     *  x >> y <==> x / 2^y
     */
    public static void bitwiseRightShift(int x, int y){
        System.out.println(x >> y);
    }
}
