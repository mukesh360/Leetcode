class Solution:
    
    def search(self,arr, x):
        
        for i in range(0,len(arr)):
            if arr[i] == x:
                return i
                break
        else:
            return -1