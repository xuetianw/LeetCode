public class Leetcode67 {


    public String addBinary(String a, String b) {
        int a_len_index = a.length();
        int b_len_index = b.length();
        int carry = 0;
        String sum = "";

        while (a_len_index > 0 || b_len_index > 0) {
            int digit_a = (a_len_index != 0) ? a.charAt(a_len_index - 1) - '0' : 0;
            int digit_b = (b_len_index != 0) ?  b.charAt(b_len_index - 1) - '0' : 0;
            sum = (digit_a + digit_b + carry) % 2  + sum;
            carry =  (digit_a + digit_b) / 2;

            a_len_index--;
            b_len_index--;
        }
        if (carry != 0) sum = "1" + sum;
        return sum;
    }

    public static void main(String[] args) {

    }
}


//Example 1:
//
//        Input: a = "11", b = "1"
//        Output: "100"
//
//Example 2:
//
//        Input: a = "1010", b = "1011"
//        Output: "10101"