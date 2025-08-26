#better

class Solution(object):
    def longestConsecutive(self, arr):
        if not arr:
            return 0
        arr.sort()
        longest_seq = 1
        count = 1
        for i in range(1,len(arr)):
            if arr[i] == arr[i-1]:
                continue
            elif arr[i] == arr[i-1] + 1:
                count += 1
                longest_seq = max(longest_seq,count)
            else:
                count = 1
        return longest_seq
        

#optimal

class Solution(object):
    def longestConsecutive(self, nums):
        if not nums:
            return 0
        arr_set = set(nums)
        longest = 0
        
        for num in arr_set:
            if num - 1 not in arr_set:
                current = num
                count = 1
                while current + 1 in arr_set:
                    count += 1
                    current += 1
                longest = max(count,longest)   
        
        return longest


# Geeks For Geeks 
 #User function Template for python3
 
class Solution:
    
    # arr[] : the input array
    
    #Function to return length of longest subsequence of consecutive integers.
    def longestConsecutive(self,arr):
        if not arr:
            return 0
        longest = 0
        num_set = set(arr)
        
        for num in num_set:
            if num - 1 not in num_set:
                current = num
                count = 1
                while current + 1 in num_set:
                    count += 1
                    current += 1
                longest = max(longest, count)
        return longest
            
      
            
      
        