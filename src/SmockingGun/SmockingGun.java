package SmockingGun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmockingGun {
    static List<Integer> list = new ArrayList<>();

    public static final int target = 1500;
    Set<Integer> set= new HashSet<>();
    public static void main (String[] args) {


        int start = 2;
        list.add(1);
        while (list.size() < 1500) {
            if (isUgly(start)) {
                list.add(start);
            }
            start++;
        }
        System.out.println(list.get(list.size() - 1));
    }


    public static boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        if (num % 2 == 0) {
            while (num % 2 == 0) {
                num = num / 2;
            }
        }

        if (num % 3 == 0) {
            while (num % 3 == 0) {
                num = num / 3;
            }
        }

        if (num % 5 == 0) {
            while (num % 5 == 0) {
                num = num / 5;
            }
        }

        return num == 1;
    }
}
