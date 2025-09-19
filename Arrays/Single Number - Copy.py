class Solution(object):
    def singleNumber(self, nums):
       
       for i in range(len(nums)):
        count = 0
        for j in range(len(nums)):
            if nums[i] == nums[j]:
                count += 1
        if count == 1:
            return nums[i]
        
#optimised 
class Solution:
    def findUnique(self, arr):
        unique = 0
        for number in range(len(arr)):
            unique = unique^arr[number]
        return unique
            