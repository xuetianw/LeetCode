package IBM;
public class Leetcode2433 {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(3 | 4);
    }
}
