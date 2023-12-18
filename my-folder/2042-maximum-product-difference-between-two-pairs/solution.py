class Solution(object):
    def maxProductDifference(self, nums):
        nums.sort()
        for i in range(len(nums)):
            s=(nums[-1]*nums[-2])-(nums[0]*nums[1])
        return s
