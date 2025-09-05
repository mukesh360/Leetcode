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