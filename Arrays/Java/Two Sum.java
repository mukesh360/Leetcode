class Solution {
    public int[] twoSum(int[] arr, int target) {

        Map<Integer,Integer> set = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int addup = target - arr[i];
            if(set.containsKey(addup)){
                return new int[] {i , set.get(addup)};
            }
            set.put(arr[i] , i);

        }
        return new int[]{};
        
    }
}