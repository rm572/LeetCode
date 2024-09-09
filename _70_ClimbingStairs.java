public class _70_ClimbingStairs {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int x = a;
            a = b;
            b = a + x;
        }
        return b;

    }
}
