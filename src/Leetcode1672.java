import java.util.Arrays;

public class Leetcode1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] arr : accounts) {
            max = Math.max(Arrays.stream(arr).sum(), max);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
