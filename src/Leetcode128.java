import java.util.Arrays;

public class Leetcode128 {
    private static class Sequence{
        int i1;
        int i2;
    }

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            int i2 = i + 1;
            while (i2 < nums.length && nums[i2] == nums[i2 - 1] + 1) {
                i2++;
            }
            int len = i2 - i;
            res = Math.max(len, res);
            i = i2;
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode128 leetcode128 = new Leetcode128();
        leetcode128.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
    }
}
