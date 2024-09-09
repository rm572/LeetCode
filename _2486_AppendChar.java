import java.util.ArrayList;

public class _2486_AppendChar {
    public static int appendCharacters(String s, String t) {
        ArrayList<String> sL = new ArrayList<String>();
        ArrayList<String> tL = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            sL.add(s.substring(i, i+1));
        }

        for (int i = 0; i < t.length(); i++) {
            tL.add(t.substring(i, i+1));
        }

        int count = 0;
        int index = 0;
        for (String str : tL) {    
            while (sL.size() > index) {
                String n = sL.get(index);
                if (!str.equals(n)) {
                    index++;
                }
                else {
                    count++;
                    index++;
                    break;
                }
            }
        } 
        

        return t.length()-count;
    }
}
