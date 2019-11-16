import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            char ch = s.charAt(j);
            if (!set.contains(ch)){
                set.add(ch);
                j++;
                ans = Math.max(ans, j - i);
            }
            else {
                char ch2 = s.charAt(i);
                set.remove(ch2);
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        Arrays.asList(new int[] {1, 2, 3});
        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
    }
}
