public class Lambda {
    interface FuncInterface
    {
        // An abstract function
        int abstractFun(int x);

        // A non-abstract (or default) function
        default void normalFun()
        {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = x -> (2 * x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
    }
}