class Solution {
    public boolean isPalindrome(int x) {
        String s = ((Integer)x).toString();
        char[] xs = s.toCharArray();
        for (int i=0; i<=xs.length/2; i++) {
            if (xs[i] != xs[xs.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
