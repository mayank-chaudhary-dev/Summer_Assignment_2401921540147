class Solution {
    public int compress(char[] chars) {
        int i=0;
        int w=0;
        while(i<chars.length){
            int j=i;
            while(j<chars.length&&chars[i]==chars[j]){
                j++;
            }
            int count=j-i;
            chars[w++]=chars[i];
            if(count>1){
                String c=String.valueOf(count);
                for(char ch:c.toCharArray()){
                    chars[w++]=ch;
                }
            }
            i=j;
        }
        return w;
    }
}