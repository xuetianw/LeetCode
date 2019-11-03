import java.util.ArrayList;
import java.util.List;

public class Leetcode461 {

    public static int hammingDistance(int x, int y) {
        String str_x = Integer.toBinaryString(x);
        String str_y = Integer.toBinaryString(y);
        if (str_x.length() > str_y.length()) {
            int result = 0;
            int len_diff = str_x.length() - str_y.length();
            String x_sub_left = str_x.substring(0, len_diff);
            String x_sub_right = str_x.substring(len_diff, str_x.length());

            for (int i = 0; i < x_sub_left.length(); i++) {
                if (x_sub_left.charAt(i) == '1') {
                    result++;
                }
            }

            for (int i = 0; i < x_sub_right.length(); i++) {
                if (x_sub_right.charAt(i) != str_y.charAt(i)) {
                    result++;
                }
            }
            return result;
        } else {
            int result = 0;
            int len_diff = str_y.length() - str_x.length();
            String y_sub_left = str_y.substring(0, len_diff);
            String y_sub_right = str_y.substring(len_diff, str_y.length());

            for (int i = 0; i < y_sub_left.length(); i++) {
                if (y_sub_left.charAt(i) == '1') {
                    result++;
                }
            }

            for (int i = 0; i < y_sub_right.length(); i++) {
                if (y_sub_right.charAt(i) != str_x.charAt(i)) {
                    result++;
                }
            }
            return result;
        }
    }


    public static void main(String[] args) {
        hammingDistance(97, 73);
    }
}
