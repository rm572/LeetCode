import java.util.ArrayList;
import java.util.List;

public class _1324_PrintWordsVertically {
    public List<String> printVertically(String s) {
        String[] strs = s.split(" ");
        List<String> l = new ArrayList<String>();
        int index = 0;
        while (true) {
            String str = "";
            for (String t : strs) {
                try {
                    str += t.substring(index, index + 1);
                    
                }
                catch (Exception e) {
                    str += " ";
                }
            }
 
            if (allSpaces(str)) {
                break;
            }
            l.add(trimEnd(str));
            index++;
        }
        return l;
    }
 
    public String trimEnd(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!s.substring(i, i+1).equals(" ")) {
                return s.substring(0, i+1);
            }
        }
        return "";
    }

    public boolean allSpaces(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i, i+1).equals(" ")) {
                return false;
            }
        }
        return true;
    }
}
