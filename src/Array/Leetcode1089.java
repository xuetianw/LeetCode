package Array;

public class Leetcode1089 {
    public void duplicateZeros(int[] arr) {
        int[] arr_copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_copy[i] = arr[i];
        }
        if (arr.length == 0) return;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr_copy[i] == 0) {
                arr[index++] = 0;
                if (index  <= arr.length - 1) {
                    arr[index++] = 0;
                }
            } else {
                arr[index++] = arr_copy[i];
            }
            if(index == arr.length) {
                return;
            }
        }
    }

    public static void main (String[] args) {
        Leetcode1089 leetcode1089 = new Leetcode1089();
        leetcode1089.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
