// using linear search
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
        
        for(int i = low; i <= high; i++){
            if(countStud(arr,i) <= k){
                return i;
            }
        }
        return -1;
        
    }
}