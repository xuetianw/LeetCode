package Demoware;

public class IntegerProduct {
    boolean expressable(int num) {
        int x = (int) (Math.sqrt(num));

        if (x * (x + 1) == num) {
            return true;
        } else {
            return false;
        }

    }

    public int solution(int A, int B) {
        // write your code in Java SE 8
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (expressable(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}