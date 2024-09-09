import java.util.HashMap;

public class _1791_CenterOfStarGraph {
        public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = edges.length;

        for (int[] nums : edges) {
            int a = nums[0];
            int b = nums[1];

            if (!map.containsKey(a)) {
                map.put(a, 1);
            }
            else {
                map.put(a, map.get(a)+1);
            }
            if (!map.containsKey(b)) {
                map.put(b, 1);
            }
            else {
                map.put(b, map.get(b)+1);
            }

            if (map.get(a) == len) {
                return a;
            }
            if (map.get(b) == len) {
                return b;
            }
        }
        return 0;
    }
}
