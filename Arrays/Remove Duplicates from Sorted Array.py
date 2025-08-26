class Solution(object):
    def removeDuplicates(self, nums):
        unique_elements = set()
        for i in range(len(nums)):
            unique_elements.add(nums[i])

        uniques = list(unique_elements)   
        for i in range(len(nums)):
            if i < len(uniques):
                nums[i] = uniques[i]
            else:
                nums[i] = '_'
        return len(list(uniques))

#----- optimised -----
class Solution(object):
    def removeDuplicates(self, nums):
        i = 0

        for j in range(len(nums)):
            if nums[j] != nums[i]:
                i += 1
                nums[i] = nums[j]
        return i + 1




       
        