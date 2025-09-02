// brute force
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[] {first , last};
        
    }
}
//
class Solution {
    private int lowerBound(int[] arr, int target) {
        int lb = 0;
        int n = arr.length;
        int ub = n - 1;
        
        
        int ans = n;
        
        while(lb <= ub){
            int mid = (lb + ub)/2;
            
            if(arr[mid] >= target){
                ans = mid;
                ub = mid - 1;
            }
            else{
                lb = mid + 1;
            }
        }
        return ans;
        
    }

    private int upperBound(int[] arr, int target) {
        // code here
        int lb = 0;
        int n = arr.length;
        int ub = n - 1;
        
        
        int ans = n;
        
        while(lb <= ub){
            int mid = (lb + ub)/2;
            
            if(arr[mid] > target){
                ans = mid;
                ub = mid - 1;
            }
            else{
                lb = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        
        int lb = lowerBound(nums, target);

        if(lb == nums.length || nums[lb] != target){
            return new int[] {-1 , -1}; 
        }

        int up = upperBound(nums, target);

        return new int[] {lb , up - 1};
        
    }
}