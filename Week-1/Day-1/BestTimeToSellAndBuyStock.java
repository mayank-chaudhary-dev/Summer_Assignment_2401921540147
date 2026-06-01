class Solution {
    public int maxProfit(int[] prices) {
        int maxprof=0;
        int min =prices[0];
        for(int i=1;i<prices.length;i++){
            int currprof=prices[i]-min;
            maxprof=Math.max(maxprof,currprof);
            min=Math.min(prices[i],min);
        }return maxprof;
    }
}