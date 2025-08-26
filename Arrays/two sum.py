class Solution:
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i] + nums[j] == target:
                    return [i , j]
                


# optimal solution 

# Space: O(n)
# Time: O(n)


class Solution(object):
    def twoSum(self, arr, target):
        hmap ={}

        for i in range(len(arr)):
            addup = target - arr[i] 
            if addup in hmap:
                return [i,hmap[addup]]
            hmap[arr[i]] = i




