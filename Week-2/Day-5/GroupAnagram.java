class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            String key= new String(a);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> w:map.values()){
            ans.add(w);
        }
        return ans;
    }
}