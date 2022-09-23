class MinStack {
    Stack<Integer> s;
    Stack<Integer> t;
    public MinStack() {
        s = new Stack<>();
        t = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        int min = t.isEmpty() || t.peek() > val ? val : t.peek();
        t.push(min);
    }
    
    public void pop() {
        s.pop();
        t.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return t.peek();
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