package Bit_Manipulation;

public class Leetcode190 {
    public static void main (String args[])
    {
        int n = 161;
        int count = 0;
        int[] arr = new int[31];
        while (n != 0) {
            arr[count++] = n % 2;
            n /= 2;
        }
        int[] new_arr = new int[count];
        for (int i = 0; i < count; i++) {
            new_arr[i] = arr[i];
        }

        for (int i = 0; i < count / 2; i++) {
            int temp = new_arr[i];
            new_arr[i] = new_arr[count - i - 1];
            new_arr[count - i - 1] = temp;
        }
        int count2 = 0;
        for (int i = 0; i < count; i++) {
            if(new_arr[i] == 1) {
                count2++;
            }
        }
        int[] res_arr = new int[count2];
        int num = 0;
        for (int i = 0; i < count; i++) {
            if(new_arr[i] == 1) {
                res_arr[num++] = i + 1;
            }
        }
        for (int i = 0; i < num; i++) {
            int temp = res_arr[i];
            res_arr[i] = res_arr[num - i - 1];
            res_arr[num - i - 1] = temp;
        }
    }
}
