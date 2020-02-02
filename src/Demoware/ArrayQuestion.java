package Demoware;

public class ArrayQuestion {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) return 0;

        int index = A[0];
        int length = 1;
        while (index != -1) {
            index = A[index];
            length++;
        }
        return length;
    }
}
