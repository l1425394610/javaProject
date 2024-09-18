import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author luyingjian
 * @date 2024/1/11
 */
public class Seq_2645 {

    public int addMinimum(String word) {
        int count = 0;
        for (int i = 1; i < word.length(); i++) {
            count += (word.charAt(i) - word.charAt(i - 1) + 2) % 3;
        }
        count += word.charAt(0) - 'a' + 'c' - word.charAt(word.length() - 1);
        return count;
    }
}
