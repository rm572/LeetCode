// package LeetCode;

public class LeetCodeBank1716 {
    public static void main(String[] args) {
        System.out.print("Should be 96: ");
        System.out.println(totalMoney(20));

    }

    public static int totalMoney(int n) {
        int sum = 0;
        int ds = 0;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                ds++;
            }
            sum += (ds + (i % 7));
            System.out.print((ds + (i % 7)) + " ");
 
            
        }
        System.out.println();
        return sum;
    }
}
