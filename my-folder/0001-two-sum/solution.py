class Solution(object):
    def twoSum(self, nums, target):
    
        length=len(nums)
        for i in range(0,length):
            for j in range(1,length):
                if(i!=j and nums[i]+nums[j]==target):
                    return[i,j]
            
          
        
