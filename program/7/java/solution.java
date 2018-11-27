class Solution {
    public int reverse(int x) {
        boolean minus = x < 0;
        if (minus) {
            x = -x;
        }
        List<Integer> ls = new ArrayList<>();
        while (true) {
            ls.add(x%10);
            x = x / 10;
            if (x == 0) {
                break;
            }
        }
        int y = 0;
        double d = 0.0;
        for (int i=0; i<ls.size(); i++) {
            y = y + (int)(ls.get(i) * Math.pow(10, ls.size() - i - 1));
            d = d + ls.get(i) * Math.pow(10, ls.size() - i - 1);
            if (y != d) {
                return 0;
            }
        }
        if (minus) {
            y = -y;
        }
        return y;
    }
}
