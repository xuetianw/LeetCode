public class Leetcode {
    public static String longestPalindrome(String s) {
        int max_length = 0;
        int staring_index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (isPalidrome(str)) {
                    int current_length = j - i + 1;
                    if (current_length > max_length) {
                        max_length = current_length;
                        staring_index = i;
                    }
                }
            }
        }
        return s.substring(staring_index, staring_index + max_length);
    }
    public static boolean isPalidrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char ch = s.charAt(i);
            if (ch != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        String str = "a";
        System.out.println(longestPalindrome("abc"));
//        System.out.println(str.substring(0, 2));
    }
}