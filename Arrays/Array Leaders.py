class Solution:
    def leaders(self, arr):
        leaders = []
        right  = arr[-1]
        leaders.append(right)
        for i in range(len(arr)-2,-1,-1):
            if arr[i] >= right:
                right = arr[i]
                leaders.append(arr[i])
        leaders.reverse()
        
        return leaders