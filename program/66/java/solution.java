class Solution {
    public int[] plusOne(int[] digits) {
        int x = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            if (x == 1) {
                if (digit + 1 == 10) {
                    digits[i] = 0;
                } else {
                    digits[i] = digit + 1;
                    x = 0;
                }
            }
        }
        if (x == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i <= digits.length; i++) {
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}
