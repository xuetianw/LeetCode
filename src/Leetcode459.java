import java.util.stream.IntStream;

public class Leetcode459 {

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) return false;
        int subLen = s.length() / 2;

        while (subLen != 0) {
            while (s.length() % subLen != 0) {
                subLen -= 1;
            }
            String str = s.substring(0, subLen);
            int times = s.length() / subLen;

            StringBuilder newStr = new StringBuilder();
//            String newStr2 = "";
            IntStream.range(0, times).forEach(x -> newStr.append(str));
//            IntStream.range(0, times).forEach(x -> newStr2 += str);
            if (newStr.toString().equals(s)) {
                return true;
            }
            subLen -= 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode459 leetcode459 = new Leetcode459();
        System.out.println(leetcode459.repeatedSubstringPattern("a"));
    }
}
