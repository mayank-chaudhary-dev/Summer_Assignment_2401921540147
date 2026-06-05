class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            String curr =strs[i];
            int j=Math.min(curr.length(),ans.length());
            int k;
            for(k=0;k<j;k++){
                if(ans.charAt(k)!=curr.charAt(k)) break;
            }
            if(k==0) return "";
            else ans=ans.substring(0,k);
        }
        return ans;
    }
}