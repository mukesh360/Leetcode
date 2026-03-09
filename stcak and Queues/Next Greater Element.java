import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        int[] nge = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n - 1; i >= 0; i--){

            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }

            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();

            st.push(arr[i]);
        }

        ArrayList<Integer> res = new ArrayList<>(n);

        for(int x : nge){
            res.add(x);
        }

        return res;
    }
}