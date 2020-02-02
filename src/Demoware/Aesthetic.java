package Demoware;

public class Aesthetic {
    boolean aesthetic(int[] A) {
        int i = 0;
        while (i < A.length - 2) {
            int left = A[i];
            int middle = A[i + 1];
            int right = A[i + 2];

            if ((left > middle && middle > right) || (left < middle && middle < right)
                    || (left == middle) || (middle == right)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length <= 2) return -1;
        if (aesthetic(A)) return 0;

        int sub_arr_length = A.length - 1;
        int[] subArray = new int[sub_arr_length];

        int res = 0;

        for (int i = 0; i < A.length; i++) {
            int subArray_count = 0;
            for (int j = 0 ; j < i; j++) {
                subArray[subArray_count++] = A[j];
            }
            for (int j = i + 1 ; j < A.length; j++) {
                subArray[subArray_count++] = A[j];
            }
            // for (int t :subArray) {
            //     System.out.print(t);
            // }

            if (aesthetic(subArray)) {
                res++;
            }
            if (res == 0) return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        Aesthetic demoware = new Aesthetic();
//        demoware.solution(new int[]{3, 4, 5, 3, 7});
        System.out.println(demoware.aesthetic(new int[]{1, 3 , 1 ,2}));
    }

}
