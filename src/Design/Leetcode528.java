package Design;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Leetcode528 {
    int[] arr;
    public Leetcode528(int[] w) {
        arr = w;
    }

    public int pickIndex() {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        int[] newArray = new int[sum];
        int loc = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            for (int j = 0; j < val; j++) {
                newArray[loc++] = val;
            }
        }
        int index = new Random().nextInt(newArray.length);
        int val2 = newArray[index];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val2) {
                list.add(i);
            }
        }
        if (list.size() == 1) {
            list.get(0);
        } else {
            return list.get(new Random().nextInt(list.size()));
        }

        return 0;
    }
}
