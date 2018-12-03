class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        for (int i = 0; i < haystackChars.length; i++) {
            char haystackChar = haystackChars[i];
            if (haystackChar == needleChars[0]) {
                for (int j = 0; j < needleChars.length; j++) {
                    try {
                        if (needleChars[j] != haystackChars[j+i]) {
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        return -1;
                    }
                    if (j == needleChars.length - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
