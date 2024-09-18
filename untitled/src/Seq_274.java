import java.util.Arrays;

/**
 * @author luyingjian
 * @date 2024/2/28
 */
public class Seq_274 {
    public int hIndex(int[] citations) {
        int length = citations.length;
        int[] arr = new int[length + 1];
        for (int citation : citations) {
            arr[Math.min(length, citation)]++;
        }

        int sum = 0;
        for (int i = length; ; i--) {
            sum += arr[i];
            if (sum >= i) return i;
        }
    }

    public int hIndex1(int[] citations) {
        int h = 0;
        Arrays.sort(citations);
        int length = citations.length;
        while (citations[length - 1] > h && length >=0){
            h++;
            length--;
        }
        return h;
    }
}
