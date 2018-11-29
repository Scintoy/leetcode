class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Map<Integer, Set<Character>> indexCharacter = new HashMap<>();
        int minLength = Arrays.stream(strs).mapToInt(String::length).min().getAsInt();
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                String s = strs[j];
                Character c = s.toCharArray()[i];
                Set<Character> cs = indexCharacter.get(i);
                if (cs == null) {
                    indexCharacter.put(i, new HashSet<Character>(){{add(c);}});
                } else {
                    cs.add(c);
                }
            }
        }
        String sameString = "";
        for (int i = 0; i < minLength; i++){
            Set<Character> cs = indexCharacter.get(i);
            if (cs.size() == 1) {
                sameString = sameString + String.valueOf(cs.toArray()[0]);
            } else {
                return sameString;
            }
        }
        return sameString;
    }
}
