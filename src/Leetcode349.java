import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set.add(num);

        for (int num : nums2) {
            if (set.contains(num)) list.add(num);
        }

        for (int num : list) {
            set2.add(num);
        }
        int[] new_array = new int [set2.size()];
        int index = 0;
        for (Integer integer : set2) new_array[index++] = integer;

        return new_array;
    }

}
