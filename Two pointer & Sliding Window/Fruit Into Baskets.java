class Solution {
    public int totalFruit(int[] arr) {
        int l = 0 , r = 0, maxLen = 0;
        Map<Integer , Integer> map = new HashMap<>();

        while(r < arr.length){
            if(map.containsKey(arr[r])) {
                map.put(arr[r] , map.get(arr[r]) +1);
            }
            else{
              map.put(arr[r] , 1);   
            }

            while(map.size() > 2){
                map.put(arr[l] , map.get(arr[l]) - 1);
                if(map.get(arr[l]) == 0){
                    map.remove(arr[l]);
                }
                l++;
            }
            if(map.size() <= 2){
                maxLen = Math.max(maxLen , r - l + 1);
            }
            r++;
        }
        return maxLen;
        
    }
}