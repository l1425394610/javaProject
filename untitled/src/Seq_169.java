import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luyingjian
 * @date 2024/2/4
 */
public class Seq_169 {

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer target = null;
        for (int val : nums) {
            if (count == 0) {
                target = val;
            }

            count += target == val ? 1 : -1;
        }
        return target;
    }

}
