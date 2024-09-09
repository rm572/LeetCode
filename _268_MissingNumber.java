public class _268_MissingNumber {
    public int missingNumber(int[] nums) {
        int[] a = new int[nums.length+1];
        for (int i : nums) {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != i) {
                return i;
            }
        }
        return 0;
    }
}
