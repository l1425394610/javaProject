/**
 * @author luyingjian
 * @date 2024/2/4
 */
public class Seq_292 {
    /**
     * 1 true
     * 2 true
     * 3 true
     * 4 false
     * 5 true
     * 6
     */

    public static void main(String[] args) {
        canWinNim(8);
        System.out.println();
    }


    public static boolean canWinNim(int n) {
        if (n <= 3) return true;
        boolean isMe = true;
        while (n > 4) {
            n--;
            isMe = !isMe;
        }

        if ( n== 4 && isMe){
            return false;
        }else {
            return true;
        }

    }


}
