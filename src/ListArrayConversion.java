import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args)
    {
        List<String> list = new LinkedList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Practice");

        String[] arr = new String[4];

//        Convert List to Array of String
        arr = list.toArray(arr);

        for (String x : arr)
            System.out.print(x + " ");

        list = Arrays.asList(arr);

        // printing the list
        System.out.println("The list is: " + list);


        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        Integer[] intArray = new Integer[intList.size()];
        intArray = intList.toArray(intArray);

        for(Integer i : intArray)
            System.out.println(i);

        String[] stringArray = {"item 1", "item 2", "item 3", "item 4"};
        List<String> stringList = Arrays.asList(stringArray);

        for (String listItem : stringList) {
            System.out.println(listItem);
        }
    }
}
