class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[i]<=heights[st.peek()]) st.pop();
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        st.clear();

        int[] pse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[i]<=heights[st.peek()]) st.pop();
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }

        int max=0;
        for(int i=0;i<n;i++){
            int cur=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(cur,max);
        }
        return max;
    }
}