class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a= new ArrayList<>();
        helper("",n,0,0,a);
        return a;
    }
    public void helper(String ans,int n,int l,int r,List<String> a){
        if(r==n){
            a.add(ans);
            return;
        }
        if(l<n) helper(ans+'(',n,l+1,r,a);
        if(r<l) helper(ans+')',n,l,r+1,a);
    }
}