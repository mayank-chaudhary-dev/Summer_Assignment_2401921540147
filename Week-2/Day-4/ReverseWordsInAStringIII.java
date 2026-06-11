class Solution {
    public String reverseWords(String s) {
        if(s.length()==1) return s;
        int i=0;
        int j=0;
        String res="";
        for(j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch!=' '&&j!=s.length()-1) continue;
            else if(j==s.length()-1){
                String c=rev(s.substring(i,j+1));
                res+=c;
            }
            else{
                String c=rev(s.substring(i,j));
                res+=c;
                if(j<s.length()) res+=' ';
                i=j+1;
            }
        }
        return res;
    }
    public String rev(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return new String(arr);
    }
}