package com.aakash.dsa.sorting.complete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {
    public static void main(String[] args) {
        // Create a list of students with multiple fields
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 102, 23, "CS"));
        students.add(new Student("Bob", 101, 22, "IT"));
        students.add(new Student("Charlie", 103, 23, "CS"));
        students.add(new Student("Alice", 104, 22, "IT"));
        students.add(new Student("Bob", 105, 24, "CS"));

        // Sort the list using Comparable
        students.sort(Comparator.comparing(student -> student.name));
        System.out.println(students);

        // Sort the list using Comparator
        students.sort(Comparator.comparing(student -> student.enrollmentNumber));
        System.out.println(students);

        // Sort the list using multiple fields
        students.sort(Comparator.comparing((Student student) -> student.name)
                .thenComparingInt((Student student) -> student.enrollmentNumber).reversed());
        System.out.println(students);
    }

    // Student class definition with multiple fields
    public static class Student {
        String name;
        int enrollmentNumber;
        int age;
        String department;

        // Constructor
        public Student(String name, int enrollmentNumber, int age, String department) {
            this.name = name;
            this.enrollmentNumber = enrollmentNumber;
            this.age = age;
            this.department = department;
        }

        @Override
        public String toString() {
            return name + " (" + enrollmentNumber + ", Age: " + age + ", Dept: " + department + ")";
        }
    }

}
