class Solution {
    public int romanToInt(String s) {
         Map<String, Integer> priority = new HashMap<String, Integer>(){{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};
        char[] cs = s.toCharArray();
        List<String> ls = new ArrayList<>();
        for(int i = 0; i < cs.length; i++) {
            if (i < cs.length - 1 && priority.get(String.valueOf(cs[i])) < priority.get(String.valueOf(cs[i+1]))) {
                ls.add(String.valueOf(cs, i, 2));
                i++;
            } else {
                ls.add(String.valueOf(cs[i]));
            }
        }
        Integer sum = 0;
        for (int j = 0; j < ls.size(); j++) {
            String num = ls.get(j);
            if (num.length() == 2) {
                sum = sum + priority.get(String.valueOf(num.toCharArray()[1])) - priority.get(String.valueOf(num.toCharArray()[0]));
            } else {
                sum = sum + priority.get(num);
            }
        }
        return sum;
    }
}
