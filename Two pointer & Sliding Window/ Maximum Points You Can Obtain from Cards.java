class Solution {
    public int maxScore(int[] arr, int k) {
        int leftSum = 0 , rightSum = 0;
        int maxSum = 0;

        for(int i = 0; i < k; i++){
            leftSum += arr[i];
        }
        maxSum = leftSum;

        int rightIndex = arr.length - 1;
        for(int i = k - 1; i >= 0; i--){
            leftSum -= arr[i];
            rightSum += arr[rightIndex];
            rightIndex--;

            maxSum = Math.max((leftSum + rightSum) , maxSum);
        }
        return maxSum;

    }
}