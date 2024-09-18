import java.util.HashMap;
import java.util.Map;

/**
 * @author luyingjian
 * @date 2024/1/15
 */
public class Seq_13 {

    /**
     * 13. 罗马数字转整数
     * 字符          数值
     * I             1
     * V             5
     * IV            4
     * IX            9
     * X             10
     * XL            40
     * L             50
     * XC            90
     * C             100
     * CD            400
     * D             500
     * CM            900
     * M             1000
     */

    public int romanToInt(String s) {
        int left = getValue(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int right = getValue(s.charAt(i));
            if (left >= right) {
                sum += left;
            } else {
                sum -= left;
            }
            left = right;
        }
        sum += left;
        return sum;
    }

    private int getValue(char c) {
        int num = 0;
        switch (c) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
        }
        return num;
    }
}
