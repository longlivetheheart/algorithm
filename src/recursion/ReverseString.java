package recursion;

/**
 * @author joe
 * @date 2023/8/16 19:35
 * @description
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("kang"));
    }

    public static String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
