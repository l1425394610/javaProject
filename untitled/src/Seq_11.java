/**
 * @author luyingjian
 * @date 2024/3/5
 */
public class Seq_11 {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = height[left] < height[right] ? Math.max((right - left) * height[left++], max) : Math.max((right - left) * height[right--], max);
        }
        return max;
    }
}
