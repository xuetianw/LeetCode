package IBM;

import java.util.ArrayList;

public class Leetcode1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int li = 0;
        // int ri = 0;
        int localsum = 0;
        int res = 0;
        for (int ri = 0; ri < s.length(); ri++) {
            int diff = Math.abs(s.charAt(ri) - t.charAt(ri));
            localsum += diff;

            if (localsum <= maxCost) {
                res = Math.max(res, ri - li + 1);
            }

            else {
                while(localsum > maxCost){
                    localsum -= Math.abs(s.charAt(li) - t.charAt(li));
                    li++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
    }
}
