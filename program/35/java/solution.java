class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (target <= num) {
                return i;
            }
        }
        return nums.length;
    }
}
