class Solution {
    public int maxProfit(int[] prices) {
        // exam = [7,1,5,3,6,4]
        int min_so_far = prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++){
             min_so_far = Math.min( prices[i],min_so_far);
             int profit = prices[i]-min_so_far;
             maxProfit = Math.max(profit,maxProfit);
        }
         return maxProfit;
    }
   
}