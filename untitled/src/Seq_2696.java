import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author luyingjian
 * @date 2024/1/10
 */
public class Seq_2696 {

    public static void main(String[] args) {


    }

    public static int minLength(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        deque.push(' ');
        for(char c: s.toCharArray()){
            if ((c == 'B' && deque.peek() =='A') || (c == 'D' && deque.peek() =='C')){
                deque.pop();
            }else {
                deque.push(c);
            }
        }
        return deque.size() - 1;
    }

}
