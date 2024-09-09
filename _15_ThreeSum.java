// package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_ThreeSum {

    public List<List<Integer>> threeSum(int[] arr) {
       List<List<Integer>> nums = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } 
                else if (sum > 0) {
                    k--;
                } 
                else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    nums.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return nums;
    }

    //Runtime error
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> l = new ArrayList<>();
    //     for (int i = 0; i < nums.length - 2; i++) {
    //         for (int j = i + 1; j < nums.length - 1; j++) {
    //             for (int k = j + 1; k < nums.length; k++) {
    //                 if ((nums[i] + nums[j] + nums[k]) == 0) {
    //                     ArrayList<Integer> n = new ArrayList<>();
    //                     n.add(nums[i]);
    //                     n.add(nums[j]);
    //                     n.add(nums[k]);
    //                     Collections.sort(n);
    //                     if (!l.contains(n)) {
    //                         System.out.println("nums[i]: " + nums[i]);
    //                         System.out.println("nums[j]: " + nums[j]);
    //                         System.out.println("nums[k]: " + nums[k]);
    //                         System.out.println();
                            
    //                         l.add(n);
    //                     }
                        
    //                 }
                    
    //             }
    //         }
    //     }

    //     return l;
    // }
}
