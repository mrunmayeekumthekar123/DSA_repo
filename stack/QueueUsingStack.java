class MyQueue {

    Stack<Integer> InStack;
    Stack<Integer> OutStack;

    public MyQueue() {
        InStack = new Stack<>();
        OutStack = new Stack<>();
    }
    
    public void push(int x) {
        InStack.push(x);
    }
    
    public int pop() {
        MoveifNeeded();
        return OutStack.pop();
    }
    
    public int peek() {
        MoveifNeeded();
        return OutStack.peek();
    }
    
    public boolean empty() {
        return InStack.isEmpty() && OutStack.isEmpty();
    }

    private void MoveifNeeded(){
        if(OutStack.isEmpty()){
            while(!InStack.isEmpty()){
                OutStack.push(InStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
