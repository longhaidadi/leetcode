package niuke;

/**
 * Created by lon on 16-5-17.
 */
public class MinNumberInRotateArray {
    public static void main(String[] args) {
        int [] array = {1,0,1,1,1,1};
        System.out.println(new MinNumberInRotateArray().minNumberInRotateArray(array));
    }
    public int minNumberInRotateArray(int [] array) {
        if(array==null)return -1;
        int index1 = 0;
        int index2 = array.length-1;
        int indexMid = index1;
        while (array[index1]<=array[index2]){
            if(array[index1]>=array[index2] && index2-index1==1){
                indexMid=index2;
                break;
            }

            if(array[index1]==array[indexMid] && array[indexMid]==array[index2])
                return getMin(array,index1,index2);
            if(array[index1]<=array[indexMid])
                index1= indexMid;
            else if(array[index2]>=array[indexMid])
                index2=indexMid;
        }
        return array[indexMid];
    }
    private int getMin(int [] array , int left ,int right){
        int ret = array[left];
        for(int i = left+1;i<=right;i++)
            ret = Math.min(ret,array[i]);
        return ret;
    }
}
