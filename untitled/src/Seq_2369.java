import java.util.Arrays;

/**
 * @author luyingjian
 * @date 2024/3/14
 */
public class Seq_2369 {
    public boolean validPartition(int[] nums) {
        boolean[] dp = new boolean[nums.length + 1];
        dp[0] = true;
        for (int i = 1; i <= nums.length; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 2] && validTwo(nums[i - 2], nums[i - 1]);
            }

            if (i >= 3) {
                dp[i] = dp[i] || (dp[i - 3] && validThree(nums[i - 3], nums[i - 2], nums[i - 1]));
            }
        }
        return dp[nums.length];
    }
    public boolean validTwo(int first, int second) {
        return first == second;
    }
    public boolean validThree(int first, int second, int third) {
        return (first == second && first == third) || (first + 1 == second && second + 1 == third);
    }
}
