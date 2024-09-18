/**
 * @author luyingjian
 * @date 2024/9/9
 */
public class Seq_643 {

    public static void main(String[] args) {
//        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(parse(200));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double avg;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avg = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            avg = Math.max(avg, sum);
        }
        return avg / k;
    }


    public String convertDateToBinary(String date) {
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8));
        return parse(year) + "-" + parse(month) + "-" + parse(day);
    }

    public static String parse(Integer number) {
        StringBuilder str = new StringBuilder();
        while (number > 0) {
            if (number % 2 == 0) {
                str.append(0);
            } else {
                str.append(1);
            }
            number = number / 2;
        }
        return str.reverse().toString();
    }
}
