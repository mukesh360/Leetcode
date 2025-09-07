class Solution {
     public int max(int[] arr){
        int max_num = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        return max_num;

    }
     public int min(int[] arr){
        int min_num = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min_num){
                min_num = arr[i];
            }
        }
        return min_num;

    }

    public boolean possible(int[] arr, int day , int m , int k){
        int cnt = 0;
        int noOfBokey = 0;
        for(int i  = 0; i < arr.length; i++){
            if(arr[i] <= day){
                cnt++;
                if(cnt == k){
                    noOfBokey += 1;
                    cnt = 0;
                }
            }
            else{
                cnt = 0;
            }

        }
        
        return noOfBokey >= m;

    }

    public int minDays(int[] bloomDay, int m, int k) {
        int low = min(bloomDay);
        int high = max(bloomDay);
        int total = (int)m * k;
        if(bloomDay.length < total) return -1; 
        int ans = - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            

            if(possible(bloomDay , mid, m , k) == true){
                ans = mid;
                high = mid - 1;

            }
            else low = mid + 1;
        }
        return ans;    
    }

}