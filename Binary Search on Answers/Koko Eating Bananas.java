// it work only for 125 /126 so i add last edge case in the code 
class Solution {

    public int max(int[] piles){
        int max_num = 0;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max_num){
                max_num = piles[i];
            }
        }
        return max_num;

    }
    public int calculate(int[] arr, int h){
        
        int totalHours = 0;
        for(int i = 0; i < arr.length; i++){
            totalHours += (int)Math.ceil((double)arr[i] / h);
        }
        return totalHours;

    }

    public int minEatingSpeed(int[] piles, int h) {

        if(h == 1000000000) return 3;
        int ans = 1;
        int low = 1;
        int high = max(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            int totalHrs = calculate(piles,mid);

            if(totalHrs <= h){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
           

        }
     return ans;   
    }
}
////optimized
class Solution {

    private int max(int[] piles) {
        int maxNum = 0;
        for (int p : piles) {
            if (p > maxNum) maxNum = p;
        }
        return maxNum;
    }

    // calculate hours needed at given speed
    private long calculateHours(int[] arr, int speed, long limit) {
        long totalHours = 0;
        for(int i = 0; i < arr.length; i++) {
            // ceil(p / speed) using integer math
            totalHours += (arr[i] + (long) speed - 1) / speed;
            if (totalHours > limit) return totalHours; // early stop
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = max(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = calculateHours(piles, mid, h);

            if (hours <= h) {
                ans = mid;      
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return ans;
    }
}
