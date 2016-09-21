package niuke;

/**
 * Created by lon on 16-5-19.
 */
public class Jump {
    public int JumpFloor(int target){
        if(target<=0)return 0;
        if(target==1)return 1;
        int [] array = new int[target+1];
        array[0]=0;
        array[1]=1;
        return helper(array,target);
    }

    private int helper(int[] array, int target) {
        if(target==0)return 0;
        if(target==1)return 1;
        if(array[target]!=0)return array[target];
        for(int i = 1;i<target;i++){
            if(array[i]==0){
                array[i]=helper(array,i);
                System.out.println("i: "+i + " "+array[i]);
            }
            array[target] += array[i];
        }
        array[target]++;
        return array[target];
    }

    public static void main(String[] args) {
        int ret = new Jump().JumpFloor(3);
        System.out.println(ret);
    }

}
