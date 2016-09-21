package google;

import java.util.Scanner;

/**
 * Created by lon on 16-8-28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = scanner.nextInt();
        for (int i = 0; i <caseNumber ; i++) {
            long ans = run(scanner.nextInt(),scanner.nextInt());
            output(i+1,ans);
        }
    }
    static long run(int left,int right){
        int min = Math.min(left,right);
        if(min<=0)return 0;
        if(min==1)return 1;
        return (long)min*(min+1)/2;
    }

    static void output(int index , long ans){
        System.out.println("Case #"+index+": " + ans);
    }
}
