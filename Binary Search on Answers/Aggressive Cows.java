//using linear search
class Solution {
    
    private boolean canWePlace(int[] arr, int dist, int cows){
        int last = arr[0];
        int cntCows = 1;
        
        for(int i = cntCows; i < arr.length; i++){
            if(arr[i] - last >= dist){
                cntCows++;
                last = arr[i];
            }
        }
        return cntCows >= cows;
    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int min = stalls[0];
        int max = stalls[stalls.length - 1];
        
         for(int i = 1; i <= max - min; i++){   // include max-min distance
            if(!canWePlace(stalls, i, k)){
                return i - 1;   // last possible distance
            }
        }
        return max - min; 
    }
}
// optimal using bs
class Solution {
    
    private boolean canWePlace(int[] arr, int dist, int cows){
        int last = arr[0];
        int cntCows = 1;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - last >= dist){
                cntCows++;
                last = arr[i];
            }
        }
        return cntCows >= cows;
    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0]; //max - mim
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(canWePlace(stalls , mid , k) == true){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
}
