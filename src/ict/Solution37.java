package ict;

/**
 * Created by lon on 16-8-29.
 */
public class Solution37 {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length==0)return;
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if(board[i][j]=='.') {
                    for (char k = '0'; k <='9'; k++) {
                        if(isvalid(board,i,j,k)){
                            board[i][j]=k;
                            if(solve(board))return true;
                            else
                                board[i][j]='.';
                        }
                    }
                }else return false;
            }
        }
        return false;
    }

    private boolean isvalid(char[][] board,int i ,int j, char c) {
        //Check colum
        for(int row = 0; row < 9; row++)
            if(board[row][j] == c)
                return false;

        //Check row
        for(int col = 0; col < 9; col++)
            if(board[i][col] == c)
                return false;

        //Check 3 x 3 block
        for(int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for(int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if(board[row][col] == c)
                    return false;
        return true;
    }

}
