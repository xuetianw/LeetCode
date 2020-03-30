package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class Leetcode405 {
    public String toHex(int num) {
        List<Integer> list = new ArrayList();
        while (num != 0) {
            list.add(num % 16);
            num /= 16;
        }
        String res = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            int ele = list.get(i);
            if (ele >= 10) {
                res = 'a' + (ele - 'a') + res;
            } else {
                res = ele + res;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Leetcode405 leetcode405 = new Leetcode405();
        leetcode405.toHex(26);
    }
}
