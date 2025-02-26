package com.aakash.dsa.sorting.complete;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;
import org.assertj.core.api.Assertions;

import java.util.stream.Stream;

public class IntersectionSortedArraysTest {

    private static Stream<Arguments> intersectionTestCases() {
        return Stream.of(
                // Test case: Two arrays with common elements
                Arguments.of(new TestCase("Two arrays with common elements",
                        new int[]{1, 2, 4, 5, 6}, new int[]{2, 3, 5, 7}, new int[]{2, 5})),

                // Test case: No common elements
                Arguments.of(new TestCase("No common elements",
                        new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{})),

                // Test case: Identical arrays
                Arguments.of(new TestCase("Identical arrays",
                        new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 2, 3})),

                // Test case: First array is empty
                Arguments.of(new TestCase("First array is empty",
                        new int[]{}, new int[]{1, 2, 3}, new int[]{})),

                // Test case: Second array is empty
                Arguments.of(new TestCase("Second array is empty",
                        new int[]{1, 2, 3}, new int[]{}, new int[]{})),

                // Test case: Both arrays are empty
                Arguments.of(new TestCase("Both arrays are empty",
                        new int[]{}, new int[]{}, new int[]{})),

                // Test case: Arrays with duplicates
                Arguments.of(new TestCase("Arrays with duplicates",
                        new int[]{1, 1, 2, 2, 3, 3}, new int[]{2, 2, 3, 3, 4, 4}, new int[]{2, 3})),

                // Test case: Single element arrays
                Arguments.of(new TestCase("Single element arrays",
                        new int[]{1}, new int[]{1}, new int[]{1})),

                // Test case: No intersection for single element arrays
                Arguments.of(new TestCase("No intersection for single element arrays",
                        new int[]{1}, new int[]{2}, new int[]{})),

                // Test case: Negative numbers
                Arguments.of(new TestCase("Negative numbers",
                        new int[]{-3, -2, -1, 0, 1}, new int[]{-2, 0, 2}, new int[]{-2, 0})),

                // Test case: Large arrays with intersection
                Arguments.of(new TestCase("Large arrays with intersection",
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{5, 6, 7, 10, 11}, new int[]{5, 6, 7})),

                // Test case: Large arrays with no intersection
                Arguments.of(new TestCase("Large arrays with no intersection",
                        new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}, new int[]{}))
        );
    }

    @ParameterizedTest
    @MethodSource("intersectionTestCases")
    @DisplayName("Intersection of Sorted Arrays")
    void intersection(TestCase testCase) {
        int[] arr1 = testCase.arr1;
        int[] arr2 = testCase.arr2;
        int[] expected = testCase.expected;

        int[] result = IntersectionSortedArrays.intersection(arr1, arr2);
        Assertions.assertThat(result).containsExactly(expected);
    }

    private static class TestCase {
        String description;
        int[] arr1;
        int[] arr2;
        int[] expected;

        public TestCase(String description, int[] arr1, int[] arr2, int[] expected) {
            this.description = description;
            this.arr1 = arr1;
            this.arr2 = arr2;
            this.expected = expected;
        }

        @Override
        public String toString() {
            return description;
        }
    }
}
