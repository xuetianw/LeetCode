public class Leetcode443 {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;
        if (chars.length == 1) return 1;


        int cur_loc = 0;
        int length = 1;

        for (int i = 1; i < chars.length; i++) {
            int count = 0;
            if (chars[cur_loc] == chars[i]) {
                length++;
                count ++;
            } else {
                chars[cur_loc + 1] =  (char)count;
                cur_loc = i;
                count = 0;
            }
        }
        return length;
    }
    public static void main(String[] args) {
//        String[] temp = new String[]{"a","a","b","b","c","c","c"};
//        int a = 1;
//        System.out.println((char)a - 56);
//        char[] chars = new char[5];
//        chars[0] = (char)1;
//        chars[1] = (char)1;
//        chars[2] = (char)1;
//        chars[3] = (char)1;
//        chars[4] = (char)1;
//        int a = 1;
//        char c = (char)a;
//        System.out.println((char)1);
//        for (char c1 : chars)
//            System.out.println(c1);


        int a = 1;

        char b = (char)(a + 48);
        char c=(char)a;
        System.out.println(b);
    }
}
