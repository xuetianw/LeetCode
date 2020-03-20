public class Leetcode2 {
    public static void main(String[] args) {
        int []arr = {10, 15, 3, 7};
        int product_of_all = 1;
        for (int element : arr ) {
            product_of_all *= element;
        }
        int []result = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = product_of_all / arr[i];
        }
        for (int element : result) {
            System.out.printf("element %d \t", element);
        }
    }
}
