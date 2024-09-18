/**
 * @author luyingjian
 * @date 2024/1/5
 */
public class Seq_367 {

    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = (num + 1) / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long result = mid * mid;
            if (result == num) {
                return true;
            } else if (result > num) {
                right = mid - 1;
            } else {
                left = mid +1;
            }
        }
        return false;
    }
}
