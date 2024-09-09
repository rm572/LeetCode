import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1002_FindCommonChars {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};

        List<String> l = commonChars(words);

        for (String w : l) {
            System.out.print(w + " ");
        }
    }

    public static List<String> commonChars(String[] words) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> compareMap = new HashMap<String, Integer>();
        

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                String let = word.substring(j, j+1);
                if (i == 0) {
                    if (!map.containsKey(let)) {
                        map.put(let, 1);
                    }
                    else {
                        map.put(let, map.get(let)+1);
                    }
                }
                else {
                    if (!map.containsKey(let)) {
                        continue;
                    }

                    else if (!compareMap.containsKey(let)) {
                        compareMap.put(let, 1);
                    }
                    else {
                        compareMap.put(let, compareMap.get(let)+1);
                    }

                }

            }

            for (Map.Entry<String, Integer> entry : compareMap.entrySet()) {
                int count = entry.getValue();
                String let = entry.getKey();

                if (count < map.get(let)) {
                    map.put(let, count);
                }
                
            }

            compareMap.clear();

        }

        List<String> l = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            String let = entry.getKey();

            for (int i = 0; i < (count); i++) {
                l.add(let);
            }
        }

        return l;

    }
}
