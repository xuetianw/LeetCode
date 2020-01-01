import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode912 {
    public List<Integer> sortArray(int[] nums) {
        Integer[] nums2 = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        Arrays.sort(nums2, ((num1, num2) -> num1 - num2));
        return Arrays.asList(nums2);
    }
    public static void main(String[] args) {

    }
}
