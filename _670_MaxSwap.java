public class _670_MaxSwap {
    public static void main(String[] args) {
        int a = 2736;
        int b = 9973;
        System.out.println(maximumSwap(a));
        System.out.println(maximumSwap(b));
    }

    public static int maximumSwap(int num) {
        String n = "" + num;
        int maxInt = num;
        for (int i = 0; i < n.length()-1; i++) {
            for (int j = i + 1; j < n.length(); j++) {
                if (n.charAt(i) < n.charAt(j)) {
                    String newNum = n.substring(0, i) + n.substring(j, j+1) + 
                                    n.substring(i+1, j) + n.substring(i, i+1) + n.substring(j+1);
                    int newInt = Integer.parseInt(newNum);
                    if (newInt > maxInt) {
                        maxInt = newInt;
                    }
                }
            }
        }

        return maxInt;
    }
}
