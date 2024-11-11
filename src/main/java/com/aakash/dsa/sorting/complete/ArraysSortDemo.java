package com.aakash.dsa.sorting.complete;

import java.util.*;

public class ArraysSortDemo {
    public static void main(String[] args) {
        // Sorting an array of primitives
        int[] intArray = {3, 1, 4, 1, 5, 9};
        Arrays.sort(intArray); // Uses Dual-Pivot Quicksort
        System.out.println(Arrays.toString(intArray));

        // Sorting an array of non-primitives (objects)
        String[] stringArray = {"banana", "apple", "cherry"};
        Arrays.sort(stringArray); // Uses TimSort
        System.out.println(Arrays.toString(stringArray));

        // Sorting a collection
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        list.sort(Collections.reverseOrder()); // Uses TimSort
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 101));
        students.add(new Student("Bob", 104));
        students.add(new Student("Alice", 102));
        students.add(new Student("Charlie", 103));
        System.out.println(students);

        // Sorting by enrollment number
        students.sort(Comparator.comparingInt(Student::getEnrollmentNumber).thenComparing(Comparator.reverseOrder()));
        System.out.println(students);

        // Sorting by name
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);


    }

    private static class Student implements Comparable<Student>{
        private String name;
        private int enrollmentNumber;

        public Student(String name, int enrollmentNumber) {
            this.name = name;
            this.enrollmentNumber = enrollmentNumber;
        }

        public int getEnrollmentNumber() {
            return enrollmentNumber;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", enrollmentNumber=" + enrollmentNumber +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return this.enrollmentNumber - o.enrollmentNumber;
        }
    }
}
