import java.util.*;

class Solution {

    public static int prior(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static String infixToPrefix(String s){

        // Step 1: reverse string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();

        // Step 2: swap brackets
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(') arr[i] = ')';
            else if(arr[i] == ')') arr[i] = '(';
        }

        Stack<Character> st = new Stack<>();
        String ans = "";

        for(int i = 0; i < arr.length; i++){

            char currChar = arr[i];

            // operand
            if(Character.isLetterOrDigit(currChar)){
                ans += currChar;
            }

            // opening bracket
            else if(currChar == '('){
                st.push(currChar);
            }

            // closing bracket
            else if(currChar == ')'){
                while(!st.empty() && st.peek() != '('){
                    ans += st.pop();
                }
                st.pop();
            }

            // operator
            else{
                while(!st.empty() && 
                     (prior(currChar) < prior(st.peek()) ||
                     (prior(currChar) == prior(st.peek()) && currChar == '^'))){
                    ans += st.pop();
                }
                st.push(currChar);
            }
        }

        while(!st.empty()){
            ans += st.pop();
        }

        // Step 4: reverse postfix → prefix
        StringBuilder res = new StringBuilder(ans);
        res.reverse();

        return res.toString();
    }
}