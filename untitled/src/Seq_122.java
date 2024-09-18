/**
 * @author luyingjian
 * @date 2024/2/23
 */
public class Seq_122 {

    public int maxProfit(int[] prices) {
        // 0:无股票，1:有股票
        int[][] profit = new int[prices.length][2];
        profit[0][0] = 0;
        profit[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit[i][0] = Math.max(profit[i - 1][0], profit[i - 1][1] + prices[i]);
            profit[i][1] = Math.max(profit[i - 1][0] - prices[i], profit[i - 1][1]);
        }
        return profit[prices.length - 1][0];
    }

    public int maxProfit1(int[] prices) {
        // 0:无股票，1:有股票
       int noStock = 0;
       int hasStock = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            noStock = Math.max(noStock, hasStock + prices[i]);
            hasStock = Math.max(noStock - prices[i], hasStock);
        }
        return noStock;
    }
}
