import java.util.HashMap;
import java.util.Map;

public class _2441_LargestPosIntWithNegative {
        public int findMaxK(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = -1;
        for (int n : nums) {
            if (map.containsKey(n * (-1))) {
                map.put(n * -1, n);
                if ((int) Math.abs(n) > max) {
                    max = (int) Math.abs(n);
                }
                
            }
            else {
                map.put(n, 0);
            }
        }

        return max;

    }
}
