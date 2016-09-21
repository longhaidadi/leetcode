package saima;

import java.util.Scanner;

/**
 * Created by lon on 16-8-30.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            int ans = helper(num);
            System.out.println(ans);
        }
    }
    static int helper(int num){
        int price = 1;
        int i=2;int j=3;
        for(int m=1;m<num;m++){
            if(m==i){
                price--;
                i=i+j;
                j++;
            }
            else{
                price++;
            }

        }
        return price;
    }
}
