class Solution {
    int upperBound(int[] arr, int target) {
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
}

