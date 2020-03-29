package Array;

public class Leetcode122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int sum_profit = 0;
        for (int i = 0; i <= prices.length - 2; i++) {
            int dif = prices[i + 1] - prices[i];
            sum_profit += (dif > 0) ? dif : 0;
        }
        return sum_profit;
    }
}
