class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty()){
            return s;
        }
        
        int top=s.pop(); // top ko nikaal do baki ko sort kr do 
        sort(s);
        insertSorted(s,top); // top ko shi jgh rkh do
        return s;
    }
    private void insertSorted(Stack<Integer> s,int element){
        if(s.isEmpty()|| s.peek()<element){ // agr element top se bda h toh seedhe push kr do
            s.push(element);
            return;
        }else{
            int top=s.pop();           // agr element top se bda nhi h toh top ko nikaalo phle
            insertSorted(s,element); // element ko shi pos m daalo recursively
            s.push(top);    // ab top ko bhi push kr do
        }
        
    }
}
