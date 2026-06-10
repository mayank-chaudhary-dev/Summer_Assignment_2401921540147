class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int l=1;l<=n/2;l++){
            if(n%l!=0)continue;
            String check=s.substring(0,l);
            boolean flag=true;;
            for(int i=l;i<n;i+=l){
                if(!s.substring(i,i+l).equals(check)){
                    flag=false;
                    break;
                }
            }
            if(flag) return true;
        }
        return false;
    }
}