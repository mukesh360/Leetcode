class Solution {

    public int trap(int[] arr) {

        int n = arr.length;

        int[] preMax = new int[n];
        int[] sufMax = new int[n];

        // prefix max
        preMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            preMax[i] = Math.max(preMax[i - 1], arr[i]);
        }

        // suffix max
        sufMax[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            sufMax[i] = Math.max(sufMax[i + 1], arr[i]);
        }

        int total = 0;

        for(int i = 0; i < n; i++){

            int water = Math.min(preMax[i], sufMax[i]) - arr[i];
            total += water;
        }

        return total;
    }
}

// alter way 

class Solution {

    public int[] prefixMax(int[] arr){
        int[] preMax = new int[arr.length];

        preMax[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            preMax[i] = Math.max(preMax[i - 1], arr[i]);
        }

        return preMax;
    }

    public int[] sufixMax(int[] arr){
        int[] sufMax = new int[arr.length];

        sufMax[arr.length - 1] = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--){
            sufMax[i] = Math.max(sufMax[i + 1], arr[i]);
        }

        return sufMax;
    }

    public int trap(int[] arr) {

        int[] leftMax = prefixMax(arr);
        int[] rightMax = sufixMax(arr);

        int total = 0;

        for(int i = 0; i < arr.length; i++){
            if(leftMax[i] > arr[i] && rightMax[i] > arr[i]){
                total += Math.min(leftMax[i], rightMax[i]) - arr[i];
            }
        }

        return total;
    }
}