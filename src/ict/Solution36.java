package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-3-23.
 */
public class Solution36 {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        boolean [] isVisited = new boolean[9];
        for(int i =0;i<9;i++){
            Arrays.fill(isVisited,false);
            for(int j =0;j<9;j++){
                if(!check(isVisited,board[i][j]))return false;
            }
        }

        for(int j =0;j<9;j++){
            Arrays.fill(isVisited,false);
            for(int i =0;i<9;i++){
                if(!check(isVisited,board[i][j]))return false;
            }
        }

        for(int i =0;i<9;i=i+3){
            for(int j =0;j<9;j=j+3){
                Arrays.fill(isVisited,false);
                for(int m = 0;m<3;m++){
                    for(int n =0;n<3;n++){
                        if(!check(isVisited,board[i+m][j+n]))return false;
                    }
                }
            }
        }
        return true;

    }
    private boolean check(boolean [] isVisited, char val){
        if(val=='.')return true;
        else if(val>='0' && val<='9'){
            if(isVisited[val-'0']==true)
                return false;
            else
                return true;
        }
        return false;
    }
}
