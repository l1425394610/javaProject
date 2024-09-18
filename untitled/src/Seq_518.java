import java.util.Arrays;

/**
 * @author luyingjian
 * @date 2024/3/26
 */
public class Seq_518 {
    /**
     * {1,2,5} 5
     * dp[1] = 1,count[1] = 1
     * dp[2]
     */
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];

    }
}
