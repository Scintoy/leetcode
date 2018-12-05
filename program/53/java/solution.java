class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, nums[i]);
        }
        if (maxValue < 0) {
            return maxValue;
        }
        int result = 0, sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = Math.max(sum + nums[j], 0);
            result = Math.max(result, sum);
        }
        return result;
    }
}
