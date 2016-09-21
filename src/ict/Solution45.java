package ict;

/**
 * Created by lon on 16-4-29.
 */
public class Solution45 {
    public static void main(String[] args) {
        int [] array = {3,4,3,1,0,7,0,3,0,2,0,3};
        int ret = new Solution45().jump(array);
        System.out.println(ret);
    }
    public int jump(int[] nums) {
        if(nums==null || nums.length<=1)return 0;
        int step =0;
        int reachNow = 0;
        int reachMax = reachNow;
        for(int i =0;i<nums.length-1;i++){
            if(i + nums[i]>reachMax){
                reachMax=i+nums[i];
            }
            if(reachMax>=nums.length-1)
                return step;

            if(i>=reachNow){
                step++;
                reachNow=reachMax;
                if(reachNow>=nums.length-1)
                    return step;
            }
        }
        return step;
    }

    static int jump1(int [] nums){
        if(nums==null || nums.length==0)return 0;
        int step = 0 ;
        int reachNow = 0;
        int reachMax = reachNow;
        for (int i = 0; i <nums.length ; i++) {
            if(i+nums[i]>reachMax)
                reachMax = i + nums[i];
            if(reachMax>=nums.length-1)
                return step;
            if(i>=reachNow){
                step++;
                reachNow= reachMax;
                if(reachNow >= nums.length-1)
                    return step;
            }
        }
        return step;
    }
}
