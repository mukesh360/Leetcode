class Solution(object):
    def moveZeroes(self, nums):
        
        non_zeros = []
        count = 0
        for number in range(len(nums)):
            if nums[number] != 0:
                non_zeros.append(nums[number])
            else:
                count += 1
        non_zeros.extend([0] * count) # it add zeros to the end

        for  number in range(len(nums)):
            nums[number] = non_zeros[number]


#------- optimized --------- using two pointer

class Solution(object):
    def moveZeroes(self, nums):
        j = -1
        for  i in range(len(nums)):
            if nums[i] == 0:
                j = i
                break
        if j == -1:
            return
        for i in range(j + 1,len(nums)):
            if nums[i] != 0:
                nums[i] , nums[j] = nums[j] , nums[i]
                j += 1



