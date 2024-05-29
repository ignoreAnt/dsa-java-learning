package com.aakash.dsa.recursion.instruction;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("adda", 0, 3));
        System.out.println(isPalindrome("ada", 0, 2));
    }

    /**
     * s0s1s2......s(n-2)s(n-1)
     * thinking recursively we can say
     * above will be palindrome if
     * s0 == s(n-1) && s1s2......s(n-2) is palindrome
     *
     * base case:
     * if n == 0 (for even length case -- abba)
     * or n == 1 (for odd length case -- aba)
     * return true
     */
    public static boolean isPalindrome(String str, int start, int end){
        if (start >= end){
            return true;
        }

        return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1)); // First condition is short circuit

        // TC : O(n)
        // AS : O(n)
    }

}
