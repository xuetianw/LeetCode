import java.util.Properties;

public class HashPractise {
    // Main method
    public static void main(String[] args)
    {

        // Create a properties and add some values
        Properties properties = new Properties();
        properties.put("Pen", 10);
        properties.put("Book", 500);
        properties.put("Clothes", 400);
        properties.put("Mobile", 5000);

        // Print Properties details
        System.out.println("Properties: "
                + properties.toString());

        // Getting the value of Pen
        System.out.println("Value of Pen: "
                + properties
                .getOrDefault("Pen", 200));

        // Getting the value of Phone
        System.out.println("Value of Phone: "
                + properties
                .getOrDefault("Phone", 200));
    }
}
