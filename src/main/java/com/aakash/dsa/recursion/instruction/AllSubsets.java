package com.aakash.dsa.recursion.instruction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ### Generate All Subsets
 *
 * **Problem Description:**
 *
 * Given an array of distinct integers, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * **Constraints:**
 * - The length of the array is between 1 and 10.
 * - The elements of the array are all distinct.
 *
 * **Example 1:**
 * ```
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]]
 * ```
 *
 * **Example 2:**
 * ```
 * Input: nums = [0]
 * Output: [[],[0]]
 * ```
 *
 * **Function Signature:**
 * ```
 * public List<List<Integer>> subsets(int[] nums);
 * ```
 * "ab"
 * 'a' -> 2 choices --> 1) include in set ; 2) Don't include in the set
 * 'b' -> 2 choices --> 1) include in set ; 2) Don't include in the set
 * 2 * 2 = 2^2 = 4 choices
 * "abc"
 * 'a' -> 2 choices --> 1) include in set ; 2) Don't include in the set
 * 'b' -> 2 choices --> 1) include in set ; 2) Don't include in the set
 * 'c' -> 2 choices --> 1) include in set ; 2) Don't include in the set
 *  2 * 2 = 2^3 = 8 choices
 *
 *  "a"
 *  1) "" 1) include 'b' = 'b' 2) exclude 'b' = ""
 *  2) "a" 1) include 'b' = 'ab' 3) exclude 'b' = 'a'
 *  "ab"
 *  1) ""
 *  2) "a"
 *  3) "b"
 *  4) "ab"
 *  number of choices = 2 * 2
 *  "abc"
 *  1) "" --> 1) include 'c' = 'c' 2) exclude 'c' = ""
 *  2) "a" --> 1) include 'c' = 'ac' 2) exclude 'c' = 'a'
 *  3) "b" --> 1) include 'c' = 'bc' 2) exclude 'c' = 'b'
 *  4) "ab" ---> 1) include 'c' = 'abc' 2) exclude 'c' = 'ab'
 *  number of choices = 2 * 2 * 2
 *  "abc"=-> 1) remove 'c' = "ab" 2) don't remove = "abc"
 *
 *  s0s1s2...s(n-1)s(n) where s0,s1, ...s(n-1), s(n) are characters in the string
 *  if we have all the sets available for s0s1...s(n-1), then for s(n) we have twp choices either include or exclude
 *
 *  f(s,index, current)
 *  --> f(s, index + 1, current)
 *  --> f(s, index + 1, current + s.charAt(index))
 *
 *  base condition:
 *      Do it till the length of the string
 *      index = string length
 */

/**
 * "asdas" --> adas, as, asd
 */
public class AllSubsets {

    public static void main(String[] args) {

        String s1 = "abc";
        System.out.println(s1.substring(0, s1.length() - 1));
        System.out.println(generateSubsets(s1)); // ["", "a", "b", "c", "ab", "ac", "bc", "abc"]

        String s2 = "a";
        System.out.println(generateSubsets(s2)); // ["", "a"]

        String s3 = "xyz";
        System.out.println(generateSubsets(s3)); // ["", "x", "y", "z", "xy", "xz", "yz", "xyz"]

    }

    public static List<String> generateSubsets(String s) {
        List<String> result = new ArrayList<>();
        generateSubsetsHelper(s, 0, "", result);
        return result;
    }

    private static void generateSubsetsHelper(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Include the current character
        generateSubsetsHelper(s, index + 1, current + s.charAt(index), result);
        // Exclude the current character
        generateSubsetsHelper(s, index + 1, current, result);
    }

    private static void printSubSet(String str, String curr, int index) {
        if(index == str.length()){
            System.out.print(curr+" ");
            return;
        }

        printSubSet(str, curr, index + 1);
        printSubSet(str, curr + str.charAt(index), index + 1);
    }
}
