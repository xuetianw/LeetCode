package Jackson;

import java.util.List;

public class User {
    public int id;
    public String name;
    public List<Item> userItems;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}