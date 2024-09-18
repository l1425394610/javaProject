/**
 * @author luyingjian
 * @date 2024/3/29
 */
public class Seq_2908 {

    public int minimumSum(int[] nums) {
        int min = 1000;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = i + 2;
            while (right < nums.length) {
                if (nums[i] < nums[left] && nums[right] > nums[left]) {
                    min = Math.min(nums[i] + nums[left] + nums[right], min);
                }
                left++;
                right++;
            }
        }
        return min == 1000 ? -1 : min;
    }
}
