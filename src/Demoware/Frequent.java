package Demoware;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Frequent {
    String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)('a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }

    public static void main (String[] args) {
//        Collections.sort();
        Collection<String> al=new LinkedList<>();
        Frequent practise = new Frequent();
        System.out.println(practise.solution("bbccds"));
    }
}
