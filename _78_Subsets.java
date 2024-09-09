import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _78_Subsets {
        public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, l, new ArrayList<>(), 0);
        return l;
    }

    public void helper(int[] nums, List<List<Integer>> l, List<Integer> temp, int count) {
        l.add(new ArrayList<>(temp));
        for (int i = count; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(nums, l, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
