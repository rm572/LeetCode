public class _9_PalindromeNum {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (!s.substring(i, i+1).equals(s.substring(len-i-1, len-i))) {
                return false;
            }
        }
        return true;
    }
}
