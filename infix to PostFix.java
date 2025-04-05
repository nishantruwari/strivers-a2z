class Solution {
    static String preToInfix(String p) {
        StringBuilder str=new StringBuilder(p);
        Stack<String> st=new Stack<>();
        str.reverse();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }else{
                
                if(st.isEmpty()){
                    return "Invalid String";
                }
                String s1=new String("("+st.pop());
                String s2=new String(st.pop());
                s1+=c;
                s1+=s2;
                s1+=")";
                st.push(s1);
            }
            
            
            
        }
        return st.pop();
        
        // code here
    }
        
    static int valueOf(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // for non-operators
        }
    }

    static void solve(String s, StringBuilder str, int i, Stack<Character> st) {
        if (i == s.length()) {
            // At the end of the expression, pop all operators left in the stack
            while (!st.isEmpty()) {
                str.append(st.pop());
            }
            return;
        }
        
        char ch = s.charAt(i);
        
        // If the character is an operand (letter or digit), add it to the result
        if (Character.isLetterOrDigit(ch)) {
            str.append(ch);
        }
        // If it's an opening parenthesis, push it to the stack
        else if (ch == '(') {
            st.push(ch);
        }
        // If it's a closing parenthesis, pop from the stack until we get the opening parenthesis
        else if (ch == ')') {
            while (!st.isEmpty() && st.peek() != '(') {
                str.append(st.pop());
            }
            st.pop(); // pop the '(' from stack
        }
        // If it's an operator, check precedence and manage the stack
        else {
            while (!st.isEmpty() && valueOf(ch) <= valueOf(st.peek())) {
                str.append(st.pop());
            }
            st.push(ch);
        }
        
        // Recurse to the next character in the string
        solve(s, str, i + 1, st);
    }

    public static String infixToPostfix(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        solve(s, str, 0, st);
        return str.toString();
    }
    
    
    static String preToPost(String pre_exp) {
        String str=preToInfix(pre_exp);
        
        return infixToPostfix(str);
        // code here
    }
}
