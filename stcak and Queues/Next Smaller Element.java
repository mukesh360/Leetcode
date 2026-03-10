class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
        int[] nge = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n - 1; i >= 0; i--){

            while(!st.isEmpty() && st.peek() >= arr[i]){
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