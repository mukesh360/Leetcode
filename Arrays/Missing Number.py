class Solution(object):
    def missingNumber(self, nums):
        
        for i in range(len(nums)+1):
            if i not in nums:
                return i
        
#-------- optimised ---------- leetcode

class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        add = 0
        total = n*(n +1)/2
        for i in range(n):
            add += nums[i]
        return total - add
    
# --- GG---- size n - 1
class Solution:
    def missingNum(self, arr):
        n = len(arr) + 1 
        expected_sum = n * (n + 1) // 2
        actual_sum = sum(arr)
        return expected_sum - actual_sum