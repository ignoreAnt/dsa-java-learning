package com.aakash.dsa.strings.complete;

public class PalindromeString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(reverse("hello"));
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("momaasadasdsa"));
        System.out.println(isPalindromeV2("malayalam"));
        System.out.println(isPalindromeV2("malaalam"));

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
    }

    public static boolean isPalindromeV2(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
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

        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            swap(start, end , chars);
            start++;
            end--;
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
