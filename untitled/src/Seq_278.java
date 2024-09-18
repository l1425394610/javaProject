/**
 * @author luyingjian
 * @date 2024/1/4
 */
public class Seq_278 {

//    1,2,3,4,5,6 target: 3
//    left: 1,right: 6,mid: 3,
//    left: 1,right: 2,mid: 3,

//    1 target: 1
//    left: 1,right: 1,mid: 1,
//    left: 2,right: 2,mid: 2,
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        int index = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
                index = mid;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    static boolean isBadVersion(int n) {
        return true;
    }


}
