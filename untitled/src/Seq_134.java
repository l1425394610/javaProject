import java.util.Arrays;

/**
 * @author luyingjian
 * @date 2024/2/29
 */
public class Seq_134 {

    /**
     * gas  [1,2,3,4,5]
     * cost [3,4,5,1,2]
     * [-2,-2,-2,3,3]
     *
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = gas[i] - cost[i];
            max += arr[i];
        }
        if (max < 0) return -1;

        int index = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
            if (res < 0) {
                index++;
                res = 0;
            }
        }
        return index;


    }
}
