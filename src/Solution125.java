import static java.lang.Character.isLetterOrDigit;

public class Solution125 {

    boolean is_char(char ch) {
        System.out.println(ch - 'Z');
        return ( (ch - 'A') <= ('z' - 'A')
                && (ch -'A' >= 0));
    }

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !isLetterOrDigit(s.charAt(r))) r--;

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
//        char a = ' ';
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome("0P"));
//        System.out.println(Character.isLetter('0'));
    }
}
