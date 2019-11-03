import java.util.ArrayList;
import java.util.List;

public class coding_problem12 {
    public static String defangIPaddr(String address) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = address.length() - 1; i >= 0 ; i--) {
            if (address.charAt(i) == '.') {
                indexList.add(i);
            }
        }

        for (int i = 0; i < indexList.size(); i ++) {
            String leftString = address.substring(0, indexList.get(i));
            String rightString = address.substring(indexList.get(i) + 1);
            address = leftString + "[.]" + rightString;
        }
        return address;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        String str = "0bc";
        System.out.println(str.substring(0, 0));
        System.out.println(str.substring(1));

    }
}
