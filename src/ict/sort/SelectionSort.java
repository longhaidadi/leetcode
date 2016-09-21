package ict.sort;


/**
 * Created by lon on 16-5-12.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int array [] = {1,3,5,2,4,6};
        new SelectionSort().selectionSort(array, 0, array.length - 1);
        for(int a : array)
            System.out.println(a);
    }

    public void selectionSort(int [] array , int left ,int right){
        if(array==null)return;
        for(int i  =left; i<right+1;i++){
            int minPos = i;
            for(int j = i+1;j<right+1;j++){
                if(array[j]<array[minPos])
                    minPos=j;
            }
            int temp = array[i];
            array[i]=array[minPos];
            array[minPos]=temp;
        }
    }
}
