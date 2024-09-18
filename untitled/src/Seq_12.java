/**
 * @author luyingjian
 * @date 2024/1/15
 */
public class Seq_12 {

    /**
     * 12. 整数转罗马数字
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */



    //    1994
//    1000: M,
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[]{"I", "IV", "V","IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] numArr = new int[]{1, 4, 5, 9,10, 40, 50, 90, 100, 400, 500, 900, 1000};
        for (int i = numArr.length - 1; i >= 0; i--) {
            int target = numArr[i];
            String str = strArr[i];
            while (num > target) {
                stringBuilder.append(str);
                num -= target;
            }
        }
        return stringBuilder.toString();


    }
}
