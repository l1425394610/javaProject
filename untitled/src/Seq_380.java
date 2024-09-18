import java.util.*;

/**
 * @author luyingjian
 * @date 2024/2/28
 */
public class Seq_380 {
    class RandomizedSet {
        List<Integer> list;
        Map<Integer, Integer> map;
        Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            Integer index = map.get(val);
            Integer temp = list.get(list.size() - 1);
            list.set(index, list.get(list.size() - 1));
            map.put(temp, index);
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}
