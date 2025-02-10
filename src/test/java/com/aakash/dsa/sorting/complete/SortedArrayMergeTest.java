package com.aakash.dsa.sorting.complete;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SortedArrayMergeTest {
    private static Stream<Arguments> mergeTestCases() {
        return Stream.of(
                // Test case: Two sorted arrays
                Arguments.of(new TestCase("Two sorted arrays",
                        new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8})),

                // Test case: First array is empty
                Arguments.of(new TestCase("First array is empty",
                        new int[]{}, new int[]{2, 4, 6, 8}, new int[]{2, 4, 6, 8})),

                // Test case: Second array is empty
                Arguments.of(new TestCase("Second array is empty",
                        new int[]{1, 3, 5, 7}, new int[]{}, new int[]{1, 3, 5, 7})),

                // Test case: Both arrays are empty
                Arguments.of(new TestCase("Both arrays are empty",
                        new int[]{}, new int[]{}, new int[]{})),

                // Test case: Duplicate elements
                Arguments.of(new TestCase("Duplicate elements",
                        new int[]{1, 3, 5, 7}, new int[]{2, 3, 6, 8}, new int[]{1, 2, 3, 3, 5, 6, 7, 8})),

                // Test case: Negative numbers
                Arguments.of(new TestCase("Negative numbers",
                        new int[]{-1, 3, 5, 7}, new int[]{-2, 2, 6, 8}, new int[]{-2, -1, 2, 3, 5, 6, 7, 8})),

                // Test case: Single element arrays
                Arguments.of(new TestCase("Single element arrays",
                        new int[]{1}, new int[]{2}, new int[]{1, 2})),

                // Test case: Multiple single element arrays
                Arguments.of(new TestCase("Multiple single element arrays",
                        new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6})),

                // Test case: Large arrays
                Arguments.of(new TestCase("Large arrays",
                        new int[]{1, 3, 5, 7, 9, 11, 13, 15}, new int[]{2, 4, 6, 8, 10, 12, 14, 16}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}))
        );
    }

    @ParameterizedTest
    @MethodSource("mergeTestCases")
    @DisplayName("Merge Sorted Arrays")
    void merge(TestCase testCase) {
        int[] arr1 = testCase.arr1;
        int[] arr2 = testCase.arr2;
        int[] expected = testCase.expected;

        int[] result = SortedArrayMerge.merge(arr1, arr2);
        Assertions.assertThat(result).isEqualTo(expected);
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