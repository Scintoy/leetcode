class Solution {
    public boolean isValid(String s) {
        if (s == "") {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<String, Integer> symbolNum = new HashMap<String, Integer>(){{
            put("(", -1);
            put(")", 1);
            put("{", -2);
            put("}", 2);
            put("[", -3);
            put("]", 3);
        }};
        char[] cs = s.toCharArray();
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < cs.length; i++) {
            Integer num = symbolNum.get(String.valueOf(cs[i]));
            if (num > 0) {
                if (ls.size() == 0) {
                    return false;
                }
                Integer pre = ls.get(ls.size()-1);
                if (pre + num != 0){
                    return false;
                } else {
                    ls.remove(ls.size()-1);
                }
            } else {
                ls.add(symbolNum.get(String.valueOf(cs[i])));
            }
        }
        if (ls.size() != 0) {
            return false;
        }
        return true;
    }
}
