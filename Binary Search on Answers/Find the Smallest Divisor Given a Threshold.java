class Solution {
    public int max(int[] arr){
        int max_num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        return max_num;

    }
    public int sumOfD(int[] arr, int mid){
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (int)Math.ceil((double)arr[i] / mid);
        }
        return sum;

    }
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = max(nums);
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(sumOfD(nums,mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }



        return ans;
        
    }
}
// optimized
class Solution {
    public int max(int[] arr){
        int max_num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        return max_num;

    }
    private long sumOfD(int[] arr, int divisor) {
        long sum = 0;
        for (int num : arr) {
            
            sum += (num + divisor - 1) / divisor;///here optimized
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = max(nums);
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(sumOfD(nums,mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }



        return ans;
        
    }
}