#optimised 
class Solution(object):
    def maxSubArray(self, arr):
        total = 0
        maxi = float('-inf')
        for i in range(len(arr)):
            total += arr[i]
            maxi = max(total,maxi)
            if total < 0:
                total = 0
        return maxi


# | Metric           | Complexity |
# | ---------------- | ---------- |
# | Time Complexity  | O(n)       |
# | Space Complexity | O(1)       |






         
        