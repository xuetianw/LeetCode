import java.util.stream.IntStream;

public class Leetcode204 {

    boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int n) {
        if(n == 0 || n == 1) return 0;
        int count = 0;
//        return (int)IntStream.range(2, n).filter(x -> isPrime(x)).count();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
//                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode204 leetcode204 = new Leetcode204();
        System.out.println(leetcode204.countPrimes(11));
    }
}
