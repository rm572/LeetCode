public class _2490_CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            String next;
            if (i == words.length-1) {
                next = words[0];
            }
            else {
                next = words[i+1];
            }

            if (cur.charAt(cur.length()-1) != next.charAt(0)) {
                return false;
            }
             
        }

        return true;
    }
}
