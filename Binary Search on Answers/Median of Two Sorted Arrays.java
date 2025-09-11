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
/// optimal
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;

        if(n1 > n2) return findMedianSortedArrays(b , a);

        int low = 0;
        int high = n1;
        int left = (n1 + n2 -1) /2;
        int n = n1 + n2;

        while(low <= high){
            int mid1 = (low + high) / 2;
            int mid2 = (n + 1) / 2 - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if(mid1 < n1) r1 = a[mid1];
            if(mid2 < n2) r2 = b[mid2];

            if(mid1 > 0) l1 = a[mid1 - 1];
            if(mid2 > 0) l2 = b[mid2 - 1];

            if(l1 <= r2 && l2 <= r1){
                if(n % 2 == 1) return Math.max(l1, l2);
                return (double)(Math.max(l1 , l2) + Math.min(r1 , r2)) / 2.0;
            }
            else if(l1 > r2){
                high  = mid1- 1;
            }
            else low = mid1 + 1;
        }
      return 0.0;  
    }
}