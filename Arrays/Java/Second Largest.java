class Solution {
    public int getSecondLargest(int[] arr) {
        int sMax = -1;
        int maxNum = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNum){
                sMax = maxNum;
                maxNum = arr[i];
            }
            else if(arr[i] > sMax && arr[i] < maxNum){
                sMax = arr[i];
            }
        }
        return sMax;
        
    }
}