import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // opening brackets
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;

                char el = st.pop();
              

                if(ch == ')' && el != '(') return false;
                if(ch == '}' && el != '{') return false;
                if(ch == ']' && el != '[') return false;
            }
        }

        return st.isEmpty();
    }
}