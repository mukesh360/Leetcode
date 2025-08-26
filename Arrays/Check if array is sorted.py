class Solution:
    def arraySortedOrNot(self, arr) -> bool:
        for i in range(len(arr)):
            for j in range(1,len(arr)):
                if arr[i] >= arr[j]:
                    sort = True
                else:
                    sort = False
        return sort
    
# ------optimised ------
class Solution:
    def arraySortedOrNot(self, arr) -> bool:
        for i in range(1,len(arr)):
            if arr[i] >= arr[i - 1]:
               pass 
            else:
                return False
        return True       