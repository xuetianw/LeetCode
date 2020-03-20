package DynamicProgramming;

public class Leetcode746 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) return 0;
        if (cost.length == 1) return cost[0];
        if (cost.length == 2) return Math.max(cost[0], cost[1]);
        int[] res_arr = new int[cost.length];
        res_arr[0] = cost[0];
        res_arr[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int option1 = res_arr[i - 2] ;
            int option2 = res_arr[i - 1];
            res_arr[i] = Math.min(option1, option2) + cost[i];
        }
        return res_arr[res_arr.length - 1];
    }

    public static void main(String[] args) {
        Leetcode746 leetcode746 = new Leetcode746();
        leetcode746.minCostClimbingStairs(new int[] {0,0,1,1});
    }
}
