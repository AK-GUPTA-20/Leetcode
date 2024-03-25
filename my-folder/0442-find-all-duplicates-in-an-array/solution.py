class Solution(object):
    def findDuplicates(self, nums):
        count=1
        a=[]
        z=0
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i]==nums[i+1]:
            #     count = count +1
            # elif count ==2 :
                a.append(nums[i])
        return a        



