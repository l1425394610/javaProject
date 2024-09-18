/**
 * @author luyingjian
 * @date 2024/2/4
 */
public class Seq_189 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("123");
    }

    /**
     * [1,2,3,4,5,6,7] => [5,6,7,1,2,3,4]
     * len = 7
     * left = 0, right = 6
     */

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(0, nums.length - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length - 1, nums);
    }

    public void reverse(int left, int right, int[] arr) {
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
