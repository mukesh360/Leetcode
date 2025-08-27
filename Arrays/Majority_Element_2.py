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


        