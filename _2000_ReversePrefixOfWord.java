public class _2000_ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                s = ch + s.substring(0);
                return s + word.substring(i+1); 
            }
            else {
                s = word.charAt(i) + s.substring(0);
            }
        }
        return word;
    }
}
