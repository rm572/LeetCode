import java.util.Arrays;

public class Zigzag6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println("Should be: PAHNAPLSIIGYIR");
    }

    public static String convert(String s, int numRows) {
        String[] letters = new String[numRows];

        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            if (letters[row] == null) {
                letters[row] = s.substring(i, i+1);
            }
            else {
                letters[row] = (letters[row] + s.substring(i, i+1));
            }
            
            System.out.println(letters[row]);
            if (down) {
                row++;
                if (row == numRows) {
                    row -= 2;
                    down = false;
                    continue;
                }
            }
            else {
                row--;
                if (row == 0) {
                    down = true;
                }
            }
        }

        String str = "";

        System.out.println(Arrays.toString(letters));

        for (String ss : letters) {
            str += ss;
        }

        return str;

    }
}
