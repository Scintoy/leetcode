class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i=1; i<nums.length; i++) {
            int num = nums[i];
            int preNum = nums[k];
            if (num == preNum) {
                nums[i] = 0;
            } else {
                nums[k+1] = num;
                k = k + 1;
            }
        }
        return k + 1;
    }
}
