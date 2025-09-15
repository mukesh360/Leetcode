class Solution {
    public int subarraySum(int[] arr, int k) {
        
        Map<Integer,Integer> prefixCnt = new HashMap<>();
        prefixCnt.put(0,1);

        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if (prefixCnt.containsKey(sum - k)) {
                cnt += prefixCnt.get(sum - k);
            }

            prefixCnt.put(sum, prefixCnt.getOrDefault(sum, 0) + 1);
        } 

    return cnt;    
    }
}