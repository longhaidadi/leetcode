package ict;

/**
 * Created by lon on 16-7-29.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution89 {
    public List<Integer> grapCode(int n){
        List<Integer> ret = new ArrayList<>();
        int size = 1<<n;
        for (int i = 0; i <size; i++) {
            ret.add(((i>>1)^i));
        }
        return ret;
    }
    public List<Integer> grapCode1(int n){
        List<Integer> list = new ArrayList<>();
        int size = 1<<n;
        for (int i = 0; i <size ; i++) {
            list.add((i>>i)^i);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new Solution89().grapCode(4);
        System.out.println(list);
    }
}
