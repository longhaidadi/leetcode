package niuke;

/**
 * Created by lon on 16-6-1.
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int left = getleftPos(array,k,0,array.length-1);
        int right = getrightPos(array,k,0,array.length-1);
        return right-left;
    }
    public int getleftPos(int[]array , int k,int start,int end){
        if(start>end)return -1;
        int mid = start+((end-start)>>1);
        if(array[mid]==k){
            if(mid==start||(mid-1)>=start&&array[mid-1]!=k)
                return mid;
            else
                return getleftPos(array,k,start,mid-1);
        }else if(array[mid]<k){
            return getleftPos(array,k,mid+1,end);
        }else
            return getleftPos(array,k,start,mid-1);
    }

    public int getrightPos(int[]array , int k,int start,int end){
        if(start>end)return -1;
        int mid = start+((end-start)>>1);
        if(array[mid]==k){
            if(mid==end||(mid+1)<=end&&array[mid+1]!=k)
                return mid;
            else
                return getrightPos(array, k, mid + 1, end);
        }else if(array[mid]<k){
            return getrightPos(array, k, mid + 1, end);
        }else
            return getrightPos(array, k, start, mid - 1);
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,3,3,3,4,5};
        int k = 3;
        int ret = new GetNumberOfK().GetNumberOfK(array,k);
        System.out.println(ret);
    }
}
