import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {

        int n = num.length();
        Stack<Character> st = new Stack<>();

        if (k == n) return "0";

        for (int i = 0; i < n; i++) {

            char c = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }

            st.push(c);
        }

        // remove remaining digits
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // build result
        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        res.reverse();

        // remove leading zeros
        while (res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        return res.toString();
    }
}