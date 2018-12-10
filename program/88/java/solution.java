class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        int j = n;
        int index = 0;
        while (i > 0 || j > 0) {
            if (i == 0) {
                for (int k = 0; k < j; k++) {
                    nums1[k] = nums2[k];
                }
                break;
            }
            if (j == 0) {
                break;
            }
            if (nums1[i-1] < nums2[j-1]) {
                nums1[m+n-1-index] = nums2[j-1];
                j = j -1;
            } else {
                nums1[m+n-1-index] = nums1[i-1];
                i = i - 1;
            }
            index = index + 1;
        }
    }
}
