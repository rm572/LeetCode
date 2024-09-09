public class _58_LengthLastWord {
    public int lengthOfLastWord(String s) {
        boolean end = true;
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (!s.substring(i, i+1).equals(" ")) {
                count++;
                end = false;
            }
            else {
                if (!end) {
                    return count;
                }
            }
        }
        return count;
    }
}
