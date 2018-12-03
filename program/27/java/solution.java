class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int k = -1;
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (num == val) {
                nums[i] = 0;
            } else {
                nums[k+1] = num;
                k = k + 1;
            }
        }
        return k + 1;
    }
}
