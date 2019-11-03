public class Leetcode771 {

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                char ch = S.charAt(i);
                if (J.charAt(j) == ch) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string1 = "aA";
        String string2 = "aAAbbbb";
        System.out.println(numJewelsInStones(string1, string2));
    }
}
