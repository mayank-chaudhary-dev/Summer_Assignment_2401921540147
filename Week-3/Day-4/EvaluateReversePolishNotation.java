class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(switch(s){
                    case "+"->b+a;
                    case "-"->b-a;
                    case "*"->b*a;
                    case "/"->b/a;
                    default ->-1;
                });
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}