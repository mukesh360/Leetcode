class Solution:
    def getSecondLargest(self, arr):
        largest_number = arr[0]
        
        for i in range(len(arr)):
            if arr[i] > largest_number:
                largest_number = arr[i]
                
        second_largest = -1
        for j in range(len(arr)):
            if arr[j] > second_largest and arr[j] < largest_number:
                second_largest = arr[j]
        
        return second_largest

    #----------optimised--------- 
    def getSecondLargest(self, arr):
        largest = arr[0]
        second_largest = -1
         
        for i in range(len(arr)):
            if arr[i] > largest:
                second_largest = largest 
                largest = arr[i]
            elif (arr[i] > second_largest and arr[i] < largest):
                second_largest = arr[i]
        
        return second_largest            