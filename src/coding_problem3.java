import java.util.HashSet;
import java.util.Set;

public class coding_problem3 {

    public int expand(String s, int i) {
        Set<Character> hashset = new HashSet();
        while (i < s.length() && !hashset.contains(s.charAt(i))) {
            hashset.add(s.charAt(i));
            i++;
        }
        return hashset.size();
    }

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i ++) {
            int temp_len = expand(s, i);
            // System.out.println(temp_len);

            if (temp_len > length) {
                length = temp_len;
            }
        }

        return length;
    }

    public static void main(String[] args) {
//        int []arr = {3, 4, -1, 1};
//        int MAX_LENGTH = arr.length;
//        Integer []result = new Integer[MAX_LENGTH];
//        //create an array that has max number of integers
//        // 1 will be the smallest integer in the list
//        for (int element : arr) {
//            if (element > 0 && element < MAX_LENGTH) {
//                result[element -1] = element;
//            }
//        }
//
//        for (int i = 0; i < MAX_LENGTH; i++) {
//            if (result[i] == null) {
//                System.out.println("the resutl is " + (i + 1));
//                return;
//            }
//        }
    }
}
