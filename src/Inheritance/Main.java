package Inheritance;

import java.util.stream.Stream;

// Driver class
class Main {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();

        System.out.println(Stream.of("green", "yellow","blue")
                .max((s1, s2) -> s1.compareTo(s2))
                .filter(s->s.endsWith("n"))
                .orElse("yellow"));
        int x = 5;
    }
}