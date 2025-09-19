# it only satisfy 154/212 
class Solution(object):
    def maxProfit(self, prices):
        min_index = 0
        min_price = float('inf')
        max_profit = 0 
        for i in range(len(prices)):
            if prices[i] < min_price:
                min_price = prices[i]
                min_index = i
        
        for i in range(min_index, len(prices)):
            profit = prices[i] - min_price
            if profit > max_profit:
                max_profit = profit
        return max_profit
    
    
# optimised
# | Type             | Complexity |
# | ---------------- | ---------- |
# | Time Complexity  | O(n)       |
# | Space Complexity | O(1)       |
class Solution(object):
    def maxProfit(self, arr):
        profit = 0
        minimum = arr[0]

        for i in range(1,len(arr)):
            cost = arr[i] - minimum
            profit = max(cost ,profit)
            minimum = min(arr[i], minimum)
        return profit

 
          




        
        
        