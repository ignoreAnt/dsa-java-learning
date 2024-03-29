package com.aakash.dsa.strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(reverse("hello"));
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindromeV2("malayalam"));
    }

    public static boolean isPalindromeV2(String str){
        int i = 0;
        int j = str.length() - 1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
        // TC : O(n/2) ==> O(n)
        // AS : O(1)
    }
    public static boolean isPalindrome(String str){
        return str.equals(reverse(str));
        // Time complexity : O(n)
        // Auxiliary Space : O(n)
    }

    public static String reverse(String str){
        char[] chars = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;

        while (i < j){
            swap(i, j , chars);
            i++;
            j--;
        }

        return new String(chars);
    }

    public static void swap(int a, int b, char[] chars){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

    public static <T> void swap(int a, int b, T[] chars){
        T temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
}
