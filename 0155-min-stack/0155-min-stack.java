class MinStack {
    Stack<Integer> res;
    public MinStack() {
        res=new Stack<>();
    }
    
    public void push(int val) {
        res.push(val);
    }
    
    public void pop() {
        if(!res.isEmpty()){
            res.pop();
        }
    }
    
    public int top() {
        return res.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;

        for(int x : res){
            if(x<min){
                min=x;
            }
        }
        return min;
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