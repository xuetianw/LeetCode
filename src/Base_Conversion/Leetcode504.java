package Base_Conversion;

public class Leetcode504 {
    public String convertToBase7(int num) {
        String res = new String("");
        while (num != 0) {
            res += num % 7;
            num /= 7;
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode504 leetcode504 = new Leetcode504();
        System.out.println(leetcode504.convertToBase7(100));
    }
}
