public class _5_LongestPalindSubStr {
    public String longestPalindrome(String s) {
        if (checkPalindrome(s)) {
            return s;
        }
        String p = s.substring(0, 1);
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (str.charAt(0) == str.charAt(str.length()-1)) {
                    if (checkPalindrome(str)) {
                        if (str.length() > maxLen) {
                            maxLen = str.length();
                            p = str;
                        }
                    }
                }

            }
        }
        return p;
    }

    public static boolean checkPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            String front = str.substring(i, i+1);
            String end = str.substring(len - i - 1, len - i);
            if (!front.equals(end)) {
                return false;
            }    
        }
        return true;
    }
}
