import java.util.ArrayList;
import java.util.List;

public class Leetcode415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;
        String res = "";
        while (i >= 0 || j >= 0) {

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            res = sum % 10 + res;
            carry = sum / 10;
            i--;
            j--;
        }

        if (carry != 0) res = 1 + res;

        return res;
    }

    public static void main(String[] args) {
        Leetcode415 leetcode415 = new Leetcode415();
        System.out.println(leetcode415.addStrings("98", "9"));

    }
}