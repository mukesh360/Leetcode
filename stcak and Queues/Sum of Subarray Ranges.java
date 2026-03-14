import java.util.*;

class Solution {

    public int[] nge(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n-1; i >= 0; i--){

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();

            st.push(i);
        }
        return nge;
    }

    public int[] pge(int[] arr){
        int n = arr.length;
        int[] pge = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }

            if(st.isEmpty()) pge[i] = -1;
            else pge[i] = st.peek();

            st.push(i);
        }

        return pge;
    }

    public int[] nse(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n-1; i >= 0; i--){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) nse[i] = -1;
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

            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }

            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();

            st.push(i);
        }

        return pse;
    }

    public long subArrayRanges(int[] arr){

        int n = arr.length;

        int[] nge = nge(arr);
        int[] pge = pge(arr);
        int[] nse = nse(arr);
        int[] pse = pse(arr);

        long sumMax = 0;
        long sumMin = 0;

        for(int i = 0; i < n; i++){

            long left = i - pge[i];
            long right = (nge[i] == -1) ? n - i : nge[i] - i;

            sumMax += (long)arr[i] * left * right;

            left = i - pse[i];
            right = (nse[i] == -1) ? n - i : nse[i] - i;

            sumMin += (long)arr[i] * left * right;
        }

        return sumMax - sumMin;
    }
}