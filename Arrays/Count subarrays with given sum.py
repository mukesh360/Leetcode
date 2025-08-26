# optimised  fr reference https://youtu.be/6wQePJInaH8?si=bRoqgTxEX0modqN4
class Solution(object):
    def subarraySum(self, arr, k):
        count = 0
        hmap = {}
        total = 0
        hmap[0] = 1
        for i in range(len(arr)):
            total += arr[i]
            if total - k in hmap:
                count += hmap[total - k]
            if total not in hmap:
                hmap[total] = 1
            else:
                hmap[total] += 1
        return count