import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author luyingjian
 * @date 2024/1/10
 */
public class Seq_383 {

    //    97~122
//    a-z
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            arr[c - 97]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            arr[c - 97]--;
            if (arr[c-97] < 0){
                return false;
            }
        }
        return true;
    }

}
