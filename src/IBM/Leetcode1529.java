package IBM;

public class Leetcode1529 {
    public int minFlips(String target) {
        int flips = 0;
        char prev = '0';
        for (char ch : target.toCharArray()) {
            if (ch != prev) {
                flips++;
                if (prev == '0') {
                    prev = '1';
                } else {
                    prev = '0';
                }
            }
        }
        return flips;
    }
}
