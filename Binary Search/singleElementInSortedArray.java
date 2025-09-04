// brute force 
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;

        if(n == 1) return nums[0];

        for(int i = 0; i < n; i++){
            if(i == 0){
                if(nums[i] != nums[i + 1]) return nums[0];
            }
            else if(i == n -1){
                if(nums[i] != nums[i - 1]) return nums[n-1];
            }
            else{
                if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) return nums[i];
            }
        }
        return  0;
    }
}


// optimized 
class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        int n = arr.length;

        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int low = 1;
        int high = n - 2;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid +1]){
                return arr[mid];
            }
            else if((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) low = mid  + 1;
            
            else high = mid - 1;
        }
        return  0;
    }
}