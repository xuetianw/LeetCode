import java.util.ArrayList;
import java.util.List;

public class coding_problem13 {
    static int index = 0;
    static int find_longest_substring(String str, final int most_dist_chars) {
        int max_length = 0;
        for (int i = 0; i < str.length(); i++) {
            List<Character> dist_char_list = new ArrayList<>();
            for (int j = i; j < str.length(); j++) {
                /*
                 if the char is in the list already
                 go to the next char
                 */
                char ch = str.charAt(j);
                if (!dist_char_list.contains(ch)) {
                    dist_char_list.add(ch);
                    /*
                    compare the size with the max length
                     */
                    if (dist_char_list.size() > most_dist_chars || j == str.length() - 1) {
                        int current_length = j - i;
                        if (current_length > max_length) {
                            max_length = current_length;
                            index = i;
                            break;
                        }
                    }
                }
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(find_longest_substring(str, 2));
        System.out.println("starting from:" + str.charAt(index));
    }
}
