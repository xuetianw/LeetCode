import java.util.ArrayList;
import java.util.List;

public class Leetcode1108 {
    public String defangIPaddr(String address) {
        List<Integer> index_list = new ArrayList<>();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                index_list.add(i);
            }
        }

        for (int i = index_list.size() - 1; i >= 0; i--) {
            int location = index_list.get(i);
            address = String.format(address.substring(0, location), "[.]", address.substring(location + 1));
        }
        return address;
    }

    public static void main(String[] args) {
        Leetcode1108 leetcode1108 = new Leetcode1108();
        leetcode1108.defangIPaddr("1.1.1.1");
    }
}
