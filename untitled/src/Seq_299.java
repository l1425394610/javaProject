/**
 * @author luyingjian
 * @date 2024/3/14
 */
public class Seq_299 {
    public String getHint(String secret, String guess) {
        int a = 0, b = 0;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if (c1 == c2) {
                a++;
            } else {
                nums1[c1 - 48]++;
                nums2[c2 - 48]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            b += Math.min(nums1[i], nums2[i]);
        }
        return a + "A" + b + "B";
    }
}
