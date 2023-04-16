class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int stackTop = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                stack[stackTop++] = c;
            }
            
            else {
                if (stackTop == 0) return false;
                
                char stkChar = stack[--stackTop];
                
                if (c == ')' && stkChar != '(') return false;
                if (c == '}' && stkChar != '{') return false;
                if (c == ']' && stkChar != '[') return false;
            }
        }
        
        return (stackTop == 0);
    }
}