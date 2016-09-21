package test;

import java.util.Scanner;

/**
 * Created by lon on 16-4-6.
 */
public class Main {
    public static void main(String[] args) {

        int N = 0;
        int [] array = new int[4];

        Scanner in=new Scanner(System.in);
        System.out.println("N");
        N = in.nextInt();
        System.out.println("four number");
        for(int j = 0 ; j<N;j++) {
            for (int i = 0; i < 4; i++) {
                String line = in.next();
                array[i] = Integer.parseInt(line);
            }
            String line = in.next();
            String [] arrayLine = line.split(" ");
            int [] array1 = new int[arrayLine.length];
            for(int i = 0 ; i< arrayLine.length;i++){
                array1[i]=Integer.parseInt(arrayLine[i]);
            }

            Main test1 = new Main();

            System.out.println(test1.solution(array1.length, array, array1));
        }
    }
    public int solution(int N ,int[] array ,int[] array1){
        int sum  = 0;
        for(int i =0;i<N;i++)
            sum += array1[i];
        int x = (int) Math.sqrt(array[1]*array[2]*array[3]/sum);
        int sum1 = 0;
        int size = x+1;
        for(;size>0;size--){
            int a = array[2]/size;
            for(int i =0;i<N;i++)
                if(array1[i]%a==0)
                    sum1 += array1[i]/a;
                else sum1 += array1[i]/a+1;
            if (sum1 <= array[1]*(array[3]/size))
                break;
        }
        return  size;
    }
}
