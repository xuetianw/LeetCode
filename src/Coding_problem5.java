public class Coding_problem5 {
    public int expand(String s, int i, int j) {
        if (s.charAt(i) != s.charAt(j)) {
            return 1;
        }
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                return (j - i - 2 + 1);
            }
        }
        return (j - i - 2 + 1);
    }

    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        int start_index = 0;
        int finish_index = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = expand(s, i, i);
            if (temp > length) {
                length = temp;
                start_index = i - (length - 1) / 2;
                finish_index = i + (length - 1) / 2;
            }
            if (i != s.length() -1) {
                temp = expand(s, i, i + 1);
                if (temp == 1) {
                    continue;
                }
                if (temp > length) {
                    length = temp;
                    start_index = i - (length - 2) / 2;
                    finish_index = i + 1 + (length - 2) / 2;
                }
            }
        }
        return s.substring(start_index, finish_index + 1);
    }
    public static void main(String[] args) {
        Coding_problem5 temp = new Coding_problem5();
        System.out.println(temp.longestPalindrome("cbbd"));
    }
}
