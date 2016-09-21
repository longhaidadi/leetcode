package ict;

/**
 * Created by lon on 16-3-27.
 */
public class Solution96 {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {
        int [] array = new int[n+1];
        for(int i =0;i<=n;i++){
            if(i<=3)
                array[i]=i;
            else{
                for(int j =1;j<i;j++){
                    array[i] += array[j-1]*array[i-j];
                }
            }
        }
        return array[n];
    }
    
    public int numTrees1(int n){
        int [] array = new int[n+1];
        for (int i = 0; i <n+1 ; i++) {
            if(i<=3)
                array[i] = i;
            else{
                for (int j = 0; j <i ; j++) {
                    array[i] += array[j-1] * array[i-j];
                }
            }
        }
        return array[n];
    }
}
