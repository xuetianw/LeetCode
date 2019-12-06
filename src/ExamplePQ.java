import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ExamplePQ {
    public static void main(String args[])
    {
//         Creating empty priority queue
        PriorityQueue<String> pQueue =
                new PriorityQueue<>();

        // Adding items to the pQueue using add()
        pQueue.add("C");
        pQueue.add("b");

        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");
        pQueue.add("a");
        pQueue.add("c");
        pQueue.add("A");
        pQueue.add("B");

        while (!pQueue.isEmpty())
            System.out.println(pQueue.poll());

        // A custom comparator that compares two Strings by their length.
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        /*
        The above Comparator can also be created using lambda expression like this =>
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };

        Which can be shortened even further like this =>
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        */

        // Create a Priority Queue with a custom Comparator
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }




        PriorityQueue<Integer> pQueue2 =
                new PriorityQueue<>();

        pQueue2.add(1);
        pQueue2.add(4);
        pQueue2.add(3);
        pQueue2.add(2);
        System.out.println(pQueue2.poll());
        System.out.println(pQueue2.poll());
        System.out.println(pQueue2.poll());


//        // Printing the most priority element
//        System.out.println("Head value using peek function:"
//                + pQueue.peek());
//
//        // Printing all elements
//        System.out.println("The queue elements:");
//        Iterator itr = pQueue.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());
//
//        // Removing the top priority element (or head) and
//        // printing the modified pQueue using poll()
//        pQueue.poll();
//        System.out.println("After removing an element" +
//                "with poll function:");
//        Iterator<String> itr2 = pQueue.iterator();
//        while (itr2.hasNext())
//            System.out.println(itr2.next());
//
//        // Removing Java using remove()
//        pQueue.remove("Java");
//        System.out.println("after removing Java with" +
//                " remove function:");
//        Iterator<String> itr3 = pQueue.iterator();
//        while (itr3.hasNext())
//            System.out.println(itr3.next());
//
//        // Check if an element is present using contains()
//        boolean b = pQueue.contains("C");
//        System.out.println ( "Priority queue contains C " +
//                "or not?: " + b);
//
//        // Getting objects from the queue using toArray()
//        // in an array and print the array
//        Object[] arr = pQueue.toArray();
//        System.out.println ( "Value in array: ");
//        for (int i = 0; i<arr.length; i++)
//            System.out.println ( "Value: " + arr[i].toString()) ;
    }
}
