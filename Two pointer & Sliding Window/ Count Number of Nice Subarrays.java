public class Solution {
    public int subArr(int[] arr, int goal) {
        if (goal < 0) return 0;

        int l = 0, r = 0;
        int sum = 0, cnt = 0;

        while (r < arr.length) {
            sum += (arr[r] % 2);

            while (sum > goal) {
                sum -= (arr[l] % 2);
                l++;
            }

            cnt += (r - l + 1);
            r++;
        }

        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return subArr(nums, k) - subArr(nums, k - 1);
    }
} {
    
}
