package com.aakash.dsa.graphs.complete;

import java.util.*;

public class ShortestPathInUnweightedGraph {
    public static void main(String[] args) {
        /*
                0
               / \
              1---2
               \ /
                3
         */

        Map<Integer, List<Integer>> adjList = Map.of(
                0, List.of(1, 2),
                1, List.of(0, 2, 3),
                2, List.of(0, 1, 3),
                3, List.of(1, 2),
                4, List.of()
        );

        System.out.println(shortestDistanceFromSource(0, adjList));

    }

    public static <T> Map<T, Integer> shortestDistanceFromSource(T source, Map<T, List<T>> adjList){
       Map<T, Integer> distances = new HashMap<>();
       for (T vertex : adjList.keySet()){
           distances.put(vertex, -1);
       }

       distances.put(source, 0);

       Queue<T> queue = new LinkedList<>();
       queue.add(source);

       while (!queue.isEmpty()){
           T current = queue.poll();

           for (T neighbour : adjList.getOrDefault(current, new ArrayList<>())){
               if (distances.get(neighbour) == -1){
                   distances.put(neighbour, distances.get(current) + 1);
                   queue.add(neighbour);
               }
           }
       }

       return distances;

    }
}
