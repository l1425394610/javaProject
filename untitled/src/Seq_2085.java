import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author luyingjian
 * @date 2024/1/12
 */
public class Seq_2085 {

    /**
     * 2085. 统计出现过一次的公共字符串
     */

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : words1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str : words2) {
            if (map.containsKey(str)) {
                if (map.get(str) == 1) {
                    map.put(str, 0);
                } else {
                    map.remove(str);
                }
            }
        }
        int count = 0;
        Set<String> keys = map.keySet();
        for (String key : keys) {
            if (map.get(key) == 0) count++;
        }
        return count;
    }
}
