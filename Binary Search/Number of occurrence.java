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
    int countFreq(int[] arr, int target) {
        int first = lowerBound(arr,target);
        if (first == arr.length || arr[first] != target) return 0;
        int last = upperBound(arr,target);
        
        return last - first;
        
    }
}
