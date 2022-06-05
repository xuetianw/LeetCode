package Demoware;

import java.util.HashSet;
import java.util.Set;

public class Practise {

    private String res = "NO";
    private static Set<Character> upperCase_set = new HashSet<>();
    private static Set<Character> lowerCase_set = new HashSet<>();

    public String solution(String S) {
        // write your code in Java SE 8
        for (char ch : S.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z')
                upperCase_set.add(ch);
              else
                lowerCase_set.add(ch);
        }

        char start = 'A';
        char ending = 'Z';
        while (start <= ending) {
            if (upperCase_set.contains(start) && lowerCase_set.contains(Character.toLowerCase(start))) {
                if (res.equals("NO"))
                    res = Character.toString(start);

                else if (start > res.toCharArray()[0]) {
                    res = Character.toString(start);
                }
            }
            start++;
        }
        return res;
    }

    public static void main (String[] args) {
        Practise practise = new Practise();
        practise.solution("aaBabcDaA");
    }
}
