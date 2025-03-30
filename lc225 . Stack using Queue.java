class MyStack {
    int count;
    Queue<Integer> q=new LinkedList<>();
   // Queue<Integer> q2=new LinkedList<>();

    public MyStack() {
        count=0;
        
        
    }
    
    public void push(int x) {
        ++count;
        q.add(x);
        
    }
    
    public int pop() {
        for(int i=0;i<count-1;i++){
            q.offer(q.poll());
        }
        --count;

        return q.poll();
        
    }
    
    public int top() {
        int temp=-1;
        for(int i=0;i<count;i++){
            if(i==count-1){
                temp=q.peek();
            }
            q.offer(q.poll());
        }

        return temp;
        
    }
    
    public boolean empty() {
        if(count==0) return true;
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
