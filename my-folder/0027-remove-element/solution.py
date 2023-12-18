class Solution(object):
    def removeElement(self, nums, val):
        f=0
        for i in range(len(nums)):
            if nums[i]==val:
                f=f+1
                nums[i]='_'
        for i in range(0,f):
            for i in range(len(nums)-1):
                if nums[i]=='_':
                    nums[i],nums[i+1]=nums[i+1],nums[i]    
        z=len(nums)-f
        return z
        return nums
            
