import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _17_LetterCombPhoneNum {
        public List<String> letterCombinations(String digits) {
        ArrayList<String> l = new ArrayList<String>();
        if (digits.length() == 0 || digits == null) {
            return l;
        }

        HashMap<String, String[]> map = new HashMap<String, String[]>();
        map.put("2", new String[] {"a", "b", "c"});
        map.put("3", new String[] {"d", "e", "f"});
        map.put("4", new String[] {"g", "h", "i"});
        map.put("5", new String[] {"j", "k", "l"});
        map.put("6", new String[] {"m", "n", "o"});
        map.put("7", new String[] {"p", "q", "r", "s"});
        map.put("8", new String[] {"t", "u", "v"});
        map.put("9", new String[] {"w", "x", "y", "z"});

        ArrayList<String[]> all = new ArrayList<String[]>();
        String s = digits;
        while (s.length() > 0) {
            all.add(map.get(s.substring(0, 1)));
            s = s.substring(1);
        }
        if (all.size() == 1) {
            String[] str0 = all.get(0);
            for (String s0 : str0) {
                l.add(s0);
            }
        }
        else if (all.size() == 2) {
            String[] str0 = all.get(0);
            String[] str1 = all.get(1);
            String total = "";
            for (String s0: str0) {
                total += s0;
                for (String s1: str1) {
                    total += s1;
                    l.add(total);
                    total = s0;
                }
                total = "";
            }
        }
        else if (all.size() == 3) {
            String[] str0 = all.get(0);
            String[] str1 = all.get(1);
            String[] str2 = all.get(2);
            String total = "";
            for (String s0: str0) {
                total += s0;
                for (String s1: str1) {
                    total += s1;
                    for (String s2: str2) {
                        total += s2;
                        l.add(total);
                        total = (s0 + s1);
                    }
                    total = s0;
                }
                total = "";
            }            
        }
        else if (all.size() == 4) {
            String[] str0 = all.get(0);
            String[] str1 = all.get(1);
            String[] str2 = all.get(2);
            String[] str3 = all.get(3);
            String total = "";
            for (String s0: str0) {
                total += s0;
                for (String s1: str1) {
                    total += s1;
                    for (String s2: str2) {
                        total += s2;
                        for (String s3 : str3) {
                            total += s3;
                            l.add(total);
                            total = (s0 + s1 + s2);
                        }
                        total = (s0 + s1);
                    }
                    total = s0;
                }
                total = "";
            }             
        }

        return l;
    }
}
