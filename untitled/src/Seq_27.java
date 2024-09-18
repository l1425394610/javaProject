/**
 * @author luyingjian
 * @date 2024/1/29
 */
public class Seq_27 {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            while (nums[left] != val && left < right) left++;

            while (nums[right] == val && left < right) right--;
            if (left <= right && nums[right] != val) {
                nums[left++] = nums[right--];
            }
        }
        return left;
    }
}
