import java.util.HashMap;
import java.util.Map;

/**
 * @author luyingjian
 * @date 2024/2/23
 */
public class Seq_55 {

    /**
     * [2,3,1,1,4]
     *
     * @param nums
     * @return
     */

    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) return false;
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
