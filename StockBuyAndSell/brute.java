import java.util.*;

public class brute {
    public int stockbuySell(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];

                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        brute obj = new brute();
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int result = obj.stockbuySell(prices);

        System.out.println("Maximum Profit: " + result);
    }
}