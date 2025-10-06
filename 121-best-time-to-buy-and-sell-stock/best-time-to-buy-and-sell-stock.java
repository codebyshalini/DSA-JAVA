class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = prices[0];
        for(int i=0;i<n;i++){
            int currentProfit = prices[i]-buyPrice;
            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
            if(buyPrice>prices[i]){
                buyPrice = prices[i];

            }
        }
        return maxProfit;
    }
}