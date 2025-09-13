class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return   new int[]{i , j};
                }
            }
        }
        return new int[]{};
        
    }
}
//
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