public class Solution243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        if (words.length < 2) return 0;

        int index = -1;
        for (int i = 0; i < words.length; i++) {
            // System.out.println("i: " + i);
            if (words[i].equals(word1) || words[i].equals(word2)) {
                System.out.println(i);
                if (index == -1) {
                    index = i;
                } else {
                    // return Math.abs(index - i);
                    System.out.println("test");
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution243 solution243 = new Solution243();
        solution243.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice");
        System.out.println((char)('a' + 1));
    }
}