class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = prices.length - 1;
        while (l < r) {
            if (prices[l] > prices[r]) {
                l++;
            }
            maxProfit = Math.max(maxProfit, (prices[r] - prices[l]));
            if (prices[l] < prices[r]) r--;
            else l++;
        }
        return maxProfit;
    }
}
