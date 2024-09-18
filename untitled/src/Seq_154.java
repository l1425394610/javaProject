/**
 * @author luyingjian
 * @date 2024/1/4
 */
public class Seq_154 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,3,1,3};
        System.out.println(findMin(arr));
    }

//    3,3,1,3
//    left: 0,right: 3,mid: 1,nums[mid]: 3
//    left: 2,right: 3,mid: 2,nums[mid]: 1

//    1,3,3
//    left: 0,right: 2,mid: 1,nums[mid]: 3
//    left: 2,right: 3,mid: 2,nums[mid]: 1

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]){
                right = mid;
            }else {
                right = right - 1;
            }
        }
        return nums[left];

    }

}
