public class Leetcode289 {
    /*
[ [ top_left, top,  top_right ]
  [ left,     5,    right]
  [bottom_left, bottom, bottom_right]  ]
*/
    int count_live_cells(int row, int colum, int[][] board) {
        int[][] dir_arr = new int[][]
                {
                        {row - 1, colum - 1},//top_left
                        {row - 1, colum    },//top
                        {row - 1, colum + 1},//top_right
                        {row,    colum - 1},//left
                        {row,     colum + 1},//right
                        {row + 1, colum - 1},//bottom_left
                        {row + 1, colum    },//bottom
                        {row + 1, colum + 1},//bottom_right
                };


        int count = 0;
        for (int i = 0; i < dir_arr.length; i++) {
            int[] temp = dir_arr[i];
            if ((dir_arr[i][0] >= 0 && dir_arr[i][0] < board.length)
                    && (dir_arr[i][1] >= 0 && dir_arr[i][1] < board[0].length) ) {
                if (board [dir_arr[i][0]] [dir_arr[i][1]] == 1) {
                    count++;
                }
            }
        }


        return count;
    }
    // if cell transfer from cell to dies -1
    // if cell transfer from dead to live -2
    public void gameOfLife(int[][] board) {
        if (board.length == 0) return;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int cell = board[i][j];
                if (cell == 0) {
                    int live_cells = count_live_cells(i, j, board);
                    if (live_cells == 3) {//three live neighbors becomes a live cell,
                        board[i][j] = -2 ;
                    }
                } else if (cell == 1) {
                    int live_cells = count_live_cells(i, j, board);
                    //with fewer than two live neighbors dies
                    //with more than three live neighbors dies
                    if (live_cells < 2 || live_cells > 3) {
                        board[i][j] = -1 ;
                    }
                }
            }
        }
        update_board(board);
    }

    void update_board(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int[] row = board[i];
            for (int j = 0; j < row.length; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == -2) {
                    board[i][j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Leetcode289 leetcode289 = new Leetcode289();
        leetcode289.gameOfLife(new int [][] {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        });
    }
}
