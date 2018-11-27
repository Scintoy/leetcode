class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        l_nums = [target - _ for _ in nums]
        for i, t in enumerate(l_nums):
            if t in nums:
                if i != nums.index(t):
                    return [i, nums.index(t)]
