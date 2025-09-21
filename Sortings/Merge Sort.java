class Solution {
    public void mS(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        
        mS(arr,low,mid);
        mS(arr,mid + 1,high);
        mergeArray(arr , low , mid , high);
    }
    public void mergeArray(int[] arr, int low , int mid, int high){
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> sorted = new ArrayList<>();
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                sorted.add(arr[left]);
                left++;
            }
            else{
                sorted.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            sorted.add(arr[left]);
            left++;
        }
        while(right <= high){
            sorted.add(arr[right]);
            right++;
        }
        
        for(int i = low; i <= high; i++){
            arr[i] = sorted.get(i - low);
        }
    }
    

    void mergeSort(int arr[], int l, int r) {
        
        mS(arr, l, r);
        
        
    }
}