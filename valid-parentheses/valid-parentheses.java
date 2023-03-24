class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else {
                if (stack.empty() || !isMatchingBracket(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private boolean isOpenBracket(char c) {
        return c == '[' || c == '{' || c == '(';
    }

    private boolean isMatchingBracket(char open, char close) {
        return (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');
    }
}