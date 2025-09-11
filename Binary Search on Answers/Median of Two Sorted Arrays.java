// brute force it's not working 
class Solution {
    private int mergeArray(int[] nums1, int[] nums2){
       int i = nums1.length - 1;
       int j = nums2.length - 1;
       int k = nums1.length + nums2.length - 1;

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
    private double findMedian(int[] nums1){
        int n = nums1.length;

       if(n % 2 == 1){
         return  nums1[n / 2];
       }
       else{
         return (nums1[n / 2 - 1] + nums1[n / 2]) / 2.0;
       }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        merged = mergeArray(nums1, nums2);
        return findMedian(merged);
        
    }
}
