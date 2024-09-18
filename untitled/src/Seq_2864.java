/**
 * @author luyingjian
 * @date 2024/3/13
 */
public class Seq_2864 {

    public String maximumOddBinaryNumber(String s) {
        int length = s.length();
        int count = -1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        StringBuffer stringBuffer = new StringBuffer("1");
        for (int i = 0; i < length - 1; i++) {
            stringBuffer.append(count-- > 0 ? "1" : "0");
        }
        stringBuffer.append("1");
        return stringBuffer.reverse().toString();

    }
}
