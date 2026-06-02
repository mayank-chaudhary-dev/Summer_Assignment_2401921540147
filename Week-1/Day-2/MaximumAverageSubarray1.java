class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l=0;
       int h=k-1;
       double sum=0;
       for(int i=l;i<=h;i++){
        sum+=nums[i];
       }
       double res =sum/k;
       while(h<nums.length){
        res=Math.max(res,sum/k);
        l++;
        h++;
        if(h==nums.length) break;
        sum=sum-nums[l-1];
        sum=sum+nums[h];
       }
       return res;
    }
}