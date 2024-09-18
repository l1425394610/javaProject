/**
 * @author luyingjian
 * @date 2024/3/11
 */
public class Seq_2129 {
    /**
     * A 65 B 66
     * a 97 b 98
     *
     * @param title
     * @return
     */
    public String capitalizeTitle(String title) {
        String lowerCase = title.toLowerCase();
        StringBuffer word = new StringBuffer();
        int left = lowerCase.length() - 1, right = lowerCase.length() - 1;
        for (int i = lowerCase.length() - 1; i >= 0; i--) {
            char c = lowerCase.charAt(i);
            if (i > 0 && lowerCase.charAt(i - 1) == 32) {
                if (right - left > 2) {
                    c -= 32;
                }
                right = i - 1;
            } else if (i == 0 && right - left > 2){
                c -= 32;
            }
                word.append(c);
            left--;
        }
        return word.reverse().toString();
    }
}
