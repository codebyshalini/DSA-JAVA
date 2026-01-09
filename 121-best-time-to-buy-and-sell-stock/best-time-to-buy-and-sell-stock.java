class Solution {
    public int maxProfit(int[] prices) {
        //7,1,5,3,6,4 oindex = min price
       int minPrice = prices[0];
       int maxProfit = 0;// there is no prfit in 1st day;
       // keep tracking from day 2 
       for(int i=0;i<prices.length;i++){
        if(minPrice>prices[i]){
            minPrice = prices[i];//change buy price for buy
            
        }
        else{
            int profit = prices[i]-minPrice;// profit
            maxProfit = Math.max(maxProfit,profit);
        }
       } 
       return maxProfit;

    }
}