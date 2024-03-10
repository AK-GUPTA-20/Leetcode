class Solution(object):
    def intersection(self, nums1, nums2):
        a=[]
        for i in range(max(len(nums1),len(nums2))):
            if len(nums1)>len(nums2):
                if nums1[i] in nums2:
                    a.append(nums1[i])
            else:
                if nums2[i] in nums1:
                    a.append(nums2[i])
        return list(set(a))
