class Solution {
    public String addBinary(String a, String b) {
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int length = Math.max(ca.length, cb.length);
        int[] result = new int[length];
        int carry = 0;
        for (int i = 0; i < length; i++) {
            int caValue = 0;
            int cbValue = 0;
            try {
                caValue = Integer.parseInt(""+ca[ca.length - i - 1]);
            } catch (IndexOutOfBoundsException e) {
            }
            try {
                cbValue = Integer.parseInt(""+cb[cb.length - i - 1]);
            } catch (IndexOutOfBoundsException e) {
            }
            int sum = caValue + cbValue;
            if (carry == 0) {
                if (sum == 2) {
                    result[length-1-i] = 0;
                    carry = 1;
                } else {
                    result[length-1-i] = sum;
                    carry = 0;
                }
            } else {
                if (sum + 1 >= 2) {
                    result[length-1-i] = sum - 1;
                    carry = 1;
                } else {
                    result[length-1-i] = sum + 1;
                    carry = 0;
                }
            }
        }
        String s = "";
        for (int i = 0; i < length; i++) {
            s = s + result[i];
        }
        if (carry == 1) {
            return "1" + s;
        } else {
            return s;
        }
    }
}
