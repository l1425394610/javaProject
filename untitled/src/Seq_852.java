/**
 * @author luyingjian
 * @date 2024/1/5
 */
public class Seq_852 {
//        0,3,5,12,2
//    left: 0,right: 4,mid: 2,arr[mid]: 5
//    left: 1,right: 4,mid: 2,arr[mid]: 5
//    left: 2,right: 4,mid: 3,arr[mid]: 12
//    left: 2,right: 3,mid: 2,arr[mid]: 5
//    left: 3,right: 3,mid: 3,arr[mid]: 12
//    left: 4,right: 3,mid: 3,arr[mid]: 12
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        int index = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(left + "---" +right);
            if (arr[mid] > arr[mid + 1]) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}
