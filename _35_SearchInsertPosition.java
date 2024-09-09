public class _35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length;
        int mid = (min + max)/2;
        while (true) {

            if (nums[mid] > target) {
                max = mid;
                mid = (min + max)/2;
            }
            else if (nums[mid] < target) {
                min = mid;
                mid = (min + max)/2;
            }
            else {
                return mid;
            }

            if (min == mid) {
                if (nums[min] < target) {
                    return min+1;
                }
                else {
                    return min;
                }
            }

            if (max == mid) {
                if (nums[mid] > target) {
                    return mid;
                }
                else {
                    return mid+1;
                }
            }
        }
    }
}
