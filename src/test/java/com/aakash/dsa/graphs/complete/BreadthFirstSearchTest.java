package com.aakash.dsa.graphs.complete;

import com.aakash.dsa.graphs.complete.BreadthFirstSearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreadthFirstSearchTest {

    @DisplayName("BFS Test Cases")
    @ParameterizedTest(name = "{index}: {0} BFS Traversal Test")
    @MethodSource("provideGraphsForBFS")
    void testBFS(String testName, int vertex, int[][] edges, int source, List<Integer> expected) {
        // Build graph from edges
        List<List<Integer>> adjList = BreadthFirstSearch.buildGraph(vertex, edges);

        // Perform BFS
        List<Integer> result = BreadthFirstSearch.bfs(vertex, adjList, source);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    // A static method that provides the arguments (input/output combinations) for the parameterized test
    static Stream<Arguments> provideGraphsForBFS() {
        return Stream.of(
                // 1. Empty graph
                Arguments.of("Empty Graph", 0, new int[][]{}, 0, List.of()),

                // 2. One vertex, no edges
                Arguments.of("Graph with One Vertex and No Edges", 1,
                        new int[][]{}, 0, List.of(0)),

                // 3. One vertex with self-loop
                Arguments.of("Graph with One Vertex and Self-Loop", 1,
                        new int[][]{{0, 0}}, 0, List.of(0)),

                // 4. Disconnected graph
                Arguments.of("Disconnected Graph", 3,
                        new int[][]{}, 0, List.of(0)),

                // 5. Chain-like structure
                Arguments.of("Chain Graph (Linear)", 5,
                        new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}, 0, List.of(0, 1, 2, 3, 4)),

                // 6. Complete graph
                Arguments.of("Complete Graph", 4,
                        new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3}}, 0, List.of(0, 1, 2, 3)),

                // 7. Cyclic graph
                Arguments.of("Cyclic Graph", 3,
                        new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, List.of(0, 1, 2)),

                // 8. Tree structure (Acyclic graph)
                Arguments.of("Tree Structure Graph", 5,
                        new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}}, 0, List.of(0, 1, 2, 3, 4)),

                // 9. Graph with multiple components
                Arguments.of("Graph with Multiple Components", 6,
                        new int[][]{{0, 1}, {1, 2}, {3, 4}}, 0, List.of(0, 1, 2)),

                // 10. Graph with isolated vertices
                Arguments.of("Graph with Isolated Vertices", 6,
                        new int[][]{{0, 1}, {1, 2}, {3, 4}}, 0, List.of(0, 1, 2)),

                // 11. Directed graph (as BFS normally handles undirected graphs, but we can test it with a directed graph too)
                Arguments.of("Directed Graph", 4,
                        new int[][]{{0, 1}, {1, 2}, {2, 3}}, 0, List.of(0, 1, 2, 3)),

                // 12. Large graph (example with 1000 nodes, this is just a small test, large cases need performance testing)
                Arguments.of("Large Graph (1000 nodes)", 1000,
                        new int[][]{{0, 1}, {1, 2}, {2, 3}, {998, 999}}, 0, List.of(0, 1, 2, 3))
        );
    }
}
