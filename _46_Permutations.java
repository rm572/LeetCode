import java.util.ArrayList;
import java.util.List;

public class _46_Permutations {
        public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        helper(nums, l, new ArrayList<>());
        return l;
    }

    public void helper(int[] nums, List<List<Integer>> l, List<Integer> temp) {
        if (temp.size() == nums.length) {
            l.add(new ArrayList<>(temp));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                    continue;
                }
                else {
                    temp.add(nums[i]);
                    helper(nums, l, temp);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
