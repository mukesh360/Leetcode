class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        
        int sum = 0;
        int max = 0;
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(sum == 0){
                max = i + 1;
            }
            else if(map.containsKey(sum)){
                max = Math.max(max ,i - map.get(sum));
            }
            else{
                map.put(sum , i);
            }
        
        }
        return max;
    }
}