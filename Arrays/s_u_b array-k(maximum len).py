class Solution(object):
    def subarraySum(self, arr, k):
        length = 0
        for i in range(len(arr)):
            total  = 0
            for j in range(i,len(arr)):
                total += arr[j]
                if total == k:
                    length =  max(length,j-i+1)
        return length
    # it only satisfiy only the certain condition  test cases 12/66

# only for positive 
class Solution(object):
    def subarraySum(self, arr, k):
        max_len = 0
        total = 0
        left = 0
        right = 0
        while right < len(arr):
            total += arr[right]
            while total > k and left <= right:
                total -= arr[left]
                left += 1
            if total == k:
                max_len = max(max_len , right - left +1)
            right += 1
        return max_len



                    
      
      
         
    



                    


        