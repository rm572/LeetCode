import java.util.Arrays;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int an[] = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    an[0] = i;
                    an[1] = j;
                    break;
                }
            }
        }
        return an;
    }
}