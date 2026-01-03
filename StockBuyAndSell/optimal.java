import java.util.*;

public class optimal {
    public int stockbuySell(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        optimal obj = new optimal();
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int result = obj.stockbuySell(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
