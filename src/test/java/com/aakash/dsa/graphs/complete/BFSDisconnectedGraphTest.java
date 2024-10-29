package com.aakash.dsa.graphs.complete;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BFSDisconnectedGraphTest {

    @DisplayName("BFS Traversal on Disconnected Graphs")
    @ParameterizedTest(name = "{0}: Expected={3}, V={1}, Edges={2}")
    @MethodSource("provideTestCases")
    public void testBFS(String testName, int V, int[][] edges, List<Integer> expectedTraversal) {
        // Build the graph
        List<List<Integer>> adjList = BFSOnDisconnectedGraphs.buildGraph(V, edges);

        // Perform BFS on the disconnected graph
        List<Integer> bfsTraversal = BFSOnDisconnectedGraphs.bfs(V, adjList);

        // Assert the result is as expected
        assertEquals(expectedTraversal, bfsTraversal, "Test failed for: " + testName);
    }

    // Method to provide test cases for BFS
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Test Case 1: Disconnected graph with two components
                Arguments.of("Two connected components", 5,
                        new int[][]{{0, 1}, {0, 2}, {3, 4}}, Arrays.asList(0, 1, 2, 3, 4)),

                // Test Case 2: Three isolated components
                Arguments.of("Three isolated components", 4,
                        new int[][]{{0, 1}}, Arrays.asList(0, 1, 2, 3)),

                // Test Case 3: Fully disconnected graph with no edges
                Arguments.of("Fully disconnected graph with no edges", 3,
                        new int[][]{}, Arrays.asList(0, 1, 2)),

                // Test Case 4: Single node with no edges
                Arguments.of("Single node with no edges", 1,
                        new int[][]{}, List.of(0)),

                // Test Case 5: Disconnected graph with isolated vertices
                Arguments.of("Disconnected graph with isolated vertices", 6,
                        new int[][]{{0, 1}, {1, 2}, {3, 4}}, Arrays.asList(0, 1, 2, 3, 4, 5)),

                // Test Case 6: Multiple edges but disconnected components
                Arguments.of("Multiple edges but disconnected components", 7,
                        new int[][]{{0, 1}, {2, 3}, {4, 5}}, Arrays.asList(0, 1, 2, 3, 4, 5, 6))
        );
    }
}
