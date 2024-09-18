import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author luyingjian
 * @date 2024/3/26
 */
public class Seq_322 {
    /**
     * {1,2,5} 11
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount + 1] > amount + 1 ? -1 : dp[amount + 1];

    }
}
