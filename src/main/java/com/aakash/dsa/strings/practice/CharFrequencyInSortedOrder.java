package com.aakash.dsa.strings.practice;

import java.util.*;

public class CharFrequencyInSortedOrder {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(charFrequency(str));
        charFrequencyV2(str);

    }


    public static void charFrequencyV2(String str){
        int[] alphabets = new int[26]; // to char frequency
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            alphabets[index]++;
        }

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > 0){
                char ch = (char) (i + 'a');
                System.out.println(ch + "-->" + alphabets[i]);
            }
        }
    }
    public static Map<Character, Integer> charFrequency(String str){
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (result.containsKey(charAt)){
                result.put(charAt, result.get(charAt) + 1);
            }else{
                result.put(charAt, 1);
            }
        }

        // For sorting by keys
        List<Character> characters = new ArrayList<>(result.keySet());
        Collections.sort(characters);


        Map<Character, Integer> sortedKeys = new LinkedHashMap<>();
        for (Character character : characters) {
            sortedKeys.put(character, result.get(character));
        }

        // For sorting by values
        List<Map.Entry<Character, Integer>> integers = new ArrayList<>(result.entrySet());
        integers.sort(Comparator.comparing(Map.Entry::getValue));

        Map<Character, Integer> sortedValues = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> integer : integers) {
            sortedValues.put(integer.getKey(), integer.getValue());
        }

        return sortedValues;
    }
}
