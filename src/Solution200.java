class Solution200 {


    void dfs(int i, int j, char[][] grid) {
        int height = grid.length;
        int weigth = grid[0].length;

        if (i >= 0 && i < height &&
                j >= 0 && j < weigth) {
            if (grid[i][j] == '1') {
                grid[i][j] = '0';
                dfs (i + 1, j, grid);
                dfs (i, j + 1, grid);
                dfs (i - 1, j, grid);
                dfs (i, j - 1, grid);
            } else {
                return;
            }
        } else {
            return;
        }
    }


    public int numIslands(char[][] grid) {
        int height = grid.length;
        int weigth = grid[0].length;


        int numer_of_island = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weigth; j++) {
                if (grid[i][j] == '1') {
                    numer_of_island++;
                    dfs(i, j, grid);
                }
            }
        }
        return numer_of_island;
    }

    public static void main(String[] args) {
        char arr[][] =
                {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};

        Solution200 solution200 = new Solution200();
        System.out.println(solution200.numIslands(arr));
    }
}
