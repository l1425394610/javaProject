/**
 * @author luyingjian
 * @date 2024/3/5
 */
public class Seq_167 {

    public static void main(String[] args) {
        twoSum(new int[]{-1,0},-1);
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            int left = 0;
            while (i > left) {
                System.out.println();
                int res = numbers[i] + numbers[left];
                if (res == target) {
                    return new int[]{left + 1, i + 1};
                } else if (res < target) {
                    left++;
                } else if (res > target) {
                    break;
                }
            }
        }
        return new int[]{};
    }
}
