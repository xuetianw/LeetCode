package Demoware;

import java.util.HashSet;
import java.util.Set;

public class String_case {
    public String solution(String S) {
        // write your code in Java SE 8
        if (S.length() == 0) {
            return "NO";
        }
        int base_size = 'Z' - 'A' + 1;
        int[] lower_case_arr = new int[base_size];
        int[] upper_case_arr = new int[base_size];

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lower_case_arr[ch - 'a']++;
            } else {
                upper_case_arr[ch - 'A']++;
            }
        }

        for (int i = base_size - 1; i >= 0; i--) {
            if (lower_case_arr[i] != 0 && upper_case_arr[i] != 0) {
                return (char) (i + 'A') + "";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String_case string_case = new String_case();
        string_case.solution("aaBabcDaA");
    }
}
