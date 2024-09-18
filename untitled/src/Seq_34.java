/**
 * @author luyingjian
 * @date 2024/1/2
 */


public class Seq_34 {
    public static void main(String[] args) {
        Seq_34 obj = new Seq_34();
        obj.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
    }

    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch1(nums, target);
        int right = binarySearch2(nums, target);
        if (nums[left] == target) {
            if (left != right) {
                right--;
            }
            return new int[]{left, right};
        } else {
            return new int[]{-1, -1};
        }
    }

    public Integer binarySearch1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int index = left + (right - left) / 2;
            if (nums[index] < target) {
                left = index + 1;
            } else {
                right = index;
            }
        }
        return left;
    }

    public Integer binarySearch2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int index = left + (right - left) / 2;
            if (nums[index] > target) {
                right = index;
            } else {
                left = index + 1;
            }
        }
        return right;
    }


}
