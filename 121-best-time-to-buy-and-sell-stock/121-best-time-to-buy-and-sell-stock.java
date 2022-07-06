class Solution {
    public int maxProfit(int[] prices) {
    // use two pointers to represent left and right/buy and sell
    // calculate current profit and compare to the max profit
        int left = 0;
        int right = 1;
        int current = 0;
        int max = 0;
        
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                current = prices[right] - prices[left];
                max = Math.max(max, current);
            } else {
                left = right;
            }
            
            right++;
        }
        
        return max;
        
    }
}