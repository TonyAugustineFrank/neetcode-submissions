class MinStack {
    Stack <Integer> main;
    Stack<Integer> min;
    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        min.push(Math.min(val,min.isEmpty()?val:min.peek()));
    }
    
    public void pop() {
        main.pop();
        min.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
