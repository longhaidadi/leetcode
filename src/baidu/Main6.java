package baidu;

import java.util.*;

/**
 * Created by lon on 16-5-22.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = Integer.parseInt(scanner.nextLine());
        int [] array = new int[caseNum];
        for(int i = 0;i<caseNum;i++){
            array[i]=scanner.nextInt();
        }
        findMedia(array,caseNum);
    }
    public static void findMedia(int [] array ,int len){
        if(array==null || array.length==0)return;
        int [] newArray = Arrays.copyOf(array,array.length);
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        Arrays.sort(array);
        for(int i =0;i<array.length;i++)
            map.put(array[i],i);
        for(int i = 0;i<len-1;i++){
            int t = map.get(newArray[i]);
            if(t<(len>>1)) System.out.print((t + 1) + "\t");
            else System.out.print((len-t)+"\t");
        }
        System.out.println(len-map.get(newArray[len-1]));

    }
}
