class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        Integer[] uniques = set.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            if(i < uniques.length){
            nums[i] = uniques[i];
            }
            else{
                nums[i] = 0;
            }
        }
        return uniques.length;
        
    }
}