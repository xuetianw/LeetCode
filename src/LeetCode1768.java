public class LeetCode1768 {
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null) return word2;
        if (word2 == null) return word1;
        int index;
        if (word1.length() > word2.length()) {
            index = 0;
        } else {
            index = 1;
        }
        int shorterLen = Math.min(word1.length(), word2.length());
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < shorterLen; i++) {
            str.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (index == 0) {
            str.append(word1.substring(shorterLen));
        } else {
            str.append(word2.substring(shorterLen));
        }
        return str.toString();

    }

    public static void main(String[] args) {
        LeetCode1768 leetCode1768 = new LeetCode1768();
        System.out.println(leetCode1768.mergeAlternately("abc", "pqr"));
    }
}
