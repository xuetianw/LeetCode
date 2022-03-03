package String;

public class Leetcode14 {

    int get_index(String[] strs, int shortest) {
        int i = 0;
        for (; i < shortest; i++) {
            char ch = strs[0].charAt(i);
            for(String str : strs) {
                if (ch != str.charAt(i)){
                    return i - 1;
                }
            }
        }
        return i - 1;
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        int shortest = strs[0].length();
        for(String str : strs) {
            if (str.length() < shortest) {
                shortest = str.length();
            }
        }
        int index = get_index(strs, shortest);

        return strs[0].substring(0, index + 1);
    }
}
