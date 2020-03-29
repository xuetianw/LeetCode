package Array;

public class Leetcode905 {
    public int[] sortArrayByParity(int[] A) {
        if (A.length == 0) return null;
        int front = 0;
        int end = A.length - 1;
        while (front < end) {
            while (front <= A.length - 1 && A[front] % 2 == 0) {
                front++;
            }
            while (end >= 0 && A[end] % 2 == 1) {
                end--;
            }
            if (front >= end) {
                return A;
            }
            int temp = A[front];
            A[front] = A[end];
            A[end] = temp;
        }
        return A;
    }
}
