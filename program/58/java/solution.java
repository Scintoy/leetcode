class Solution {
    public int lengthOfLastWord(String s) {
        char[] cs = s.toCharArray();
        int last = 0;
        List<Integer> wordLength = new ArrayList<>();
        char blank = " ".toCharArray()[0];
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != blank) {
                last++;
            } else {
                if (last != 0) {
                    wordLength.add(last);
                }
                last = 0;
            }
        }
        if (last == 0 && wordLength.size() == 0) {
            return 0;
        }
        if (last > 0) {
            return last;
        }
        return wordLength.get(wordLength.size() - 1);
    }
}
