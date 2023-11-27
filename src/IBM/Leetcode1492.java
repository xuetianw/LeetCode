package IBM;

public class Leetcode1492 {

    public int kthFactor(int n, int k) {
        int j = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                j++;
                if (k == j) {
                    return i;
                }
            }
        }
        if (j == k - 1) return n;
        return -1;
    }

    public static void main(String[] args) {
    }
}
