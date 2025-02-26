package com.aakash.dsa.sorting.instruction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> intervalListOne = new ArrayList<>(List.of(
                new Interval(1, 3),
                new Interval(2, 4),
                new Interval(5, 7),
                new Interval(6, 8)
        ));

        List<Interval> intervalListTwo = new ArrayList<>(List.of(
                new Interval(7, 9),
                new Interval(6, 10),
                new Interval(4, 5),
                new Interval(1, 3),
                new Interval(2, 4)
        ));


        System.out.println(intervalListOne);
        System.out.println(mergeInterval(intervalListOne));
        System.out.println(intervalListTwo);
        System.out.println(mergeInterval(intervalListTwo));
    }



    public static List<Interval> mergeInterval(List<Interval> list){
        List<Interval> result = new ArrayList<>();
        boolean[] merged = new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if (merged[i]) {
                continue;
            }

            int start = list.get(i).start;
            int end = list.get(i).end;

            for (int j = i + 1; j < list.size(); j++) {
                if (!merged[i] && list.get(j).start <= end && list.get(j).end >= end){
                    start = Math.min(start, list.get(j).start);
                    end = Math.max(end, list.get(j).end);
                    merged[j] = true;
                }
            }

            result.add(new Interval(start, end));
        }


        return result;
    }

    public static class Interval implements Comparable<Interval> {
        int start;
        int end;

        Interval() {
            this.start = 0;
            this.end = 0;
        }

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval another) {
            return this.start - another.start;
        }

        @Override
        public String toString() {
            return "{" +
                    "start=" + start +
                    "; end=" + end +
                    '}';
        }
    }
}
