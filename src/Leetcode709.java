public class Leetcode709 {

    public String toLowerCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char el = str.charAt(i);
            if (el >= 'A' && el <= 'Z') {
                str = str.substring(0, i) + (char)(el - ('a' - 'A')) + str.substring(i + 1, str.length());
                // res += (char)(el + ('a' - 'A'));
            } else {
                str += str.substring(0, i) + (char)(el - ('a' - 'A')) + str.substring(i + 1, str.length());
            }
        }
        return str;

    }
    public static void main(String[] args) {
        Leetcode709 leetcode709 = new Leetcode709();
        leetcode709.toLowerCase("Hello");

    }
}
