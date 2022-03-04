package String;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1507 {

    static Map<String, String> hashMap = new HashMap();

    static {
        hashMap.put("Jan", "01");
        hashMap.put("Feb", "02");
        hashMap.put("Mar", "03");
        hashMap.put("Apr", "04");
        hashMap.put("May", "05");
        hashMap.put("Jun", "06");
        hashMap.put("Jul", "07");
        hashMap.put("Aug", "08");
        hashMap.put("Sep", "09");

        hashMap.put("Oct", "10");
        hashMap.put("Nov", "11");
        hashMap.put("Dec", "12");
    }

    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        String d = arr[0];
        String m = arr[1];
        String y = arr[2];

        String res = "";
        res += y;
        res += "-";

        String m2 = "";
        for (char ch : m.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                m2 += ch;
            }
        }
        res += (hashMap.get(m2));

        res += "-";

        String d2 = "";

        for (char ch : d.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                d2 += ch;
            }
        }
        int intDay = Integer.parseInt(d2);
        if (intDay >= 1 && intDay <= 9) {
            res += "0";
            res += intDay;
        } else {
            res += intDay;
        }

        return res;
    }
}
