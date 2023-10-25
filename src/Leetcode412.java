import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Leetcode412 {
    String checkNum(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return "" + num;
    }

    public List<String> fizzBuzz(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        IntStream.range(1, n + 1).forEach(x -> arrayList.add(checkNum(x)));
        return arrayList;
    }

}
