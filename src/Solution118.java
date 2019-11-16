import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {


    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> list_of_list = new ArrayList<>();
        if (numRows == 1) {
            Integer[] arr = new Integer[] {1};
            list_of_list.add(Arrays.asList(arr));
            return list_of_list;
        }
        if (numRows == 2) {
            list_of_list.add(Arrays.asList(1));
            list_of_list.add(Arrays.asList(1, 1));
            return list_of_list;
        }

        list_of_list.add(Arrays.asList(1));
        list_of_list.add(Arrays.asList(1, 1));
        for (int i = 2; i < numRows; i++) {
            Integer[] arr = new Integer[i + 1];
            arr[0] = 1; //first element
            arr[i] = 1; // last element
            Integer[] prev = new Integer[i];
            prev = list_of_list.get(i - 1).toArray(prev);
            for (int j = 1; j < i; j++) {
                arr[j] = prev[j - 1] + prev[j];
            }
            list_of_list.add(Arrays.asList(arr));
        }

        return list_of_list;
    }


    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        solution118.generate(5);

    }
}
