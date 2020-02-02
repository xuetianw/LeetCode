import java.util.Arrays;

public class Leetcode977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= 2;
        }
        Arrays.sort(A);
        return A;
    }
}
