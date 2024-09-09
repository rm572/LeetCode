import java.util.HashMap;
import java.util.Map;

public class _3_LongestSubStrNoRepeatChar {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 1;
        if(s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length()-1; i++) {
            String str = s.substring(i, i+1);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put(str, 1);
            for (int j = i+1; j < s.length(); j++) {
                String nextLet = s.substring(j, j+1);
                if (map.containsKey(nextLet)) {
                    if (map.size() > maxLen) {
                        maxLen = map.size();
                    }
                    break;
                }
                else {
                    map.put(nextLet, 1);
                } 
                if (map.size() > maxLen) {
                    maxLen = map.size();
                        
                }
            }

        }
        return maxLen;
    }
}
