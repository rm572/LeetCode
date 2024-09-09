import java.util.Stack;

public class _20_ValidParentheses {
        public boolean isValid(String s) {
        Stack<String> stak = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);

            if (str.equals("(") || str.equals("{") || str.equals("[")) {
                stak.push(str);
            }

            else {
                if (stak.isEmpty()) {
                    return false;
                }
                String cur = stak.peek();
                if (str.equals(")")) {
                    if (cur.equals("(")) {
                        stak.pop();
                    }
                    else {
                        return false;
                    }
                }
                else if (str.equals("}")) {
                    if (cur.equals("{")) {
                        stak.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    if (cur.equals("[")) {
                        stak.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if (stak.isEmpty()) {
            return true;
        }
        return false;
    }
}
