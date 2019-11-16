import java.util.*;

public class UrtheCase {

//    Original List = ['one', 'two', 'three',]
//    Add List = ['one', 'two', 'five', 'six]
//    Delete List = ['two', 'five']
//    Result List = ['three', 'six', 'one']

    public List<String> merge(List<String> original_list , List<String> add_list, List<String> delete_List ) {
        Set<String> set = new HashSet<>();

        for (String string : original_list) {
            set.add(string);
        }

        for (String string: add_list) {
            set.add(string);
        }

        for (String string : delete_List) {
            set.remove(string);
        }

        List<String> merger_list = new ArrayList<>();

        for (String string : set) {
            merger_list.add(string);
        }

        Collections.sort(merger_list, (string1, string2) -> {
            if (string1.length() == string2.length()) {
                return string2.compareTo(string1);
            }
            return string2.length() - string1.length();
        });

        return merger_list;
    }

    public static void main(String[] args) {
        UrtheCase urtheCase = new UrtheCase();

        List<String> Original = Arrays.asList("one", "two", "three", "c", "a", "b");
        List<String> Add = Arrays.asList ("");
        List<String> Delete = Arrays.asList("");
        System.out.println(urtheCase.merge(Original, Add, Delete));
    }
}
