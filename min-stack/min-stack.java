class MinStack {
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<Integer> minStack = new LinkedList<>();
    
    public MinStack() {

    }
    
    public void push(int val) {
        list.addFirst(val);
        
        if (minStack.size() == 0) minStack.add(val);
        else {
            if (minStack.getFirst() < val) minStack.addFirst(minStack.getFirst());
            else minStack.addFirst(val);
        }
    }
    
    public void pop() {
        list.removeFirst();
        minStack.removeFirst();
    }
    
    public int top() {
        return list.getFirst();
    }
    
    public int getMin() {
        return minStack.getFirst();
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */