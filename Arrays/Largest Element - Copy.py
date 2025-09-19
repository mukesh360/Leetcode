class Solution:
    def largestElement(self, nums):
        max_number = nums[0] 
        for number in nums:
            if number > max_number:
                max_number = number
        return max_number
        