class MyQueue {
    Stack<Integer>st;
    Stack<Integer>tst;

    public MyQueue() {
        st=new Stack<>();
        tst=new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while(st.size()>1){
            int a=st.pop();
            tst.push(a);
        }
        int f=st.pop();
        while(!tst.isEmpty())st.push(tst.pop());
        return f;
    }

    public int peek() {
        while(st.size()>1){
            int a=st.pop();
            tst.push(a);
        }
        int f=st.peek();

        while(!tst.isEmpty())st.push(tst.pop());
        return f;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}