/**
 * @author luyingjian
 * @date 2024/3/6
 */
public class Seq_2917 {


    public static void main(String[] args) {
        int[] arr = new int[]{10,8,5,9,11,6,8};
        findKOr(arr, 1);
    }

    public static int findKOr(int[] nums, int k) {
        int res = 0;
        int[] arr = new int[31];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int temp = 1;
            int index = 0;
            while (num > 0) {
                if ((num & temp) == temp) {
                    arr[index++]++;
                }
                num >>= 1;
                temp <<= 1;
            }
        }
        return res;
    }

}
