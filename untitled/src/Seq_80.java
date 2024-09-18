/**
 * @author luyingjian
 * @date 2024/1/30
 */
public class Seq_80 {

    public static void main(String[] args) {
        System.out.println("2820712152120972220210".length());
    }
    /**
     * 80. 删除有序数组中的重复项 II
     */

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return 2;
        int index = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[index] != nums[i] || nums[index - 1] != nums[i]) {
                index++;
            }
            nums[index] = nums[i];
        }
        return index;
    }
}
