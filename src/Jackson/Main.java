package Jackson;

public class Main {
    public static void main() {

        User user = new User(1, "John");
        Item item = new Item(2, "book", user);
//        user.addItem(item);
//
//        new ObjectMapper().writeValueAsString(item);
    }
}
