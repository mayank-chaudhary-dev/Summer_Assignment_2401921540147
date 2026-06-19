class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int n=nums.length;
        int max[]=new int[n-k+1];
        int i=0;
        int l=0;
        for(int h=0;h<n;h++){
            if(d.size()>0&&d.peekFirst()<l) d.pollFirst();
            while(d.size()>0&&nums[d.peekLast()]<=nums[h]) d.pollLast();
            d.addLast(h);
            if(h>=k-1){
                max[i++]=nums[d.peekFirst()];
                l++;
            }
        }
        return max;
    }
}