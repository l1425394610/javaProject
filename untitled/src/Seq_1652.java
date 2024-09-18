import java.util.Arrays;

/**
 * @author luyingjian
 * @date 2024/9/12
 */
public class Seq_1652 {
    public static void main(String[] args) {
        decrypt(new int[]{2, 4, 9, 3}, -2);
    }

    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] arr = new int[len];
        int sum = 0;

        int index = k > 0 ? 1 : len - Math.abs(k);
        k = Math.abs(k);

        for (int i = index; i < index + k; i++) {
            sum += code[i];
        }

        for (int i = 0; i < len; i++) {
            arr[i] = sum;
            sum += code[(index + k) % len] - code[index % len];
            index++;
        }
        return arr;

        /**
         * 1,2,3,4,5,6   2
         * 5,7,9,11,7,3
         *
         * 1,2,3,4,5,6, -2
         * 11,7,3,5,7,9
         */

    }
}
