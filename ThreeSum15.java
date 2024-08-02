// package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum15 {
    public static void main(String[] args) {
        int[] nums = {3, 0, -2, -1, 1, 2};
        printArrayList(threeSum(nums));
        
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        

        return l;
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

    public static void printArrayList(List<List<Integer>> l) {
        for (List<Integer> a : l) {
            for (Integer n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
