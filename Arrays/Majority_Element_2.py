class Solution(object):
    def majorityElement(self, arr):
        ls = []
        
        for i  in range(len(arr)):
            if len(ls) == 0 or ls[0] != arr[i]:
                count = 0
                for j in range(len(arr)):
                    if arr[i] == arr[j]:
                        count += 1
                if count >len(arr) / 3:
                    ls.append(arr[i])
            if len(ls) == 2:
                break
        return ls


#better solution 
class Solution(object):
    def majorityElement(self, arr):
        ls = []
        mini = len(arr) // 3 + 1   
        hmap = {}

        for i in range(len(arr)):
           
            hmap[arr[i]] = hmap.get(arr[i], 0) + 1  

           
            if hmap[arr[i]] == mini:
                ls.append(arr[i])

        return ls
