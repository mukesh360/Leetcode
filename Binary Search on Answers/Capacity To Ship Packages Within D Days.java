// brute force using linear search
class Solution {
    private int max(int[] arr){
        int maxNum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNum) maxNum = arr[i];
        }
        return maxNum;
    }

    private int sum(int[] arr){
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }

    private int noOfDays(int[] arr, int capacity){
        int days = 1;
        int load = 0;

        for(int i = 0; i < arr.length; i++){
            if(load + arr[i] > capacity){
                days += 1;
                load = arr[i];
            }
            else load += arr[i];
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int total = sum(weights);
        int max = max(weights);

        for(int i = max ; i <= total; i++){
            int daysRequired = noOfDays(weights,i);

            if(daysRequired <= days){
                return i;

            }
            
        }
        return 0;
        
    }
}
// optimal
