import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class _1971_FindPathInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        HashSet<int[]> visited = new HashSet<>();
        Queue<int[]> unvisited = new LinkedList<>();

        for (int[] paths : edges) {
            if (paths[0] == source || paths[1] == source) {
                unvisited.add(paths);
            
                while (!unvisited.isEmpty()) {
                    int[] cur = unvisited.remove();
                    if (visited.contains(cur)) {
                        continue;
                    }
                    visited.add(cur);
                    int a = cur[0];
                    int b = cur[1];

                    if (a == destination || b == destination) {
                        return true;
                    }
                    for (int[] p : edges) {
                        if ((p[0] == a || p[1] == a) && !visited.contains(p)) {
                            unvisited.add(p);
                        }
                        if ((p[0] == b || p[1] == b) && !visited.contains(p)) {
                            unvisited.add(p);
                        }
                    }
                }
            }
        }
        return false;
    }
}
