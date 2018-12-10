class Solution {
    public int mySqrt(int x) {
        if (x < 0) {
            return 0;
        }
        if (0 <= x && x <= 100) {
            for (int i = 0; i <= 10; i++) {
                int p = (int)Math.pow(i, 2);
                if (p == x) {
                    return i;
                } else if (p > x) {
                    return i - 1;
                } else {
                    continue;
                }
            }
        } else if (100 < x && x <= 10000) {
            for (int i = 11; i <= 100; i++) {
                int p = (int)Math.pow(i, 2);
                if (p == x) {
                    return i;
                } else if (p > x) {
                    return i - 1;
                } else {
                    continue;
                }
            }
        } else if (10000 < x && x <= 1000000) {
            for (int i = 101; i <= 1000; i++) {
                int p = (int)Math.pow(i, 2);
                if (p == x) {
                    return i;
                } else if (p > x) {
                    return i - 1;
                } else {
                    continue;
                }
            }
        } else if (1000000 < x && x <= 100000000) {
            for (int i = 1001; i <= 10000; i++) {
                int p = (int)Math.pow(i, 2);
                if (p == x) {
                    return i;
                } else if (p > x) {
                    return i - 1;
                } else {
                    continue;
                }
            }
        } else {
            for (int i = 10001; i <= 46340; i++) {
                int p = (int)Math.pow(i, 2);
                if (p == x) {
                    return i;
                } else if (p > x) {
                    return i - 1;
                } else {
                    continue;
                }
            }
        }
        return 46340;
    }
}
