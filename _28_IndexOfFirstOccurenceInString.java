public class _28_IndexOfFirstOccurenceInString {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - nLen + 1; i++) {
            String s = haystack.substring(i, i + nLen);
            if (s.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
