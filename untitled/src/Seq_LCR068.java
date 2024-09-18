/**
 * @author luyingjian
 * @date 2024/1/2
 */


public class Seq_LCR068 {

    /**
     * 给定一个排序的整数数组 nums 和一个整数目标值 target ，请在数组中找到 target ，
     * 并返回其下标。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left > right){
            return left;
        }else {
            return right;
        }
    }
}
