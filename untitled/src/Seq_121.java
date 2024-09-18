/**
 * @author luyingjian
 * @date 2024/2/23
 */
public class Seq_121 {

    /**
     * [7, 1, 5, 3, 6, 4]
     *  [ -6, 4,-2, 3,-2]
     * @param prices
     * @return
     */

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(prices[i] - min,profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
