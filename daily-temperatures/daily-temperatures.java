class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            int currDay = temperatures[i];
            
            while (!stk.isEmpty() && temperatures[stk.peek()] < currDay) {
                int topIndex = stk.pop();
                answer[topIndex] = i - topIndex;
            }
            
            stk.push(i);
        }
        
        return answer;
    }
}