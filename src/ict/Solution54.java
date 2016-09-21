package ict;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by lon on 16-4-28.
 */
public class Solution54 {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ret = new ArrayList<>();
        if(matrix==null)return ret;
        int row = matrix.length;
        if(row==0)return ret;
        int col = matrix[0].length;
        int x =0;
        int y = 0;
        while (row>0 && col >0 ){
            if(row==1){
                for(int i = 0;i<col;i++){
                    ret.add(matrix[x][y++]);
                }
            }else if (col==1){
                for(int i = 0;i<row;i++){
                    ret.add(matrix[x++][y]);
                }
            }
            for(int i =0;i<col;i++)
                ret.add(matrix[x][y++]);
            for(int i =0;i<row;i++)
                ret.add(matrix[x++][y--]);
            for(int i =0;i<col;i++)
                ret.add(matrix[x][y--]);
            for(int i =0;i<row;i++)
                ret.add(matrix[x--][y]);
            x++;
            y++;
            row -= 2;
            col -= 2;

        }
        return ret;
    }
}
