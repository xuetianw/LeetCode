package Alba;

public class Leetcode2 {

    void decrypt(String letters) {

        char[] char_array = letters.toCharArray();
        char_array[0]++;
        for (int i = 1; i < letters.length(); i++) {
            char_array[i] += char_array[i - 1];
//            System.out.println(char_array[i]);
        }


        for (int i = 0; i < letters.length(); i++) {
            while (char_array[i] > 'z') {
                char_array[i] -= 26;
            }
        }

        String res = "";
        for (char ch : char_array) {
            res += ch;
        }
        letters = res;
        System.out.println(letters);
    }
    public static void main (String[] args) {
        Leetcode2 leetcode2 = new Leetcode2();
        leetcode2.decrypt("crime");
        leetcode2.decrypt("encyclopedia");
    }
}
