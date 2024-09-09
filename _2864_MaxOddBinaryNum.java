public class _2864_MaxOddBinaryNum {
    public String maximumOddBinaryNumber(String s) {
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);
            if (str.equals("1")) {
                one++;
            }
        }
        int zero = s.length() - one;
        String res = "";
        for (int i = 0; i < one-1; i++) {
            res += "1";
        }
        for (int i = 0; i < zero; i++) {
            res += "0";
        }
        res += "1";
        return res;
    }
}
