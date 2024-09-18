/**
 * @author luyingjian
 * @date 2024/3/22
 */
public class Seq_2710 {
    public String removeTrailingZeros(String num) {
        int right = num.length() - 1;
        for (int i = right; i >= 0; i--) {
            if (num.charAt(i) == '0') {
                right--;
            } else {
                break;
            }
        }
        return num.substring(0, right + 1);
    }
}
