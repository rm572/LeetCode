import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _844_uncommonWords {
        public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String[] s11 = s1.split(" ");
        String[] s22 = s2.split(" ");

        for (String s: s11) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s)+1);
            }
        }
        for (String s: s22) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s)+1);
            }
        }

        ArrayList<String> res = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[res.size()]);
        
    }
}
