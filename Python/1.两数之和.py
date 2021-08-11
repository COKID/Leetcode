#
# @lc app=leetcode.cn id=1 lang=python
#
# [1] 两数之和
#

# @lc code=start
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dic=dict()
        for i, value in enumerate(nums):
            if (target-value) in dic.keys():
                return [dic[target-value] ,i]
            else:
                dic[value]=i
        return []


# @lc code=end

