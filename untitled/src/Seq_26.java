/**
 * @author luyingjian
 * @date 2024/1/29
 */
public class Seq_26 {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
            }
            nums[index] = nums[i];
        }
        return index;
    }
}
