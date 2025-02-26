package com.aakash.dsa.sorting.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervalsP {
    public static void main(String[] args) {
            List<Interval> intervals = new ArrayList<>(
                    List.of(new Interval(1, 3),
                            new Interval(2, 6),
                            new Interval(8, 10),
                            new Interval(15, 18)

                    ));

            List<Interval> intervals1 = new ArrayList<>(
                    List.of(new Interval(4, 5),
                            new Interval(1, 4)

                    ));

            List<Interval> intervals2 = new ArrayList<>(
                    List.of(new Interval(1, 4),
                            new Interval(0, 2),
                            new Interval(3, 5)

                    ));

        System.out.println(intervals);
        System.out.println(mergeIntervals(intervals));

        System.out.println(intervals1);
        System.out.println(mergeIntervals(intervals1));

        System.out.println(intervals2);
        System.out.println(mergeIntervals(intervals2));
//
//        System.out.println(intervals2);
//        System.out.println(mergeIntervalsV2(intervals2));

//        System.out.println(intervals2);
//        System.out.println(mergeIntervalsV3(intervals2));

    }

    public static List<Interval> mergeIntervals(List<Interval> list){
        List<Interval> result = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                // Check if intervals overlap
                int firstStart = list.get(i).start;
                int firstEnd = list.get(i).end;

                int secondFirst = list.get(j).start;
                int secondEnd = list.get(j).end;

//                [{1, 4}, {0, 2}, {3, 5}]
                if (firstStart <= secondEnd && firstEnd >= secondFirst){
                    // merge the intervals
                    int newStart = Math.min(firstStart, secondFirst);
                    int newEnd = Math.max(firstEnd, secondEnd);
                    result.add(new Interval(newStart, newEnd));
                }
            }
        }

        return result;
    }

    public static List<Interval> mergeIntervalsV2(List<Interval> intervals) {
        // List to hold merged intervals
        List<Interval> result = new ArrayList<>();
        boolean[] merged = new boolean[intervals.size()]; // Tracks already merged intervals

        for (int i = 0; i < intervals.size(); i++) {
            if (merged[i]) continue; // Skip already merged intervals
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;

            for (int j = i + 1; j < intervals.size(); j++) {
                if (!merged[j]) {
                    // Check for overlap: (start1 ≤ end2) && (end1 ≥ start2)
                    if (start <= intervals.get(j).end && end >= intervals.get(j).start) {
                        // Merge intervals: Take min of starts and max of ends
                        start = Math.min(start, intervals.get(j).start);
                        end = Math.max(end, intervals.get(j).end);
                        merged[j] = true; // Mark interval as merged
                    }
                }
            }

            // Add merged interval to result
            result.add(new Interval(start, end));
        }
        return result;
    }

    public static List<Interval> mergeIntervalsV3 (List<Interval> list){


        Collections.sort(list);
        System.out.println(list);

        List<Interval> result = new ArrayList<>();

        result.add(list.get(0));


        for (int i = 1; i < list.size(); i++) {
            Interval lastMergedInterval = result.get(0);
            Interval currentInterval = list.get(i);
            // Check if intervals overlap
            int firstStart = lastMergedInterval.start;
            int firstEnd = lastMergedInterval.end;

            int secondStart = currentInterval.start;
            int secondEnd = currentInterval.end;

//                [{1, 4}, {0, 2}, {3, 5}]
//                [{0, 2}, {1, 4}, {3, 5}]
            if (firstStart <= secondEnd && firstEnd >= secondStart){
                // merge the intervals
                int newStart = Math.min(firstStart, secondStart);
                int newEnd = Math.max(firstEnd, secondEnd);
                lastMergedInterval.start = newStart;
                lastMergedInterval.end = newEnd;

            }else{
                result.add(currentInterval);
            }
        }
        
        return result;
    }



    public static class Interval implements Comparable<Interval>{

        private int start;
        private int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval o) {
//            return this.start - o.start;
            return Integer.compare(this.start, o.start);
        }

        @Override
        public String toString() {
            return "{" + start +
                    ", " + end +
                    "}";
        }
    }
}
