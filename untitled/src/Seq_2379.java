/**
 * @author luyingjian
 * @date 2024/9/11
 */
public class Seq_2379 {
    public static void main(String[] args) {
        System.out.println('W' & 1);
        System.out.println('B' & 1);
    }

    public int minimumRecolors(String blocks, int k) {
        int min = k;
        char[] arr = blocks.toCharArray();
        int black = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'B') black++;

            if (i < k - 1) continue;

            min = Math.min(k - black, min);

            if (arr[i + 1 - k] == 'B') black--;
        }
        return min;
    }
}
