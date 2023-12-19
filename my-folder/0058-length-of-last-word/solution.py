class Solution(object):
    def lengthOfLastWord(self, s):
        count=0
        s=s.split()
        for i in s[-1]:
            count=count+1
        return count
        
