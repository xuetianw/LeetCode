package Array;

public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int lowest_price = Integer.MAX_VALUE;
        int largest_benifit = 0;

        for (int price : prices) {
            if (price < lowest_price) {
                lowest_price = price;
            } else {
                int current_difference = price - lowest_price;
                largest_benifit = Math.max(largest_benifit, current_difference);
            }
        }
        return largest_benifit;
    }
}
