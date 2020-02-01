import java.util.ArrayList;
import java.util.List;

public class James {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        int[] tomorrow = new int[states.length];

        for (int i = 0; i < days; i++) {
            for (int j = 0; j < states.length; j++) {
                if (j == 0 || j == states.length - 1) {
                    tomorrow[j] = 0;
                }  else {
                    tomorrow[j] = (states[j - 1] == states[j + 1])  ? 1 : 0;
                }
            }
            for (int j = 0; j < tomorrow.length; j++) {
                states[j] = tomorrow[j];
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int ele : tomorrow) {
            res.add(ele);
        }


        return res;
        // WRITE YOUR CODE HERE
    }
    // METHOD SIGNATURE ENDS

    public static void main(String[] args)
    {
        System.out.println('a' + 'b');
        // Our arr contains 8 elements
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        James james = new James();
        james.cellCompete(arr, 2);
    }
}
