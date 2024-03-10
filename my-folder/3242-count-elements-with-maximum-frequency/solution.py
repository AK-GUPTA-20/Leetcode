class Solution(object):
    def maxFrequencyElements(self, nums):
        new_lst=list(set(nums))
        a=[]
        for i in range(len(new_lst)):
            a.append(nums.count(new_lst[i]))
        maxs=max(a)
        c=0
        for i in a:
            if maxs==i:
                c=c+i
        return c    
