import java.util.Arrays;

public class Leetcode945 {
    public static boolean has_duplicate(int[] arr) {
        if (arr.length == 0) return true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) return true;
        }
        return false;
    }
    public int minIncrementForUnique(int[] A) {
        if (A.length == 0) return 0;


        int count = 0;
        Arrays.sort(A);
        while (has_duplicate(A)) {
            for (int i = 1; i < A.length; i++) {
                if (A[i] == A[i - 1]) {
                    A[i - 1]++;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode945 leetcode945 = new Leetcode945();
        leetcode945.minIncrementForUnique(new int[]{3,2,1,2,1,7});
    }
}
