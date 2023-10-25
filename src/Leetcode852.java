import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcode852 {

    public int peakIndexInMountainArray(int[] arr) {
        int peakIndex = 0;
        int peakHeight = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int i2 = i + 1;
            while (i2 < arr.length && arr[i2] > arr[i2 - 1]) {
                i2++;
            }
            if (arr[i2 - 1] > peakHeight) {
                peakHeight = arr[i2 - 1];
                peakIndex = i2 - 1;
            }
            i = i2;
        }

//        if (arr[i] > peakHeight) {
//                peakHeight = Math.max(arr[i], peakHeight);
//                peakIndex = i;
//            }
        return peakIndex;
    }

    public static void main(String[] args) {
        Leetcode852 leetcode852 = new Leetcode852();
        leetcode852.peakIndexInMountainArray(new int[]{0, 2, 1, 0});
    }

}
