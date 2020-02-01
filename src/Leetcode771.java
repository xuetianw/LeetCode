import java.util.HashSet;
import java.util.Set;

public class Leetcode771 {

    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels_set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            jewels_set.add(J.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jewels_set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string1 = "aA";
        String string2 = "aAAbbbb";
        Leetcode771 leetcode771 = new Leetcode771();
        System.out.println(leetcode771.numJewelsInStones(string1, string2));
        string1.concat(string2);
    }
}
