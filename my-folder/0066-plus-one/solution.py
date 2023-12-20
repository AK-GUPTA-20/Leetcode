class Solution(object):
    def plusOne(self, digits):
        num=0
        for i in range(len(digits)):
            num=(num*10)+(digits[i]%10)
        l1=[int(digit)for digit in str(num+1)]
        return l1
