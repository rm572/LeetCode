public class _66_PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean isCarry = false;
        int index = len - 1;
        digits[index] = digits[index] + 1;
        while (index >= 0) {
            int dig = digits[index];
            if (isCarry) {
                digits[index] += (1);
                if (digits[index] == 10) {
                    isCarry = true;
                    digits[index] = 0;
                }
                else {
                    isCarry = false;
                }
            }
            else if (dig == 10) {
                isCarry = true;
                digits[index] = 0;
            }
            else {
                isCarry = false;
                break;
            }
            index--;
        }
        if (!isCarry){
            return digits;
        } 
        else {
            int[] newDigits = new int[len+1];
            newDigits[0] = 1;
            for (int i = 0; i < len; i++) {
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }        
    }
}
