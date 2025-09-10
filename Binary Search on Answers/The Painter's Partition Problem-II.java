class Solution {
     private int max(int[] arr){
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    private int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    private int countStud(int[] arr,int maxPages){
        int stdCnt = 1;
        int pages = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(pages + arr[i] <= maxPages){
                pages += arr[i];
            }
            else{
              pages = arr[i];
              stdCnt++;
            }
        }
        return stdCnt;
        
    }
    public int findPages(int[] arr, int k) {
        if (k > arr.length) return -1;
        int low = max(arr);
        int high = sum(arr);
        int ans = -1;
       while(low <= high){
           int mid = (low + high) / 2;
           int std = countStud(arr, mid);
           
           if(std <= k){
               ans = mid;
               high = mid - 1 ;
           }
           else{
               low = mid + 1;
           }
       }
        return ans;
        
    }
    
    public int minTime(int[] arr, int k) {
        return findPages(arr , k);
        
        
    }
}
