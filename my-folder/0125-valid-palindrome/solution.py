class Solution(object):
    def isPalindrome(self, s):
        a=''
        for i in s:
            if i.isdigit() or i.isalpha():
                a=a+i.upper()
        
        if a[::-1] == a:
            return True
        else:
            return False
