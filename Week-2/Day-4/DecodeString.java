class Solution {
    int i=0;
    public String decodeString(String s) {
        return helper(s);
    }

    public String helper(String s){
        StringBuilder res = new StringBuilder();
        int num=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                i++;
            }
            else if(Character.isLetter(ch)){
                res.append(ch);
                i++;
            }
            else if(ch=='['){
                i++;
                String t=helper(s);
                res.append(t.repeat(num));
                num=0;
            }
            else{
                i++;
                return res.toString();
            }
        }
        return res.toString();
    }
}