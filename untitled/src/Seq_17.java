import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luyingjian
 * @date 2024/1/15
 */
public class Seq_17 {
    /**
     * 17. 电话号码的字母组合
     */


    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) return list;
        Map<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        test(map,list,0,digits,new StringBuffer());
        return list;

    }

    /**
     * @param map          字母数字对应关系
     * @param index        当前遍历到的digits下标
     * @param list
     * @param digits
     * @param stringBuffer
     */
    public void test(Map<Character, String> map, List<String> list, int index, String digits, StringBuffer stringBuffer) {
        if (index == digits.length()) {
            list.add(stringBuffer.toString());
        } else {
            char c = digits.charAt(index);
            String str = map.get(c);
            for (int i = 0; i < str.length(); i++) {
                stringBuffer.append(str.charAt(i));
                test(map, list, index + 1, digits, stringBuffer);
                stringBuffer.deleteCharAt(index);
            }

        }
    }


}
