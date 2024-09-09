import java.util.HashMap;
import java.util.Map;

public class _41_FirstMissingPositive {
        public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num:nums) {
            map.put(num, 1);
        }
        int count = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!map.containsKey(count)) {
                return count;
            }
            count++;
        }
        return count;
        
    }
}
