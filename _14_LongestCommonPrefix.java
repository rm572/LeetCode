public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortest) {
                shortest = strs[i].length();
            }
        }

        String total = "";
        int index = 0;
        for (int i = 0; i < shortest; i++) {
            String s = strs[0].substring(index, index+1);
            for (int j = 0; j < strs.length; j++) {
                if (!s.equals(strs[j].substring(index, index+1))) {
                    return total;
                }
            }
            total += s;
            index++;
        }

        return total;
    }
}
