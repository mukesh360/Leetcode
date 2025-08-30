import java.util.*;
// brute force 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < m; i++){
            result.add(nums1[i]);
        }

        for(int i = 0; i < n; i++){
            result.add(nums2[i]);
        }
        Collections.sort(result);

        for(int i = 0;i < result.size();i++){
            nums1[i] = result.get(i);
        }
        
        
    }
}

// most optimised solution using two pointer
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
        
    }
}
