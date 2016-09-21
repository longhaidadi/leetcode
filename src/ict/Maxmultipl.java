package ict;

/**
 * Created by lon on 16-3-6.
 */
public class Maxmultipl {

    public int solution(int [] array){
        if(array==null || array.length==0) return 0;
        int retMaxProduct = array[0];
        int [] max = new int[array.length];
        int [] min = new int[array.length];
        max[0]= array[0];
        min[0]= array[0];
        for(int i =1;i<array.length;i++){
            max[i] = MaxThree(array[i],max[i-1]*array[i],min[i-1]*array[i]);
            min[i] = MinThree(array[i],max[i-1]*array[i],min[i-1]*array[i]);
            if(max[i]>retMaxProduct)
                retMaxProduct=max[i];
        }

        return retMaxProduct;

    }

    public static int MaxThree(int a , int b,int c){
        return Math.max(a, Math.max(b, c));
    }

    public static int MinThree(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
    public static void main(String[] args) {

    }
}
