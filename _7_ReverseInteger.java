public class _7_ReverseInteger {
    public int reverse(int x) {
        String s = "";
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x*=-1;
        }
        if (x == 0) {
            return 0;
        }
        while (x >= 1) {
            s += (x%10);
            x/=10;
        }
        try {
            if (isNeg) {
                return (Integer.parseInt(s)* -1);
            }
            return Integer.parseInt(s);
        }
        catch (Exception e){
            return 0;
        }
        
        

    }
}
