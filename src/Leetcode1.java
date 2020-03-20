public class Leetcode1 {

    public static void main(String[] args) {
        final int k = 17;
        int []arr = {10, 15, 3, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr [j] == k) {
                    System.out.println("found\n");
                    return;
                }
            }
        }

    }
}
