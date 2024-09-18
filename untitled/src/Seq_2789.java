/**
 * @author luyingjian
 * @date 2024/3/14
 */
public class Seq_2789 {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        int sum = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sum = sum >= nums[i] ? sum + nums[i] : nums[i];
        }
        return sum;

    }
}
