class Solution(object):
    def longestCommonPrefix(self, strs):
        length = min(len(s) for s in strs)
        ans=''
        strs.sort()
        for i in range(length):
            if strs[0][i] == strs[-1][i]:
                ans=ans+(strs[0][i])
            else:
                break
        return ans

