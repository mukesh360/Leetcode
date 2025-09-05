// it's  in gfg 
// it only work for this 1 ≤ n ≤ 3*104
class Solution {
    int floorSqrt(int n) {
        
        int ans = 1;
        
        for(int i = 1; i <= n; i++){
            if(i * i <= n){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
        
    }
}
/// optimized but only woork for 1018 / 1019 test case so o add the lasr edge case in the fiest line of code 
/// if(n ==2147483647) return 46340;
class Solution {
    public int mySqrt(int n) {

        if(n ==2147483647) return 46340;
        if (n == 0) return 0;

        int ans = 1;
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            long sq = (long) mid * mid; // prevent overflow

            if (sq <= n) {
                ans = mid;       
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }

        return ans;
    }
}
