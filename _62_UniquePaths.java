public class _62_UniquePaths {
    public int uniquePaths(int m, int n) {
        double res = 1.0;
        for (int i = (m+n-2); i >= m; i--) {
            res *= i;
            res /= (i - m + 1);
        }

        return (int) Math.round(res);
    }
}
