/**
 * @author luyingjian
 * @date 2024/9/10
 */
public class Seq_1343 {

    /**
     * a b c d
     * avg = (a+b+c)/3
     * avg-a/3
     */
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int target = k * threshold;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < k - 1) {
                continue;
            }
            if (sum >= target) {
                count++;
            }
            sum -= arr[i + 1 - k];
        }
        return count;
    }
}
