public class _1662_CheckEqualArrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < Math.max(word1.length, word2.length); i++) {
            try {
                s1 += word1[i];
                
            }
            catch (Exception e) {
                System.out.println();
            }

            try {
                s2 += word2[i];
                
            }
            catch (Exception e) {
                System.out.println();
            }
        }

        return s1.equals(s2);
    }
}
