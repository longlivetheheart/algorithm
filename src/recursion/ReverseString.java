package recursion;

/**
 * @author joe
 * @date 2023/8/16 19:35
 * @description
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("dcba"));
    }

    public static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }
        String pre = reverseString(s.substring(1));
        String now = pre + s.charAt(0);
        return now;
    }
}
