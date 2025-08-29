import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
    return new ArrayList<>(set);    
    }
}


// #better Solution
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = i+1; j < arr.length; j++){

                int third  = -(arr[i] + arr[j]);

                if(seen.contains(third)){

                List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                Collections.sort(temp);
                set.add(temp);

                }
                seen.add(arr[j]);
                
            }
        }
    return new ArrayList<>(set);    
    }
}

// optimised 
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> triplet = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum < 0){
                    j++;
                    
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    triplet.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;

                }

            }

        }    
    return triplet;    
    }
}