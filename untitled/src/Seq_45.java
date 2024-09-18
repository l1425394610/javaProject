/**
 * @author luyingjian
 * @date 2024/2/26
 */
public class Seq_45 {
    /**
     * [2,3,1,1,4]
     * [1,2,1,1,1]
     */

    public int jump(int[] nums) {
        int step = 0;
        int maxLength = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxLength = Math.max(maxLength, nums[i] + i);
            if (end == i) {
                end = maxLength;
                step++;
            }
        }
        return step;
    }

    public int jump1(int[] nums) {
        int step = 0;
        int maxLength = 0;
        int start = 0;
        int end = 1;
        while (end < nums.length) {
            for (int i = start; i < end; i++) {
                maxLength = Math.max(maxLength, nums[i] + i);
            }
            start = end;
            end = maxLength + 1;
            step++;
        }
        return step;
    }
}
