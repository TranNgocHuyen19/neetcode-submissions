class MinStack {

    Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) 
            return;
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = stack.peek();
        Deque<Integer> tmp = new ArrayDeque<>();

        while(!stack.isEmpty()) {
            min = Math.min(min, stack.peek());
            tmp.push(stack.pop());
        }

        while(!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return min;
    }
}