

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FindPathInGraph1971 {
    public static void main(String[] args) {
        //true
        int[][] e = {{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}};
        System.out.println(validPath(10, e, 5, 9));

        //false
        // int[][] e2 = { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } };
        // System.out.println(validPath(6, e2, 0, 5));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        HashSet<int[]> visited = new HashSet<>();
        Queue<int[]> unvisited = new LinkedList<>();

        for (int[] paths : edges) {
            // unvisited.clear();
            if (paths[0] == source || paths[1] == source) {
                unvisited.add(paths);
                
                while (!unvisited.isEmpty()) {
                    int[] cur = unvisited.remove();
                    printCur(cur);
                    if (visited.contains(cur)) {
                        continue;
                    }
                    visited.add(cur);
                    int a = cur[0];
                    int b = cur[1];

                    if (a == destination || b == destination) {
                        return true;
                    }
                    System.out.print("Visited: ");
                    printVisited(visited);
                    // System.out.println("to: " + to);
                    // System.out.println("here: " + here);
                    for (int[] p : edges) {
                        System.out.print("P val --> ");
                        printCur(p);
                        if ((p[0] == a || p[1] == a) && !visited.contains(p)) {
                            unvisited.add(p);
                        }
                        if ((p[0] == b || p[1] == b) && !visited.contains(p)) {
                            unvisited.add(p);
                        }
                    }
                    System.out.println();
                    
                    printUnvisited(unvisited);
                }
            }
        }
        System.out.print("unvisited end: "); 
        printUnvisited(unvisited);
        System.out.println("false: very end");
        return false;
    }

    public static void printVisited(HashSet<int[]> set) {
        System.out.print("Unvisited: ");
        for (int[] n : set) {
            System.out.print("[" + n[0] + ", " + n[1] + "]  ");
        }
        System.out.println();

    }

    public static void printUnvisited(Queue<int[]> unvisited) {
        unvisited.add(null);
        int[] a = unvisited.remove();
        while(!(a == null)) {
            System.out.print("[" + a[0] + ", " + a[1] + "]  ");
            unvisited.add(a);
            a = unvisited.remove();
        }
        System.out.println();
    }

    public static void printCur(int[] cur) {
        System.out.print("Cur: ");
        System.out.print("[" + cur[0] + ", " + cur[1] + "]  ");
        System.out.println();
    }
}
