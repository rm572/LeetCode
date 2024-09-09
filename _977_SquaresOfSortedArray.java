public class _977_SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        return sort(nums);
    }

    public int[] sort(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            int min = nums[i] * nums[i];
            int index = i;
            for (int j = i+1; j < len; j++) {
                int n2 = nums[j] * nums[j];
                if (n2 < min) {
                    min = n2;
                    index = j;
                }
            }
            nums[index] = nums[i];
            nums[i] = min;
        }
        nums[len-1] = nums[len-1] * nums[len-1];

        return nums;
    }
}
