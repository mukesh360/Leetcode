class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = (2*n-1); i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i % n]){
                st.pop();
            }
            if(i < n){
                if(st.isEmpty()) nge[i] = -1;
                else nge[i] = st.peek();
            }
            st.push(arr[i % n]);
        }
        return nge;
    }
}