class Solution(object):
    def twoSum(self, nums, target):
        
        for i in range(len(nums)):
            number = target - nums[i]
            if number in nums:
                j=nums.index(number)    # arr.index() is function to find the index of num
                if j!=i:       # j and i are the indexes
                    return[i,j]
