class Solution(object):
    def sortColors(self, arr):
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                if arr[i] > arr[j]:
                    arr[i] , arr[j] = arr[j] , arr[i]

# #better solution 
# | Metric               | Value                           |
# | -------------------- | ------------------------------- |
# | **Time Complexity**  | O(n)                            |
# | **Space Complexity** | O(1)                            |
# | **In-place?**        | ✅ (Yes, modifies input array)  |

class Solution(object):
    def sortColors(self, arr):
        count_0 = 0
        count_1 = 0
        count_2 = 0
        
        for i in range(len(arr)):
            if arr[i] == 0:
                count_0 +=1
            elif arr[i] == 1:
                count_1 += 1
            else:
                count_2 += 1
        
        for i in range(len(arr)):
            if  i < count_0 :
                arr[i] = 0
            elif i < count_1 + count_0:
                arr[i] = 1
            else:
                arr[i] = 2



        
        

