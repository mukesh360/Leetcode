import java.util.*;

class Solution {

    public static int prior(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        String ans = "";

        for(int i = 0; i < s.length(); i++){

            char currChar = s.charAt(i);

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
                st.pop(); // remove '('
            }

            // operator
            else{
                while(!st.empty() && 
                     (prior(currChar) < prior(st.peek()) ||
                     (prior(currChar) == prior(st.peek()) && currChar != '^'))){
             ans += st.pop();
            }
            st.push(currChar);
            }
        }

        while(!st.empty()){
            ans += st.pop();
        }

        return ans;
    }
}