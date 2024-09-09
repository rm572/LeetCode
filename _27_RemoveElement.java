public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int notVal = nums.length-1;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            while (notVal >= 0 && nums[notVal] == val) {
                notVal--;
            }
            if (notVal < 0 || notVal < i) {
                return len;
            }

            if (nums[i] != val) {
                len++;
            }
            else{
                nums[i] = nums[notVal];
                nums[notVal] = val;
                len++;
                // notVal--;
            }
        }

        return len;
    }
}
