class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int i=-1;
        for(int j=0;j<n;j++){
            if(nums[j]<0){
                i=j;
            }else break;
        }
        if(i!=-1){
            int k=i;
            int j=0;
            int l=i+1;
            int res[]=new int[n];
            while(k>=0&&l<n){
                if(nums[k]*nums[k]<=nums[l]*nums[l]){
                    res[j]=nums[k]*nums[k];
                    k--;
                }else{
                    res[j]=nums[l]*nums[l];
                    l++;
                }j++;
            }
            while(k>=0){
                res[j]=nums[k]*nums[k];
                j++;
                k--;
            }
            while(l<n){
                res[j]=nums[l]*nums[l];
                l++;
                j++;
            }return res;
        }else{
            for(int h=0;h<n;h++){
                nums[h]=nums[h]*nums[h];
            }return nums;
        }
        
    }
}