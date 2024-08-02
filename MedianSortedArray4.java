// package LeetCode;

public class MedianSortedArray4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] total = new int[n1 + n2];
        System.out.println("total.length: " + total.length);
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

        print(total);
        System.out.println("i1 = " + i1);
        System.out.println("n1 = " + n1);
        System.out.println();
        System.out.println("i2 = " + i2);
        System.out.println("n2 = " + n2);

        if (i1 == n1) {
            System.out.println("i1");
            for (int i = i2; i < n2; i++) {
                total[i1 + i] = nums2[i];
            }
        }
        else if (i2 == n2) {
            System.out.println("i2");
            for (int i = i1; i < n1; i++) {
                System.out.println("nums1: " + nums1[i]);
                System.out.println("total: " + total[i2 + i]);
                System.out.println("Loop i2: " + i2);
                System.out.println("Loop i: " + i);
                System.out.println("Loop i2 + i: " + (i2+i));
                total[i2 + i] = nums1[i];
            }
        }

        print(total);

        return (total.length % 2 == 1 ? (double) total[total.length/2] : (double) (total[total.length/2] + 
            total[total.length/2 - 1])/2);
    }

    public static void print(int[] a) {
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
