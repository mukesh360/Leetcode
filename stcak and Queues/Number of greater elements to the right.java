
class Solution {
    public static int[] count_NGE(int arr[], int index[]) {
        // code here
        int n = arr.length;
        int q = index.length;
        
        int[] ans = new int[q];
        
        for(int i = 0; i < q; i++){
            int idx = index[i];
            int cnt = 0;
            
            for(int j = idx + 1; j < n; j++){
                if(arr[j] > arr[idx]){
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
