// package LeetCode;

public class _4_MedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] total = new int[n1 + n2];
        int count = 0;

        while (i1 < n1 && i2 < n2) {
            if (nums1[i1] < nums2[i2]) {
                total[count] = nums1[i1];
                i1++;
            }
            else {
                total[count] = nums2[i2];
                i2++;
            }

            count++;
        }

        if (i1 == n1) {
            for (int i = i2; i < n2; i++) {
                total[i1 + i] = nums2[i];
            }
        }
        else if (i2 == n2) {
            for (int i = i1; i < n1; i++) {
                total[i2 + i] = nums1[i];
            }
        }

        return (total.length % 2 == 1 ? (double) total[total.length/2] : (double) (total[total.length/2] + 
            total[total.length/2 - 1])/2);
    }
}
