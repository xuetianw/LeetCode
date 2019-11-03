import java.util.HashSet;
import java.util.Set;

public class coding_problem3 {
    public static void main(String[] args) {
        int []arr = {3, 4, -1, 1};
        int MAX_LENGTH = arr.length;
        Integer []result = new Integer[MAX_LENGTH];
        //create an array that has max number of integers
        // 1 will be the smallest integer in the list
        for (int element : arr) {
            if (element > 0 && element < MAX_LENGTH) {
                result[element -1] = element;
            }
        }

        for (int i = 0; i < MAX_LENGTH; i++) {
            if (result[i] == null) {
                System.out.println("the resutl is " + (i + 1));
                return;
            }
        }
    }
}
