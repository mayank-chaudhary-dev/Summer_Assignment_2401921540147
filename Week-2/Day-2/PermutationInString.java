class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq=new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        int count=s1.length();
        int low=0;
        for(int high=0;high<s2.length();high++){
            if(freq[s2.charAt(high)-'a']>0) count--;
            freq[s2.charAt(high)-'a']--;
            if(high-low+1>s1.length()){
                if(freq[s2.charAt(low)-'a']>=0) count++;
                freq[s2.charAt(low)-'a']++;
                low++;
            }
            if(count==0) return true;
        }return false;
    }