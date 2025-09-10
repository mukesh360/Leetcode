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
// optmized 
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

        
    }
}