class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k){
                k++;
            }
            else break;
        }
        return k;
    }
}
///optimal
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Missing numbers before arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                // Need more missing numbers → go right
                low = mid + 1;
            } else {
                // Enough missing numbers → go left
                high = mid - 1;
            }
        }

        // kth missing number is before arr[low]
        return low + k;
    }
}
