package com.aakash.dsa.strings.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSortingHR {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("6",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5")) ;
        System.out.println(bigSorting(strings));
    }

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        unsorted.sort(Comparator.comparingInt(String::length).thenComparing(o -> o));
        return unsorted;
    }
}
