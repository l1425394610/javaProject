/**
 * @author luyingjian
 * @date 2024/1/5
 */
public class Seq_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (letters[left] > target) {
            return letters[left];
        }
        return letters[0];
    }
}
