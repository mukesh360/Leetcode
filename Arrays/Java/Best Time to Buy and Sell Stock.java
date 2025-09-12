class Solution {
    public int maxProfit(int[] arr) {
        
        int profit = 0;
        int minimum = arr[0];
        int cost = 0;

        for(int i = 1; i < arr.length; i++){
            cost = arr[i] - minimum;
            profit = Math.max(cost , profit);
            minimum = Math.min(minimum , arr[i]);            
        }
        return profit;
    }
}