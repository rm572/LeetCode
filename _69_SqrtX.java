public class _69_SqrtX {
    public int mySqrt(int x) {
        long num;
        if (x < Math.pow(2, 10)) {
            num = 0;
        }
        else if (x < Math.pow(2, 20)) {
            num = 32;
        }
        else if (x < Math.pow(2, 30)) {
            num = 1024;
        }
        else {
            num = 32768;
        }
        while (num * num < x) {
            num++;
        }
        return (num * num == x) ? (int) num : (int) num-1;
    }
}
