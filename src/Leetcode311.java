public class Leetcode311 {
    public int[][] multiply(int[][] A, int[][] B) {
        if (A.length == 0) return new int [0][0];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < A[0].length; k++) {
                    sum += A[i][k] * B[k][j];
                }
                A[i][j] = sum;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Leetcode311 leetcode311 = new Leetcode311();
        leetcode311.multiply(new int[][] { {1},{-5}}, new int[][] {{12},{-1}});
    }
}
