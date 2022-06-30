class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (c == '(') stk.push(c);
            if (c == '{') stk.push(c);
            if (c == '[') stk.push(c);
            
            if (stk.empty()) return false;
            
            if (c == ')') {
                char poped = stk.pop();
                if (poped != '(') return false;
            }
            
            if (c == '}') {
                char poped = stk.pop();
                if (poped != '{') return false;
            }
            
            if (c == ']') {
                char poped = stk.pop();
                if (poped != '[') return false;
            }
        }
        
        if (stk.empty()) return true;
        else return false;
    }
}