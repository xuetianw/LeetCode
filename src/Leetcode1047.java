public class Leetcode1047 {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        int r = sb.length() - 1;
        int l = 0;
        while (l <= r - 1) {
            if (sb.charAt(l) == sb.charAt(l + 1)) {
                sb = new StringBuilder(sb.substring(0, l) + sb.substring(l + 2, r + 1));
                l =  (l == 0) ? 0 : l - 1;
                r = sb.length() - 1;
            } else l++;
        }
        return sb + "";
    }
    public static void main (String[] args) {
        Leetcode1047 leetcode1047 = new Leetcode1047();
        leetcode1047.removeDuplicates("abbaca");
    }
}
