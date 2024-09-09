import java.util.LinkedHashMap;
import java.util.Map;

public class _26_RemoveDuplicatesFromSortedArray {
        public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        int x = 0;
        for (Map.Entry<Integer, Integer> me :map.entrySet()) {
            nums[x] = me.getKey();
            x++;
        }
        return map.size();
    }
}
