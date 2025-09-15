class Solution {
    public int singleNumber(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }    
            }
            if(cnt == 1){
                return arr[i];
            }

        }
     return 0;   
    }
}
// optimal
class Solution {
    public int singleNumber(int[] arr) {
        int unique = 0;

        for(int i = 0; i < arr.length; i++){
            unique = unique ^ arr[i];
        }
        return unique;
    }
}