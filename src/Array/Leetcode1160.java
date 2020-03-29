package Array;

public class Leetcode1160 {

    private int[] base = new int[26];

    private boolean contains_word(String word) {
        int[] new_arr = new int[26];
        for (char ch : word.toCharArray()) {
            new_arr[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (new_arr[i] > base[i]) {
                return false;
            }
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        for (char ch : chars.toCharArray()) {
            base[ch - 'a']++;
        }

        int res_len = 0;
        for (String word : words) {
            if (contains_word(word)) {
                res_len += word.length();
            }
        }
        return res_len;
    }
}
