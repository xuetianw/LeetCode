package Array;

public class Leetcode1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];

        double slope = ((double)y2 - y1) / (x2 - x1);
        for (int i = 1; i < coordinates.length - 1; i++) {
            int x1_ = coordinates[i][0];
            int x2_ = coordinates[i + 1][0];
            int y1_ = coordinates[i][1];
            int y2_ = coordinates[i + 1][1];
            double slope_ = ((double)y2_ - y1_) / (x2_ - x1_);
            if(slope != slope_) {
                return false;
            }
        }
        return true;
    }
}
