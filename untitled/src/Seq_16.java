/**
 * @author luyingjian
 * @date 2024/1/2
 * <p>
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 */


import java.util.Arrays;

public class Seq_16 {
    public  int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return sum;

                if (Math.abs(target - sum) < Math.abs(target - temp)){
                    temp = sum;
                }
                if (sum > target) {
                    right--;
                }else {
                    left++;
                }
            }
        }
        return temp;
    }
}
