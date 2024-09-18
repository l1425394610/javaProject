/**
 * @author luyingjian
 * @date 2024/2/28
 */
public class Seq_238 {
    /**
     * [1,2,3,4]
     * [1,1,2,6]
     * [24,12,8,6]
     *
     * @param nums
     * @return
     */

    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 1, end = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = start;
            start *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = end * arr[i];
            end *= nums[i];
        }
        return arr;
    }
}
