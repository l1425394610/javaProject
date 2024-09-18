/**
 * @author luyingjian
 * @date 2024/3/26
 */
public class Seq_213 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(getRangeMax(1,nums.length - 1,nums),getRangeMax(0,nums.length - 2,nums));
    }

    public int getRangeMax(int start, int end, int[] nums) {
        int left = 0, right = 0;
        for (int i = start; i <= end; i++) {
            int temp = right;
            right = Math.max(left + nums[i], right);
            left = temp;
        }
        return right;
    }
}
