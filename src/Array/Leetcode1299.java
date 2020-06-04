package Array;

public class Leetcode1299 {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        int max = -1;
        int[] res = new int[arr.length];
        res[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i - 1]);
            res[i] = max;
        }
        for (int i = 0; i < res.length / 2; i++) {
            int temp = res[i];
            res[i] = res[res.length - i - 1];
            res[res.length - i - 1] = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode1299 leetcode1299 = new Leetcode1299();
        leetcode1299.replaceElements(new int[] {17,18,5,4,6,1});
    }
}
