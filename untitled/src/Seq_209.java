/**
 * @author luyingjian
 * @date 2024/3/15
 */
public class Seq_209 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};
        minSubArrayLen(7, arr);
    }

    /**
     * [2,3,1,2,4,3] 7
     * left=0,right=0,sum=2,min=7
     * left=0,right=1,sum=5,min=7
     * left=0,right=2,sum=6,min=7
     * left=0,right=3,sum=8,min=7
     * left=1,right=3,sum=6,min=3
     * left=1,right=4,sum=10,min=3
     */

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = nums[0];
        int minLength = nums.length + 1;
        while (left <= right && right < nums.length) {
            if (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            } else {
                right++;
                if (right <= nums.length - 1) sum += nums[right];
            }


        }
        return minLength == nums.length + 1 ? 0 : minLength;
    }
}
