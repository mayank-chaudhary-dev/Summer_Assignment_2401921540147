class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a= target-nums[i];
            if(map.containsKey(a)){
                int b= map.get(a);
                return new int[] {b,i}; 
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[] {0,0};
    }
}