class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int right = arr[n - 1];
        
        ans.add(right);
        
        for(int i = n - 2; i >= 0 ; i--){
            if(arr[i] >= right){
                right = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        
        return ans;
        
    }
}
