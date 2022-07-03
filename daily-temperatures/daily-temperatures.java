class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] answer = new int[size];
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < size; i++) {
            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {
                int topIndex = stk.pop();
                answer[topIndex] = i - topIndex;
            }
            
            stk.push(i);
        }
        
        return answer;
    }
}