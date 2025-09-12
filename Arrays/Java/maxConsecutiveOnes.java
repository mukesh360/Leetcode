class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCnt = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCnt = Math.max(count , maxCnt);
            }
            else count = 0;
        }
        return maxCnt;

    }
}