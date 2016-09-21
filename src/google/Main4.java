package google;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lon on 16-8-28.
 */
import java.util.List;
public class Main4 {
    static List<int[]> list =new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = scanner.nextInt();
        for (int i = 0; i <caseNumber ; i++) {
            long ans = run(scanner.nextInt(),scanner.nextInt());
            output(i+1,ans);
        }
    }
    static long run(int N,int M){
        list.clear();
        int [] buffer = new int[N];
        for (int i = 0; i <N ; i++) {
            buffer[i]=i;
        }
        perm(buffer,0,N-1);
        long ans = 0;
        for (int[] array : list) {
            int t = one(array);
            System.out.println("t " +t );
            ans += t*t;
        }
        return ans%M;
    }
    static int one(int [] array){
        int ans = 1;
        int max = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]>array[i-1] && array[i]>max){
                ans++;
                max = array[i];
            }
        }
        return ans;
    }
    public static void perm(int[] buf,int start,int end){
        if(start==end){//当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可
            list.add(Arrays.copyOf(buf,buf.length));
        }
        else{//多个字母全排列
            for(int i=start;i<=end;i++){
                int temp=buf[start];//交换数组第一个元素与后续的元素
                buf[start]=buf[i];
                buf[i]=temp;

                perm(buf,start+1,end);//后续元素递归全排列

                temp=buf[start];//将交换后的数组还原
                buf[start]=buf[i];
                buf[i]=temp;
            }
        }
    }
    static void output(int index , long ans){
        System.out.println("Case #"+index+": " + ans);
    }

}
