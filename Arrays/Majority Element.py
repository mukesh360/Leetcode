# better solution
class Solution(object):
    def majorityElement(self, arr):
        hmap = {}
        for i in range(len(arr)):
            if arr[i] in hmap:
                hmap[arr[i]] += 1
            else :
                hmap[arr[i]] = 1
            if hmap[arr[i]] > len(arr)/2:
                return arr[i]
'''time  and space complex  = O(n)
'''
# optimised by Moore's Voting Algorithm : only for understanding it isn't in leetcode
class Solution(object):
    def majorityElement(self, arr):
        candidate = None
        count = 0
        
        for num in arr:
            if count == 0:
                candidate = num
            if num == candidate:
                count += 1
            else:
                count -= 1
                
        return candidate
