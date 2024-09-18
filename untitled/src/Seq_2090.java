import java.util.Arrays;

/**
 * @author luyingjian
 * @date 2024/9/10
 */
public class Seq_2090 {
//    public int[] getAverages(int[] nums, int k) {
//        int[] arr = new int[nums.length];
//        Arrays.fill(arr, -1);
//        double sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i < k || i >= nums.length - k) {
//                arr[i] = -1;
//            }
//            sum += nums[i];
//
//            if (i >= 2 * k) {
//                arr[i - k] = (int)(sum / (2 * k + 1));
//                sum -= nums[i - 2 * k];
//
//            }
//        }
//        return arr;
//    }

    public int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i < k * 2) {
                arr[i] = -1;
                continue;
            }
            arr[i - k] = (int)sum / (2 * k + 1);
            sum -= nums[i - 2 * k];
        }
        return arr;
    }
}
