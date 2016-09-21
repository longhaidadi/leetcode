package aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lon on 16-8-28.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int W=s.nextInt();
        int item_num=s.nextInt();
        int [] weights = new int[item_num];
        for(int i=0;i<item_num;i++){
            weights[i]=s.nextInt();
        }
        int [] val = new int[item_num];

        for(int i=0;i<item_num;i++){
            val[i]=s.nextInt();
        }
        System.out.println(knapsack(val,weights, W));
    }

    public static int knapsack(int val[], int wt[], int W) {
        //Get the total number of items.
        //Could be wt.length or val.length. Doesn't matter
        int N = wt.length;

        //Create a matrix.
        //Items are in rows and weight at in columns +1 on each side
        int[][] V = new int[N + 1][W + 1];

        //What if the knapsack's capacity is 0 - Set
        //all columns at row 0 to be 0
        for (int col = 0; col <= W; col++) {
            V[0][col] = 0;
        }

        //What if there are no items at home.
        //Fill the first row with 0
        for (int row = 0; row <= N; row++) {
            V[row][0] = 0;
        }

        for (int item=1;item<=N;item++){
            //Let's fill the values row by row
            for (int weight=1;weight<=W;weight++){
                //Is the current items weight less
                //than or equal to running weight
                if (wt[item-1]<=weight){
                    //Given a weight, check if the value of the current
                    //item + value of the item that we could afford
                    //with the remaining weight is greater than the value
                    //without the current item itself
                    V[item][weight]=Math.max (val[item-1]+V[item-1][weight-wt[item-1]], V[item-1][weight]);
                }
                else {
                    //If the current item's weight is more than the
                    //running weight, just carry forward the value
                    //without the current item
                    V[item][weight]=V[item-1][weight];
                }
            }

        }



        return V[N][W];
    }

}
