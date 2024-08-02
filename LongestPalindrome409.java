import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public static void main(String[] args) {

    }

    public static int longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
            String let = s.substring(i, i+1);
            if (!map.containsKey(let)) {
                map.put(let, 1);
            }
            else {
                map.put(let, map.get(let)+1);
            }
        }

        boolean hasOdd = false;
        int total = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count % 2 == 1 && hasOdd == false) {
                total += count;
                hasOdd = true;
            }
            else if (count % 2 == 1 && hasOdd == true) {
                total += (count-1);
            }
            else {
                total += count;
            }

        }
        return total;

    }
}
