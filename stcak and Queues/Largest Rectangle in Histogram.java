import java.util.*;

class Solution {

    public int[] nse(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n-1; i >= 0; i--){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }

        return nse;
    }

    public int[] pse(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();

            st.push(i);
        }

        return pse;
    }

    public int largestRectangleArea(int[] heights) {

        int[] pse = pse(heights);
        int[] nse = nse(heights);

        int max = 0;

        for(int i = 0; i < heights.length; i++){
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}