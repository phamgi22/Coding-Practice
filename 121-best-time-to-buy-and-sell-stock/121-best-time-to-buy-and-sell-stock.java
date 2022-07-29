class Solution {
    public int maxProfit(int[] prices) {
        // using left pointer buy, initialize to 0
        // using right pointer sell, inialize to 1, because sell day is 1 day after buy
        // save a spot to save current calculated profit
        // save a spot to save current max profit
        
        // iterating through each day in the input array starting from day 2
        // if buy day price is less than sell day price, calculate profit  and max profit
        // if sell day prices is less than buy day price,  update buy date to sell day, the cheaper
        // increment selling day
        
       int buy = 0;
        int sell = 1;
        int current = 0;
        int max = 0;
        
        while(sell < prices.length) {
            if(prices[sell] > prices[buy]) {
                current = prices[sell] - prices[buy];
                max = Math.max(max, current);
            } else {
                buy = sell;
            }
            
            sell++;
        }
        
        return max;
    }
}