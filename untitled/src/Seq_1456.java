/**
 * @author luyingjian
 * @date 2024/9/9
 */
public class Seq_1456 {

    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (judge(arr[i])) {
                count++;
            }

            if (i < k - 1) {
                continue;
            }

            Math.max(count, max);


            if (judge(arr[i - k])) {
                count--;
            }

        }
        return max;
    }


    public static boolean judge(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
