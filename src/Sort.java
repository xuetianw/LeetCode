import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    private static void sortCarsByMake(Car[] cars) {
        Comparator<Car> makeSorter = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getMake().compareTo(car2.getMake());
            }
        };

                Arrays.sort(cars, makeSorter);
//

//        java.util.Collections.sort(cars, makeSorter);
    }
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
//        int[][] arr = {13, 7, 6, 45, 21, 9, 101, 102};


//        Arrays.sort(arr, (arr1, arr2) ->
//                Integer.compare(arr1[0], arr2[0]));
//
//        System.out.printf("Modified arr[] : %s",
//                Arrays.toString(arr));
    }
}
