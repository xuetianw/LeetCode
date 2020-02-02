package Demoware;

public class Coin {

    private int flips_needed(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                count++;
            }
        }
        return count;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0) return 0;

        int[] target_arr1 = new int[A.length];
        int[] target_arr2 = new int[A.length];
        target_arr1[0] = 0;
        target_arr2[0] = 1;
        int prev = 0;
        for (int i = 1; i < A.length; i++) {
            if (prev == 0) {
                target_arr1[i] = 1;
                prev = 1;
            } else {
                target_arr1[i] = 0;
                prev = 0;
            }
        }


        prev = 1;
        for (int i = 1; i < A.length; i++) {
            if (prev == 0) {
                target_arr2[i] = 1;
                prev = 1;
            } else {
                target_arr2[i] = 0;
                prev = 0;
            }
        }

        return Math.min(flips_needed(A, target_arr1), flips_needed(A, target_arr2));
    }

}
