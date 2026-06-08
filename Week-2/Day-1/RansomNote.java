class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())return false;
        int freq1[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq1[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(freq1[ch-'a']>0){
                freq1[ch-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}