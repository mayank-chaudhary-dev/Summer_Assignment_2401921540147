class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int freq[]=new int[26];
        for(char ch:p.toCharArray()){
            freq[ch-'a']++;
        }
        int count=p.length();
        int low=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            if(freq[ch-'a']>0) count--;
            freq[ch-'a']--;
            if(high-low+1>p.length()){
                char left=s.charAt(low);
                if(freq[left-'a']>=0) count++;
                freq[left-'a']++;
                low++;
            }
            if(count==0){
                ans.add(low);
            }
        }
        return ans;
    }
}