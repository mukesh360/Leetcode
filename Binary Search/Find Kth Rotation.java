class Solution {
    public int findKRotation(int arr[]) {
       
       int n = arr.length;
       int low = 0;
       int high = n- 1;
       int ans = Integer.MAX_VALUE;
       int index = - 1;
       
       while(low <= high){
           
           int mid = (low + high) / 2;
           
           if(arr[low] <= arr[mid]){
               if(arr[low] < ans){
                   ans = arr[low];
                   index = low;
                   
               }
               low = mid + 1;
           }
           else{
               if(arr[mid] <= arr[high]){
                   ans = arr[mid];
                   index = mid;
                   
               }
               high = mid - 1;
           }
           
           
        }
        
        return index;
        
    }
}