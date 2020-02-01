public class Leetcode680 {
    boolean is_palindrome (char[] arr) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            if (arr[l] != arr[r]) return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (is_palindrome((s.substring(l + 1, r).toCharArray())) || is_palindrome((s.substring(l, r - 1).toCharArray()))) return true;
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode680 leetcode680 = new Leetcode680();
        System.out.println(leetcode680.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
