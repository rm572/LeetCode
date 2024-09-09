import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _12_IntToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        int digits = String.valueOf(num).length();
        String res = "";
        while (digits > 0) {
            int zeroes = (int) Math.pow(10, digits - 1);
            int n = num/zeroes;
            if (n == 4 || n == 9) {
                res += map.get(n * zeroes);
            } 
            else {
                Queue<Integer> q = getSum5and1(n);
                while (!q.isEmpty()) {
                    res += (map.get(q.remove() * zeroes));
                }
            }
            digits--;
            num = num - (n * zeroes);
        }
        return res;
    }

    public Queue<Integer> getSum5and1(int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (n > 0) {
            if (n >= 5) {
                q.add(5);
                n -= 5;
            }
            else {
                q.add(1);
                n--;
            }
        }
        return q;
    }
}
