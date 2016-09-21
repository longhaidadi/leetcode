package ict.findNumber;

/**
 * Created by lon on 16-3-12.
 */
public class FindOneRepeated {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,1};
        solution(array);
    }

    public static void solution(int [] array){
        if(array==null || array.length<=1) return;
        int result = array[0];
        for(int i =1;i<array.length;i++){
            result ^= i;
            System.out.println(result);
            result ^= array[i];
            System.out.println(result);
            System.out.println("******************");
        }

    }
}
