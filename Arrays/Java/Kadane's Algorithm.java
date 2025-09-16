class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int total = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
            
            max = Math.max(max,total);
            
            if(total < 0){
                total = 0;
            }
        }
        return max;
        
    }
}
