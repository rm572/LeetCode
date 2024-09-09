public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Math.min(height[left], height[right]) * (right - left);
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
            int area = Math.min(height[left], height[right]) * (right - left);
            if (area > max) {
                max = area;
            }
        }
        return max;


    }
}
