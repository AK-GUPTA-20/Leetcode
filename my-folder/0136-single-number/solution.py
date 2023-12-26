class Solution(object):
    def singleNumber(self, nums):
        j=0
        for i in nums:
            j^=i
        return j


