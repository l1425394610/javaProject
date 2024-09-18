/**
 * @author luyingjian
 * @date 2024/4/9
 */
public class Seq_2529 {
    /**
     * [-2,-1,-1,1,2,3]
     */

    public static void main(String[] args) {
    }

    public int maximumCount(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) a++;
            if (nums[i] < 0) b++;
        }
        return Math.max(a, b);
    }


    public int maximumCount1(int[] nums) {
        int a = test(nums, 0);
        int b = test(nums, 1);
        return Math.max(a, b);
    }

    public int test(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
