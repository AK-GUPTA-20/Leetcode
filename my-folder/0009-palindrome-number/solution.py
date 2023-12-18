class Solution(object):
    def isPalindrome(self, x):
        x=str(x)
        n=x[::-1]
        if(n==x):
            return True
        else:
            return False
        
