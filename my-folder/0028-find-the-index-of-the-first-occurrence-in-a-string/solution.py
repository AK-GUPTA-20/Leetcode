class Solution(object):
    def strStr(self, haystack, needle):
        if needle not in haystack:
            return -1
        length=len(haystack)-len(needle)+1
        for i in range(length):
            if (haystack[i:len(needle)+i]==needle):
                return i
        
