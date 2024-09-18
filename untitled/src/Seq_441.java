/**
 * @author luyingjian
 * @date 2024/1/5
 */
public class Seq_441 {

//    [n(n+1)]/ 2

    public static void main(String[] args) {

        arrangeCoins2(5);
    }

    public int arrangeCoins(int n) {
        int index = 1;
        int count = 0;
        while (index <= n) {
            count++;
            n -= index++;
        }
        return count;
    }

    public static int arrangeCoins2(int n) {
        long left = 1;
        long right = n;
        while (left < right) {
            long mid = (left + right + 1) / 2;
            if ((mid * (mid + 1)) / 2 <= n) {
                left = mid;
            } else {
                right = mid-1;
            }
        }
        return (int) left;
    }
}
