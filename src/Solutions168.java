public class Solutions168 {
    public String convertToTitle(int n) {
        char base = 'A';
        StringBuilder title = new StringBuilder();
        do {
            title.insert(0, (char) ((int) base + (n % 26) - 1));
            n = n / 26;
        } while (n != 0);

        return title.toString();
    }

    public static void main(String[] args) {
        Solutions168 solutions168 = new Solutions168();
        solutions168.convertToTitle(1);
    }
}
