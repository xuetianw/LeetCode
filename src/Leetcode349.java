import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) set.add(num);

        for (int num : nums2) {
            if (set.contains(num)) list.add(num);
        }


        Set<Integer> set2 = new HashSet<>(list);
        int[] new_array = new int [set2.size()];
        int index = 0;
        for (Integer integer : set2) {
            new_array[index] = integer;
        }



        return new_array;
    }

}
