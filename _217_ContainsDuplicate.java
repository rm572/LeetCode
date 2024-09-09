import java.util.HashMap;
import java.util.Map;

public class _217_ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }

            map.put(nums[i], 1);
        }
        return false;

    }
}
