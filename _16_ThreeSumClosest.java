public class _16_ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == target) {
                        return target;
                    }
                    else {
                        int sum = (nums[i] + nums[j] + nums[k]);
                        if (Math.abs(sum - target) < Math.abs(closest - target)) {
                            closest = sum;
                        }
                    }
                    
                }
            }
        }

        return closest;
    }
}
