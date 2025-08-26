class Solution(object):
    def rearrangeArray(self, arr):
        pos = []
        neg = []
        for i in range(len(arr)):
            if arr[i] > 0:
                pos.append(arr[i])
            else:
                neg.append(arr[i])
        res = []
        for i in range(len(pos)):  #for i in range(len(pos)):
            res.append(pos[i])          #arr[2*i] = pos[i]
            res.append(neg[i])          #arr[2*i+1] = neg[i]  --- with out using res arr
        return res
#optimal 

class Solution(object):
    def rearrangeArray(self, arr):
        pos_index = 0
        neg_index = 1
        res = [0] * len(arr)
        for i in range(len(arr)):
            if arr[i] > 0:
                res[pos_index] = arr[i]
                pos_index += 2
            else:
                res[neg_index] = arr[i]
                neg_index += 2
        return res 
#optimized
class Solution(object):
    def rearrangeArray(self, arr):
        pos_index = 0
        neg_index = 1
        res = [0] * len(arr)
        for i in range(len(arr)):
            if arr[i] > 0:
                res[pos_index] = arr[i]
                pos_index += 2
            else:
                res[neg_index] = arr[i]
                neg_index += 2
        return res 
      
       
# Complexity
# Time Complexity: O(n) — one pass, swapping in place.

# Space Complexity: O(1) — no extra array
      
        
       
                

        